package hn.unah.matricula.Entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table(name = "carreras")
@Entity
public class Carreras {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcarrera")
    private int idCarrera;

    private String nombre;


    @Column(name = "cantidadestudiantes")
    private int cantidadestudiantes;

    @OneToOne
    private Docentes docentes;
 
    @ManyToMany(mappedBy = "carreras")
    private List<Clases> clases;
}
