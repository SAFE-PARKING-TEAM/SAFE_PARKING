package pe.edu.upc.aaw.safeparking.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.safeparking.entities.Membresia;
import pe.edu.upc.aaw.safeparking.repositories.IMembresiaRepository;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IMembresiaService;

import java.util.List;

@Service
public class MembresiaServiceImplement implements IMembresiaService {
    @Autowired
    private IMembresiaRepository dR;

    @Override
    public void insert(Membresia membresia) {
        dR.save(membresia);
    }

    @Override
    public List<Membresia> list() {
        return dR.findAll();
    }

    @Override
    public void delete(int idMembresia) {
        dR.deleteById(idMembresia);
    }

    @Override
    public Membresia listId(int idMembresia) {
        return dR.findById(idMembresia).orElse(new Membresia());
    }
}
