package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.HorarioDTO;
import pe.edu.upc.aaw.safeparking.entities.Horario;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IHorarioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/horarios")
public class HorarioController {
    @Autowired
    private IHorarioService hS;
    @PostMapping("Registrar")
    @PreAuthorize("hasAuthority('administrador')  or  hasAuthority('arrendador')")
    public void registrar(@RequestBody HorarioDTO dto){
        ModelMapper m=new ModelMapper();
        Horario h=m.map(dto,Horario.class);
        hS.insert(h);
    }
    @GetMapping("Listar")
    @PreAuthorize("hasAuthority('administrador')  or hasAuthority('conductor') or hasAuthority('arrendador')")
    public List<HorarioDTO> listar(){
        return hS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,HorarioDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("ListarporID/{id}")
    @PreAuthorize("hasAuthority('administrador')  or hasAuthority('conductor') or hasAuthority('arrendador')")
    public HorarioDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        HorarioDTO h= m.map(hS.listId(id), HorarioDTO.class);
        return h;
    }

    @PutMapping("Modificar")
    @PreAuthorize("hasAuthority('administrador')  or hasAuthority('arrendador')")
    public void modificar(@RequestBody HorarioDTO dto){
        ModelMapper m=new ModelMapper();
        Horario h=m.map(dto, Horario.class);
        hS.insert(h);
    }
    @DeleteMapping("Eliminar/{id}")
    @PreAuthorize("hasAuthority('administrador') ")
    public void eliminar(@PathVariable("id")Integer id){
        hS.delete(id);
    }
}