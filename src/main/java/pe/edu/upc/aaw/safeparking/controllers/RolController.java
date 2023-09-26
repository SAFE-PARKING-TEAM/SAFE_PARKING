package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.ReservaEstacionamientoDTO;
import pe.edu.upc.aaw.safeparking.dtos.RolDTO;
import pe.edu.upc.aaw.safeparking.entities.Rol;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolController {
    @Autowired
    private IRolService rolR;

    public RolController() {

    }

    public RolController(IRolService rolR) {
        this.rolR = rolR;
    }

    @PostMapping("Registrar")
    public void registrar(@RequestBody RolDTO dto){
        ModelMapper m=new ModelMapper();
        Rol d=m.map(dto, Rol.class);
        rolR.insert(d);
    }
    @GetMapping("Listar")
    public List<RolDTO> listar(){
        return rolR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RolDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("ListarporID/{id}")
    public RolDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        RolDTO rl= m.map(rolR.listId(id), RolDTO.class);
        return rl;
    }

    @DeleteMapping("Eliminar/{id}")
    @PreAuthorize("hasAuthority('administrador')")
    public void eliminar(@PathVariable("id")Integer id){
        rolR.delete(id);
    }

    @PutMapping("Modificar")
    public void modificar(@RequestBody RolDTO dto){
        ModelMapper m=new ModelMapper();
        Rol d=m.map(dto, Rol.class);
        rolR.insert(d);
    }
}
