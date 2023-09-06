package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.ReservaEstacionamientoDTO;
import pe.edu.upc.aaw.safeparking.dtos.VehiculoDTO;
import pe.edu.upc.aaw.safeparking.entities.ReservaEstacionamiento;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IReservaEstacionamientoService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/ReservaEstacionamiento")
public class ReservaEstacionamientoController {
    @Autowired
    private IReservaEstacionamientoService reS;
    @PostMapping
    public void registrar(@RequestBody ReservaEstacionamientoDTO dto){
        ModelMapper m=new ModelMapper();
        ReservaEstacionamiento v=m.map(dto,ReservaEstacionamiento.class);
        reS.insert(v);
    }
    @GetMapping
    public List<ReservaEstacionamientoDTO> listar(){
        return reS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ReservaEstacionamientoDTO.class);
        }).collect(Collectors.toList());
    }

}