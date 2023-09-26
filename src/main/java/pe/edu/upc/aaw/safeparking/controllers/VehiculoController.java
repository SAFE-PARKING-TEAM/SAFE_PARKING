package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.RolDTO;
import pe.edu.upc.aaw.safeparking.dtos.VehiculoDTO;
import pe.edu.upc.aaw.safeparking.entities.Vehiculo;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IVehiculoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {
    @Autowired
    private IVehiculoService vS;

    public VehiculoController() {
    }

    public VehiculoController(IVehiculoService vS) {
        this.vS = vS;
    }

    @PostMapping("Registrar")
    public void registrar(@RequestBody VehiculoDTO dto){
        ModelMapper m=new ModelMapper();
        Vehiculo v=m.map(dto,Vehiculo.class);
        vS.insert(v);
    }
    @GetMapping("Listar")
    public List<VehiculoDTO> listar(){
        return vS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,VehiculoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("ListarporID/{id}")
    public VehiculoDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        VehiculoDTO v= m.map(vS.listId(id), VehiculoDTO.class);
        return v;
    }
    @PutMapping("Modificar")
    public void modificar(@RequestBody VehiculoDTO dto){
        ModelMapper m=new ModelMapper();
        Vehiculo v=m.map(dto, Vehiculo.class);
        vS.insert(v);
    }

    @DeleteMapping("Eliminar/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        vS.delete(id);
    }

}
