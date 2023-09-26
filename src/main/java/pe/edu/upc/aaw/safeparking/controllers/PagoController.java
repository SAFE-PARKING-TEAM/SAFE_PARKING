package pe.edu.upc.aaw.safeparking.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.safeparking.dtos.MembresiaDTO;
import pe.edu.upc.aaw.safeparking.dtos.PagoDTO;
import pe.edu.upc.aaw.safeparking.dtos.PrecioTotalporMesDTO;
import pe.edu.upc.aaw.safeparking.entities.Pago;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IPagoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagos")
public class PagoController {
    @Autowired
    private IPagoService pagoR;

    public PagoController() {
    }

    public PagoController(IPagoService pagoR) {
        this.pagoR = pagoR;
    }

    @PostMapping("Registrar")
    public void registrar(@RequestBody PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Pago d=m.map(dto, Pago.class);
        pagoR.insert(d);
    }
    @GetMapping("Listar")
    public List<PagoDTO> listar(){
        return pagoR.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,PagoDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("ListarporID/{id}")
    public PagoDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        PagoDTO pg= m.map(pagoR.listId(id), PagoDTO.class);
        return pg;
    }


    @DeleteMapping("Eliminar/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        pagoR.delete(id);
    }


    @PutMapping("Modificar")
    public void modificar(@RequestBody PagoDTO dto){
        ModelMapper m=new ModelMapper();
        Pago d=m.map(dto,Pago.class);
        pagoR.insert(d);
    }

    @GetMapping("precioTotalporMes")
    public List<PrecioTotalporMesDTO> precioTotalporMes(){
        List<String[]> lista = pagoR.PrecioTotalReservasporMesD();
        List<PrecioTotalporMesDTO> listaDTO = new ArrayList<>();
        for(String[] data:lista){
            PrecioTotalporMesDTO dto=new PrecioTotalporMesDTO();
            dto.setPrecioTotal(Double.parseDouble(data[0]));
            dto.setMes(data[1]);
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
