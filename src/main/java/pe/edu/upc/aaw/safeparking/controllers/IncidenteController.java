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
@RequestMapping("/incidente")
public class IncidenteController {
    @Autowired
    private IIncidenteService iS;
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
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        iS.delete(id);
    }

    @GetMapping("/CantidadIncidentesPorRol")
   // @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<CantIncidentesPorRolDTO> cantIncidentesPorTipoRol(){
        List<String[]> lista = iS.cantIncidentesPorTipoRol();

        List<CantIncidentesPorRolDTO> listaDTO = new ArrayList<>();
        for(String[] data:lista){
            CantIncidentesPorRolDTO dto = new CantIncidentesPorRolDTO();
            dto.setNombreRol(data[0]);
            dto.setCantIncidentes(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }


}
