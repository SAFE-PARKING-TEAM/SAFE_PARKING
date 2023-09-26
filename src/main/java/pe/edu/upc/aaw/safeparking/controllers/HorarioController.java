package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.EstacionamientoDTO;
import pe.edu.upc.aaw.safeparking.dtos.HorarioDTO;
import pe.edu.upc.aaw.safeparking.entities.Horario;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IHorarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/horario")
public class HorarioController {
    @Autowired
    private IHorarioService hS;
    @PostMapping
    public void registrar(@RequestBody HorarioDTO dto){
        ModelMapper m=new ModelMapper();
        Horario h=m.map(dto,Horario.class);
        hS.insert(h);
    }
    @GetMapping
    public List<HorarioDTO> listar(){
        return hS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,HorarioDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("ListarporID/{id}")
    public HorarioDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        HorarioDTO h= m.map(hS.listId(id), HorarioDTO.class);
        return h;
    }

    @PutMapping
    public void modificar(@RequestBody HorarioDTO dto){
        ModelMapper m=new ModelMapper();
        Horario h=m.map(dto, Horario.class);
        hS.insert(h);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        hS.delete(id);
    }
}
