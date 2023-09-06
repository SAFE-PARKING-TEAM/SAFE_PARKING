package pe.edu.upc.aaw.safeparking.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.safeparking.entities.Estacionamiento;
import pe.edu.upc.aaw.safeparking.repositories.IEstacionamientoRepository;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IEstacionamientoService;


import java.util.List;

@Service
public class EstacionamientoServiceImplement implements IEstacionamientoService {
    @Autowired
    private IEstacionamientoRepository eR;

    @Override
    public void insert(Estacionamiento estacionamiento) {
        eR.save(estacionamiento);
    }

    @Override
    public List<Estacionamiento> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int idEstacionamiento) {
        eR.deleteById(idEstacionamiento);
    }

    @Override
    public Estacionamiento listId(int idEstacionamiento) {
        return eR.findById(idEstacionamiento).orElse(new Estacionamiento());
    }
}
