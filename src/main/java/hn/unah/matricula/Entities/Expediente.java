package hn.unah.matricula.Entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "expediente")
public class Expediente {
    

    @Id
    @Column(name = "idexpediente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonManagedReference
    private int idExpediente;

    private String nombres;

    private String correo;

    private String apellidos;

    private boolean sexo;

    private String foto;

    @Column(name = "direccion")
    private String direccion;

    private boolean aceptado;

    @Column(name = "carreras")
    private String carrera;


}
