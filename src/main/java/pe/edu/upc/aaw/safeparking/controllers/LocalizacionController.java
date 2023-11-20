package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.LocalizacionDTO;
import pe.edu.upc.aaw.safeparking.entities.Localizacion;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.ILocalizacionService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/localizaciones")
public class LocalizacionController {
    @Autowired
    private ILocalizacionService lS;

    @PostMapping("Registrar")
    //  @PreAuthorize("hasAuthority('administrador')  or hasAuthority('arrendador')")
    public void registrar(@RequestBody LocalizacionDTO dto){
        ModelMapper m=new ModelMapper();
        Localizacion d=m.map(dto,Localizacion.class);
        lS.insert(d);
    }
    @GetMapping("Listar")
    //  @PreAuthorize("hasAuthority('administrador')  or hasAuthority('arrendador')")
    public List<LocalizacionDTO> listar(){
        return lS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,LocalizacionDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("ListarporID/{id}")
    // @PreAuthorize("hasAuthority('administrador')  or hasAuthority('arrendador')") // yo diria toddos
    public LocalizacionDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        LocalizacionDTO l= m.map(lS.listId(id), LocalizacionDTO.class);
        return l;
    }
    @PutMapping("Modificar")
    //  @PreAuthorize("hasAuthority('administrador')  or hasAuthority('arrendador')")
    public void modificar(@RequestBody LocalizacionDTO dto){
        ModelMapper m=new ModelMapper();
        Localizacion d=m.map(dto, Localizacion.class);
        lS.insert(d);
    }
    @DeleteMapping("Eliminar/{id}")
    // @PreAuthorize("hasAuthority('administrador')  or hasAuthority('arrendador')")
    public void eliminar(@PathVariable("id")Integer id){
        lS.delete(id);
    }
}
