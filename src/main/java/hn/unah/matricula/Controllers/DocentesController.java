package hn.unah.matricula.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import hn.unah.matricula.Dtos.DatosDocentesDTO;
import hn.unah.matricula.Entities.Docentes;
import hn.unah.matricula.Services.impl.DocentesServiceImpl;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/matricula")
public class DocentesController {
    

    @Autowired
    private DocentesServiceImpl docentesServiceImpl;


    @Operation(summary = "Obtiene todos los docentes")
    @GetMapping("/docentes/obtener")    
    public List<Docentes> obtenerDocentes(){
        return this.docentesServiceImpl.obtenerDocentes();
    }

    @Operation(summary = "Verifica el login del docente")
    @PostMapping("/docente/verificacion")
    public boolean loginDocente(@RequestBody DatosDocentesDTO logindocente){
        return this.docentesServiceImpl.verificarDocente(logindocente);
    }

    @Operation(summary = "Guarda un docente")
    @PostMapping("/docente/guardar")
    public Docentes guardarDocente(@RequestParam("docente") String docente, @RequestParam("image") MultipartFile image){
        return this.docentesServiceImpl.crearDocente(docente, image);
    }

    @Operation(summary = "Obtiene un docente por id")
    @GetMapping("/docente/obtener/{id}")
    public Docentes obtenerDocentePorId(@PathVariable String id){
        return this.docentesServiceImpl.obtenerDocentePorId(id);
    }

    @Operation(summary = "Obtiene una lista de todos los coordinadoes")
    @GetMapping("/coordinadores")
    public List<Docentes> getCoordinadores() {
        return this.docentesServiceImpl.obtenerCoordinadores();
    }

    @Operation(summary = "obtiene un docente por su clave")
    @GetMapping("/docente/{clave}")
    public Docentes getDocentePorClave(@PathVariable String clave) {
        return this.getDocentePorClave(clave);
    }
    
}
