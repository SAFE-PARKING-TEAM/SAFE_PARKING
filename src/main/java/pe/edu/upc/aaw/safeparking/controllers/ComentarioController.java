package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.ComentarioDTO;
import pe.edu.upc.aaw.safeparking.dtos.UsuarioDTO;
import pe.edu.upc.aaw.safeparking.entities.Comentario;
import pe.edu.upc.aaw.safeparking.entities.Usuario;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IComentarioService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private IComentarioService cS;

    public ComentarioController(IComentarioService cS) {
        this.cS = cS;
    }

    public ComentarioController() {
    }

    @PostMapping("Registrar")
    public void Registrar(@RequestBody ComentarioDTO dto){
        ModelMapper m = new ModelMapper();
        Comentario c = m.map(dto, Comentario.class);
        cS.insert(c);

    }
    @GetMapping("Listar")
    public List<ComentarioDTO> listar (){

        return cS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ComentarioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("Eliminar/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        cS.delete(id);
    }

    @GetMapping("ListarporID/{id}")
    public ComentarioDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ComentarioDTO c= m.map(cS.listId(id), ComentarioDTO.class);
        return c;
    }

    @PutMapping("Modificar")
    public void modificar(@RequestBody ComentarioDTO dto){
        ModelMapper m = new ModelMapper();
        Comentario c=m.map(dto, Comentario.class);
        cS.insert(c);
    }
}
