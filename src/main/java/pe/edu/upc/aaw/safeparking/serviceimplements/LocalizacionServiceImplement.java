package pe.edu.upc.aaw.safeparking.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.safeparking.entities.Localizacion;
import pe.edu.upc.aaw.safeparking.repositories.ILocalizacionRepository;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.ILocalizacionService;

import java.util.List;

@Service
public class LocalizacionServiceImplement implements ILocalizacionService {
    @Autowired
    private ILocalizacionRepository lR;

    @Override
    public void insert(Localizacion localizacion) {
        lR.save(localizacion);
    }

    @Override
    public List<Localizacion> list() {
        return lR.findAll();
    }

    @Override
    public void delete(int idLocalizacion) {
        lR.deleteById(idLocalizacion);
    }

    @Override
    public Localizacion listId(int idLocalizacion) {
        return lR.findById(idLocalizacion).orElse(new Localizacion());
    }
}

