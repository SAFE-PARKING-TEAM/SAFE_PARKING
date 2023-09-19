package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.HorarioEstacionamientoDTO;
import pe.edu.upc.aaw.safeparking.entities.HorarioEstacionamiento;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IHorarioEstacionamientoService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/horarioEstacionamiento")
public class HorarioEstacionamientoController {
    @Autowired
    private IHorarioEstacionamientoService heS;
    @PostMapping
    @PreAuthorize("hasAuthority('arredador')"  )
    public void registrar(@RequestBody HorarioEstacionamientoDTO dto){
        ModelMapper m=new ModelMapper();
        HorarioEstacionamiento he=m.map(dto,HorarioEstacionamiento.class);
        heS.insert(he);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('conductor') or hasAuthority('arrendador') or hasAuthority('administrador')")
    public List<HorarioEstacionamientoDTO> listar(){
        return heS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,HorarioEstacionamientoDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping
    @PreAuthorize("hasAuthority('arredador')" )
    public void modificar(@RequestBody HorarioEstacionamientoDTO dto){
        ModelMapper m=new ModelMapper();
        HorarioEstacionamiento he=m.map(dto, HorarioEstacionamiento.class);
        heS.insert(he);
    }

    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('arredador')" )
    public void eliminar(@PathVariable("id")Integer id){
        heS.delete(id);
    }
}
