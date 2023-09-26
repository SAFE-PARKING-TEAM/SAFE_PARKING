package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.HorarioEstacionamientoDTO;
import pe.edu.upc.aaw.safeparking.entities.HorarioEstacionamiento;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IHorarioEstacionamientoService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/horarioEstacionamientos")
public class HorarioEstacionamientoController {
    @Autowired
    private IHorarioEstacionamientoService heS;

    public HorarioEstacionamientoController() {
    }

    public HorarioEstacionamientoController(IHorarioEstacionamientoService heS) {
        this.heS = heS;
    }

    @PostMapping("Registrar")
    public void registrar(@RequestBody HorarioEstacionamientoDTO dto){
        ModelMapper m=new ModelMapper();
        HorarioEstacionamiento he=m.map(dto,HorarioEstacionamiento.class);
        heS.insert(he);
    }
    @GetMapping("Listar")
    public List<HorarioEstacionamientoDTO> listar(){
        return heS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,HorarioEstacionamientoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("ListarporID/{id}")
    public HorarioEstacionamientoDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        HorarioEstacionamientoDTO he= m.map(heS.listId(id), HorarioEstacionamientoDTO.class);
        return he;
    }

    @PutMapping("Modificar")
    public void modificar(@RequestBody HorarioEstacionamientoDTO dto){
        ModelMapper m=new ModelMapper();
        HorarioEstacionamiento he=m.map(dto, HorarioEstacionamiento.class);
        heS.insert(he);
    }

    @DeleteMapping("Eliminar/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        heS.delete(id);
    }
}
