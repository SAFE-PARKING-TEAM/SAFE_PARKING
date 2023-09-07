package pe.edu.upc.aaw.safeparking.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.safeparking.entities.Vehiculo;
import pe.edu.upc.aaw.safeparking.repositories.IVehiculoRepository;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IVehiculoService;

import java.util.List;
@Service
public class VehiculoServiceImplement implements IVehiculoService {

    @Autowired
    private IVehiculoRepository vR;
    @Override
    public void insert(Vehiculo vehiculo) {
        vR.save(vehiculo);
    }

    @Override
    public List<Vehiculo> list() {
        return vR.findAll();
    }

    @Override
    public void delete(int idVehiculo) {
        vR.deleteById(idVehiculo);
    }

    @Override
    public Vehiculo listId(int idVehiculo) {
        return vR.findById(idVehiculo).orElse(new Vehiculo());
    }
}
