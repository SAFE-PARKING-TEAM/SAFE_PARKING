package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.LocalizacionDTO;
import pe.edu.upc.aaw.safeparking.dtos.MembresiaDTO;
import pe.edu.upc.aaw.safeparking.entities.Membresia;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IMembresiaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/membresias")
public class MembresiaController {
    @Autowired
    private IMembresiaService dS;

    @PostMapping("Registrar")
    @PreAuthorize("hasAuthority('administrador')")
    public void registrar(@RequestBody MembresiaDTO dto){
        ModelMapper m=new ModelMapper();
        Membresia d=m.map(dto,Membresia.class);
        dS.insert(d);
    }
    @GetMapping("Listar")
    @PreAuthorize("hasAuthority('administrador') or hasAuthority('arrendador')")
    public List<MembresiaDTO> listar(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,MembresiaDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("ListarporID/{id}")
    @PreAuthorize("hasAuthority('arrendador') or hasAuthority('administrador')")
    public MembresiaDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        MembresiaDTO mm= m.map(dS.listId(id), MembresiaDTO.class);
        return mm;
    }

    @DeleteMapping("Eliminar/{id}")
    @PreAuthorize("hasAuthority('administrador')")
    public void eliminar(@PathVariable("id")Integer id){
        dS.delete(id);
    }

    @PutMapping("Modificar")
    @PreAuthorize("hasAuthority('administrador')")
    public void modificar(@RequestBody MembresiaDTO dto){
        ModelMapper m=new ModelMapper();
        Membresia mem=m.map(dto,Membresia.class);
        dS.insert(mem);
    }

}
