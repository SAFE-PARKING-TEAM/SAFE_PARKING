package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.ComentarioDTO;
import pe.edu.upc.aaw.safeparking.dtos.HorarioEstacionamientoDTO;
import pe.edu.upc.aaw.safeparking.entities.HorarioEstacionamiento;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IHorarioEstacionamientoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/horarioEstacionamientos")
public class HorarioEstacionamientoController {

    @Autowired
    private IHorarioEstacionamientoService heS;

    @PostMapping("Registrar")
    @PreAuthorize("hasAuthority('arrendador')  or hasAuthority('administrador')" )
    public void registrar(@RequestBody HorarioEstacionamientoDTO dto){
        ModelMapper m=new ModelMapper();
        HorarioEstacionamiento he=m.map(dto,HorarioEstacionamiento.class);
        heS.insert(he);
    }
    @GetMapping("Listar")
    @PreAuthorize("hasAuthority('conductor') or hasAuthority('arrendador') or hasAuthority('administrador')")
    public List<HorarioEstacionamientoDTO> listar(){
        return heS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,HorarioEstacionamientoDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping("Modificar")
    @PreAuthorize("hasAuthority('arrendador') or hasAuthority('administrador')" )
    public void modificar(@RequestBody HorarioEstacionamientoDTO dto){
        ModelMapper m=new ModelMapper();
        HorarioEstacionamiento he=m.map(dto, HorarioEstacionamiento.class);
        heS.insert(he);
    }

    @DeleteMapping("Eliminar/{id}")
    @PreAuthorize("hasAuthority('arrendador') or hasAuthority('administrador')" )
    public void eliminar(@PathVariable("id")Integer id){
        heS.delete(id);
    }
    @GetMapping("ListarporID/{id}")
    @PreAuthorize("hasAuthority('administrador') or hasAuthority('arrendador')")
    public HorarioEstacionamientoDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        HorarioEstacionamientoDTO he= m.map(heS.listId(id), HorarioEstacionamientoDTO.class);
        return he;
    }


}
