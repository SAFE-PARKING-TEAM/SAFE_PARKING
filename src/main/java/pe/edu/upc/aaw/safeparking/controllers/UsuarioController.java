package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.UsuarioDTO;
import pe.edu.upc.aaw.safeparking.entities.Users;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IUsuarioService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;
    @PreAuthorize("hasAuthority('administrador')")
    @PostMapping
    public void registrar(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Users u=m.map(dto, Users.class);
        uS.insert(u);
    }
    @PreAuthorize("hasAuthority('administrador')")
    @GetMapping
    public List<UsuarioDTO> listar(){

        return uS.list().stream().map(x->{

            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());

    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('administrador')")
    public void eliminar(@PathVariable("id")Integer id){
        uS.delete(id);
    }
    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('administrador')")
    public UsuarioDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        UsuarioDTO u= m.map(uS.listId(id), UsuarioDTO.class);
        return u;
    }
    @PutMapping
    @PreAuthorize("hasAuthority('administrador')")
    public void modificar(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Users u=m.map(dto, Users.class);
        uS.insert(u);
    }
}
