package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.IncidenteDTO;
import pe.edu.upc.aaw.safeparking.dtos.MembresiaDTO;
import pe.edu.upc.aaw.safeparking.entities.Incidente;
import pe.edu.upc.aaw.safeparking.entities.Membresia;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IIncidentService;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IMembresiaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/incidente")
public class IncidenteController {
    @Autowired
    private IIncidentService iS;
    @PostMapping
    public void registrar(@RequestBody IncidenteDTO dto){
        ModelMapper m=new ModelMapper();
        Incidente d=m.map(dto,Incidente.class);
        iS.insert(d);
    }
    @GetMapping
    public List<IncidenteDTO> listar(){
        return iS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,IncidenteDTO.class);
        }).collect(Collectors.toList());
    }
}
