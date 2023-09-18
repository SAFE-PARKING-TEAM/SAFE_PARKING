package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.CantIncidentesPorRolDTO;
import pe.edu.upc.aaw.safeparking.dtos.IncidenteDTO;
import pe.edu.upc.aaw.safeparking.dtos.PagoDTO;
import pe.edu.upc.aaw.safeparking.entities.Incidente;
import pe.edu.upc.aaw.safeparking.entities.Pago;
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
    @PreAuthorize("hasAuthority('conductor') or hasAuthority('arrendador')")
    public void registrar(@RequestBody IncidenteDTO dto){
        ModelMapper m=new ModelMapper();
        Incidente d=m.map(dto,Incidente.class);
        iS.insert(d);
    }
    @GetMapping
    @PreAuthorize("hasAuthority('administrador')"  )
    public List<IncidenteDTO> listar(){
        return iS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,IncidenteDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    @PreAuthorize("hasAuthority('conductor') or hasAuthority('arrendador')")
    public void modificar(@RequestBody IncidenteDTO dto){
        ModelMapper m=new ModelMapper();
        Incidente i=m.map(dto,Incidente.class);
        iS.insert(i);
    }
    @DeleteMapping("/{id}")
    @PreAuthorize("hasAuthority('administrador')"  )
    public void eliminar(@PathVariable("id")Integer id){
        iS.delete(id);
    }

    @GetMapping("CantidadIncidentesPorRol")
    @PreAuthorize("hasAuthority('administrador')")
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
