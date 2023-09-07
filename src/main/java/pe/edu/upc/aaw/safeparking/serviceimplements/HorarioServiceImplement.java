package pe.edu.upc.aaw.safeparking.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.safeparking.entities.Horario;
import pe.edu.upc.aaw.safeparking.entities.Incidente;
import pe.edu.upc.aaw.safeparking.repositories.IHorarioRepository;
import pe.edu.upc.aaw.safeparking.repositories.IIncidenteRepository;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IHorarioService;

import java.util.List;
@Service
public class HorarioServiceImplement implements IHorarioService {
    @Autowired
    private IHorarioRepository hR;
    @Override
    public void insert(Horario horario) {
        hR.save(horario);
    }

    @Override
    public List<Horario> list() {
        return hR.findAll();
    }
}
