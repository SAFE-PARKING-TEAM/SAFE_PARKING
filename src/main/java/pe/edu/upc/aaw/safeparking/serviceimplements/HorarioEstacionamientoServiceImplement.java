package pe.edu.upc.aaw.safeparking.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.safeparking.entities.HorarioEstacionamiento;
import pe.edu.upc.aaw.safeparking.repositories.IHorarioEstacionamientoRepository;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IHorarioEstacionamientoService;

import java.util.List;
@Service
public class HorarioEstacionamientoServiceImplement implements IHorarioEstacionamientoService {
    @Autowired
    private IHorarioEstacionamientoRepository heR;
    @Override
    public void insert(HorarioEstacionamiento HorarioEstacionamiento) {
        heR.save(HorarioEstacionamiento);
    }

    @Override
    public List<HorarioEstacionamiento> list() {
        return heR.findAll();
    }


    @Override
    public void delete(int idHorarioEstacionamiento) {
        heR.deleteById(idHorarioEstacionamiento);
    }

    @Override
    public HorarioEstacionamiento listId(int idVehiculo) {
        return heR.findById(idVehiculo).orElse(new HorarioEstacionamiento());
    }
}
