package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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



    @PostMapping("Registrar")
    @PreAuthorize("hasAuthority('arredador')"  )
    public void registrar(@RequestBody HorarioEstacionamientoDTO dto){
        ModelMapper m=new ModelMapper();
        HorarioEstacionamiento he=m.map(dto,HorarioEstacionamiento.class);
        heS.insert(he);



    }

}
