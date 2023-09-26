package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.CantIncidentesPorRolDTO;
import pe.edu.upc.aaw.safeparking.dtos.IncidenteDTO;
import pe.edu.upc.aaw.safeparking.entities.Incidente;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IIncidenteService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/incidentes")
public class IncidenteController {
    @Autowired
    private IIncidenteService iS;


    public IncidenteController() {
    }

    public IncidenteController(IIncidenteService iS) {
        this.iS = iS;
    }



}
