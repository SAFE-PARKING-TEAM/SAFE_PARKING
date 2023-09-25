package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.EstacionamientoDTO;
import pe.edu.upc.aaw.safeparking.dtos.UsuarioDTO;
import pe.edu.upc.aaw.safeparking.entities.Estacionamiento;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IEstacionamientoService;



import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estacionamiento")
public class EstacionamientoController {
    @Autowired
    private IEstacionamientoService eS;
    @PostMapping
    @PreAuthorize("hasAuthority('arrendador') or hasAuthority('administrador')")
    public void registrar(@RequestBody EstacionamientoDTO dto){
        ModelMapper m=new ModelMapper();
        Estacionamiento d=m.map(dto,Estacionamiento.class);
        eS.insert(d);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('administrador')")
    public List<EstacionamientoDTO> listar(){
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EstacionamientoDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    @PreAuthorize("hasAuthority('arrendador') or hasAuthority('administrador')")
    public void modificar(@RequestBody EstacionamientoDTO dto){
        ModelMapper m=new ModelMapper();
        Estacionamiento d=m.map(dto, Estacionamiento.class);
        eS.insert(d);
    }


    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('administrador')")
    public void eliminar(@PathVariable("id")Integer id){
        eS.delete(id);
    }


    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('administrador')")
    public EstacionamientoDTO listarrId(@PathVariable("id")Integer id){
        ModelMapper mo = new ModelMapper();
        EstacionamientoDTO e= mo.map(eS.listarrId(id), EstacionamientoDTO.class);
        return e;
    }

}




