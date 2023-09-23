package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.PagoDTO;
import pe.edu.upc.aaw.safeparking.entities.Pago;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pago")
public class PagoController {
    @Autowired
    private IPagoService pagoR;
    @PostMapping("Registrar")
    @PreAuthorize("hasAuthority('administrador')")
    public void registrar(@RequestBody PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Pago d=m.map(dto, Pago.class);
        pagoR.insert(d);
    }
    @GetMapping("Listar")
    @PreAuthorize("hasAuthority('administrador')")
    public List<PagoDTO> listar(){
        return pagoR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PagoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("Eliminar/{id}")
    @PreAuthorize("hasAuthority('administrador')")
    public void eliminar(@PathVariable("id")Integer id){
        pagoR.delete(id);
    }

    @PutMapping("Modificar")
    @PreAuthorize("hasAuthority('administrador')")
    public void modificar(@RequestBody PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Pago d=m.map(dto,Pago.class);
        pagoR.insert(d);
    }
}
