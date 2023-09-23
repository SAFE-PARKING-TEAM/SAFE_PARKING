package pe.edu.upc.aaw.safeparking.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.safeparking.entities.Role;
import pe.edu.upc.aaw.safeparking.repositories.IRolRepository;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IRolService;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService{
    @Autowired
    private IRolRepository rolR;

    @Override
    public void insert(Role role) {
        rolR.save(role);
    }

    @Override
    public List<Role> list() {
        return rolR.findAll();
    }

    @Override
    public void delete(int idRol) {
        rolR.deleteById(idRol);
    }

    @Override
    public Role listId(int idRol) {
        return rolR.findById(idRol).orElse(new Role());
    }

}
