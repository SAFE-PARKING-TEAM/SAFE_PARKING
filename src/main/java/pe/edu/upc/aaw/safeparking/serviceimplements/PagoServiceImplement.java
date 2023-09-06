package pe.edu.upc.aaw.safeparking.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.safeparking.entities.Pago;
import pe.edu.upc.aaw.safeparking.repositories.IPagoRepository;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IPagoService;

import java.util.List;
@Service
public class PagoServiceImplement implements IPagoService {
    @Autowired
    private IPagoRepository pagoR;
    @Override
    public void insert(Pago pago) {
        pagoR.save(pago);
    }
    @Override
    public List<Pago> list() {
        return pagoR.findAll();
    }
    @Override
    public void delete(int idPago) {
        pagoR.deleteById(idPago);
    }
    @Override
    public Pago listId(int idPago) {
        return pagoR.findById(idPago).orElse(new Pago());
    }
}
