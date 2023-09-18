package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.ComentarioDTO;
import pe.edu.upc.aaw.safeparking.entities.Comentario;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IComentarioService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private IComentarioService cS;
    @PostMapping
    @PreAuthorize("hasAuthority('administrador') or hasAuthority('conductor')")
    public void Registrar(@RequestBody ComentarioDTO dto){
        ModelMapper m = new ModelMapper();
        Comentario c = m.map(dto, Comentario.class);
        cS.insert(c);

    }
    @GetMapping
    @PreAuthorize("hasAuthority('administrador')or hasAuthority('conductor')")
    public List<ComentarioDTO> listar (){

        return cS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioDTO.class);
        }).collect(Collectors.toList());
    }

}
