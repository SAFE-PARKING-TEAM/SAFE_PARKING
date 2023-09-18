package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.UsuarioDTO;
import pe.edu.upc.aaw.safeparking.entities.Usuario;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IUsuarioService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;
    @PostMapping
    @PreAuthorize("hasAuthority('administrador')")
    public void registrar(@RequestBody UsuarioDTO dto){
        ModelMapper m = new ModelMapper();
        Usuario u=m.map(dto, Usuario.class);
        uS.insert(u);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('administrador')")
    public List<UsuarioDTO> listar(){

        return uS.list().stream().map(x->{

            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());

    }
}
