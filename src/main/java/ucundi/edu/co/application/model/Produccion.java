package ucundi.edu.co.application.model;


import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor

@Table(name = "Produccion")

public class Produccion implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    @Column(name = "produccion_fecha")
    private Date fecha;
    
    @NonNull
    @Column(name = "precio_total")
    private Integer totalPrice;

    @OneToOne
    @JoinColumn(name = "FK_Service", updatable = false, nullable = false)
    private Servicio servicio;

    @OneToOne
    @JoinColumn(name = "FK_Vehicle", updatable = false, nullable = false)
    private Vehiculo vehiculo;

    @OneToOne
    @JoinColumn(name = "FK_Funcionario", updatable = false, nullable = false)
    private Funcionario funcionario;


}
