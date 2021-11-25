package ucundi.edu.co.application.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor


@Table(name = "Servicio")
public class Servicio implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    @Column(name="service_name")
    private String name;

    @NonNull
    @Column(name="service_description")
    private String description;

    @NonNull
    @Column(name = "service_price")
    private Integer price;

/*     @OneToOne(mappedBy = "servicio", cascade = CascadeType.ALL)
    private Produccion produccion; */

}