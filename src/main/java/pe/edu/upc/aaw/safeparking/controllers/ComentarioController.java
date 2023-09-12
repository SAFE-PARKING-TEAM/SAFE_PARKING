package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void Registrar(@RequestBody ComentarioDTO dto){
        ModelMapper m = new ModelMapper();
        Comentario c = m.map(dto, Comentario.class);
        cS.insert(c);

    }
    @GetMapping
    public List<ComentarioDTO> listar (){

        return cS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }
    @GetMapping("/{id}")
    public ComentarioDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ComentarioDTO c= m.map(cS.listarid(id),ComentarioDTO.class);
        return c;
    }
    @PutMapping
    public void modificar(@RequestBody ComentarioDTO dto){
        ModelMapper m = new ModelMapper();
        Comentario c = m.map(dto, Comentario.class);
        cS.insert(c);

    }
}
