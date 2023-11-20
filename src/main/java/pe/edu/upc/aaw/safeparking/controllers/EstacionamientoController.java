package pe.edu.upc.aaw.safeparking.controllers;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.EstacionamientoDTO;
import pe.edu.upc.aaw.safeparking.entities.Estacionamiento;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IEstacionamientoService;



import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estacionamientos")
public class EstacionamientoController {
    @Autowired
    private IEstacionamientoService eS;

    @PostMapping("Registrar")
    //@PreAuthorize("hasAuthority('administrador')  or hasAuthority('arrendador')")
    public void registrar(@RequestBody EstacionamientoDTO dto){
        ModelMapper m=new ModelMapper();
        Estacionamiento d=m.map(dto,Estacionamiento.class);
        eS.insert(d);
    }
    @GetMapping("Listar")
    //@PreAuthorize("hasAuthority('administrador')  or hasAuthority('conductor')")
    public List<EstacionamientoDTO> listar(){
        return eS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,EstacionamientoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("ListarporID/{id}")
    //@PreAuthorize("hasAuthority('conductor') or hasAuthority('administrador')")
    public EstacionamientoDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        EstacionamientoDTO e= m.map(eS.listId(id), EstacionamientoDTO.class);
        return e;
    }
    @PutMapping("Modificar")
    // @PreAuthorize("hasAuthority('administrador')  or hasAuthority('arrendador')")
    public void modificar(@RequestBody EstacionamientoDTO dto){
        ModelMapper m=new ModelMapper();
        Estacionamiento d=m.map(dto, Estacionamiento.class);
        eS.insert(d);
    }

    @DeleteMapping("Eliminar/{id}")
    // @PreAuthorize("hasAuthority('administrador')")
    public void eliminar(@PathVariable("id")Integer id){
        eS.delete(id);
    }
}