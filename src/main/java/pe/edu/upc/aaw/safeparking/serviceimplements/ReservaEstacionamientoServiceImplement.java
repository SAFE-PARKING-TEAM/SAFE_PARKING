package pe.edu.upc.aaw.safeparking.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.safeparking.entities.ReservaEstacionamiento;
import pe.edu.upc.aaw.safeparking.repositories.IReservaEstacionamientoRepository;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IReservaEstacionamientoService;

import java.util.List;
@Service
public class ReservaEstacionamientoServiceImplement  implements IReservaEstacionamientoService {

    @Autowired
    private IReservaEstacionamientoRepository reR;
    @Override
    public void insert(ReservaEstacionamiento reservaEstacionamiento) {
        reR.save(reservaEstacionamiento);
    }

    @Override
    public List<ReservaEstacionamiento> list() {
        return reR.findAll();
    }


    @Override
    public void delete(int idReservaEstacionamiento) {
        reR.deleteById(idReservaEstacionamiento);
    }

    @Override
    public ReservaEstacionamiento listId(int idReservaEstacionamiento) {
        return reR.findById(idReservaEstacionamiento).orElse(new ReservaEstacionamiento());
    }

    @Override
    public List<String[]> quantityreservationByUser() {
        return reR.quantityreservationByUser();
    }

    @Override
    public List<String[]> quantityreservationbyDate() { return reR.quantityreservationbyDate();}

    @Override
    public List<String[]>quantityreservationbyPay() {return reR.quantityreservationbyPay();}

}
