package hn.unah.matricula.Dtos;

import lombok.Data;

@Data

public class DocenteDTO {

    private String nombre;
    
    private String apellido;

    private String correo;
    
    private String especilizacion; 

    private String contraseña;

    private boolean sexo;

    private String departamento;

    private String foto;
}
