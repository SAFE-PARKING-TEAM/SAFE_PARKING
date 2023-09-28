package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.CantidadReservasPorFechaDTO;
import pe.edu.upc.aaw.safeparking.dtos.CantidadReservasPorTipoPagoDTO;
import pe.edu.upc.aaw.safeparking.dtos.CantidadReservasPorUsuarioDTO;
import pe.edu.upc.aaw.safeparking.dtos.ReservaEstacionamientoDTO;
import pe.edu.upc.aaw.safeparking.entities.ReservaEstacionamiento;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IReservaEstacionamientoService;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/ReservaEstacionamientos")
public class ReservaEstacionamientoController {
    @Autowired
    private IReservaEstacionamientoService reS;
    @PostMapping("Registrar")
    @PreAuthorize(" hasAuthority('conductor') or hasAuthority('administrador') ")
    public void registrar(@RequestBody ReservaEstacionamientoDTO dto){
        ModelMapper m=new ModelMapper();
        ReservaEstacionamiento rev=m.map(dto,ReservaEstacionamiento.class);
        reS.insert(rev);
    }
    @GetMapping("Listar")
    @PreAuthorize("hasAuthority('administrador')  or hasAuthority('arrendador') or hasAuthority('conductor')")
    public List<ReservaEstacionamientoDTO> listar(){
        return reS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,ReservaEstacionamientoDTO.class);
        }).collect(Collectors.toList());
    }

    @PutMapping("Modificar")
    @PreAuthorize("hasAuthority('administrador')  or hasAuthority('conductor')")
    public void modificar(@RequestBody ReservaEstacionamientoDTO dto){
        ModelMapper m=new ModelMapper();
        ReservaEstacionamiento rev=m.map(dto, ReservaEstacionamiento.class);
        reS.insert(rev);
    }

    @DeleteMapping("Eliminar/{id}")
    @PreAuthorize("hasAuthority('administrador')  or hasAuthority('conductor')")
    public void eliminar(@PathVariable("id")Integer id){
        reS.delete(id);
    }

    @GetMapping("ListarporID/{id}")
    @PreAuthorize("hasAuthority('administrador')  or hasAuthority('arrendador') or hasAuthority('conductor')")
    public ReservaEstacionamientoDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        ReservaEstacionamientoDTO rev= m.map(reS.listId(id), ReservaEstacionamientoDTO.class);
        return rev;
    }
    @GetMapping("cantidadReservaPorusuario")
    @PreAuthorize("hasAuthority('administrador')")
    public List<CantidadReservasPorUsuarioDTO> cantidadReservasPorUsuario(){
        List<String[]> lista = reS.quantityreservationByUser();
        List<CantidadReservasPorUsuarioDTO> listaDTO = new ArrayList<>();
        for(String[] data:lista){

            CantidadReservasPorUsuarioDTO dto = new CantidadReservasPorUsuarioDTO();
            dto.setNameUser(Integer.parseInt(data[0]));
            dto.setNameRole(data[1]);
            dto.setQuantityReservation(Integer.parseInt(data[2]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/cantidadReservaPorFecha")
    @PreAuthorize("hasAuthority('administrador')")
    public List<CantidadReservasPorFechaDTO> cantidadReservasPorFecha(){
        List<String[]> listaa = reS.quantityreservationbyDate();
        List<CantidadReservasPorFechaDTO> lista_DTO = new ArrayList<>();
        for(String[] data:listaa){

            CantidadReservasPorFechaDTO dto = new CantidadReservasPorFechaDTO();
            dto.setDate_reservation(LocalDate.parse(data[0]));
            dto.setReservation_quantity(Integer.parseInt(data[1]));

            lista_DTO.add(dto);
        }
        return lista_DTO;
    }

    @GetMapping("/cantidadReservaPorTipoDePago")
    @PreAuthorize("hasAuthority('administrador')")
    public List<CantidadReservasPorTipoPagoDTO> cantidadReservasPorTipoDePago(){
        List<String[]> lista = reS.quantityreservationbyPay();
        List<CantidadReservasPorTipoPagoDTO> lista_DTO = new ArrayList<>();
        for(String[] data:lista){

            CantidadReservasPorTipoPagoDTO dto = new CantidadReservasPorTipoPagoDTO();
            dto.setTipoPgo(data[0]);
            dto.setReservation_quantity(Integer.parseInt(data[1]));

            lista_DTO.add(dto);
        }
        return lista_DTO;
    }
}
