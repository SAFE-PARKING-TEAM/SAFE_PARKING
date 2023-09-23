package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.RolDTO;
import pe.edu.upc.aaw.safeparking.entities.Role;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolController {
    @Autowired
    private IRolService rolR;
    @PostMapping("Registrar")
    @PreAuthorize("hasAuthority('administrador')")
    public void registrar(@RequestBody RolDTO dto){
        ModelMapper m=new ModelMapper();
        Role d=m.map(dto, Role.class);
        rolR.insert(d);
    }
    @GetMapping("Listar")
    @PreAuthorize("hasAuthority('administrador')")
    public List<RolDTO> listar(){
        return rolR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RolDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("Eliminar/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        rolR.delete(id);
    }

    @PutMapping
    @PreAuthorize("hasAuthority('administrador')")
    public void modificar(@RequestBody RolDTO dto){
        ModelMapper m=new ModelMapper();
        Role d=m.map(dto, Role.class);
        rolR.insert(d);
    }
}
