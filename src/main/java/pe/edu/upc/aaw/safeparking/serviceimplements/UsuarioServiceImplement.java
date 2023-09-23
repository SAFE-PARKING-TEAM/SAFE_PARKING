package pe.edu.upc.aaw.safeparking.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.safeparking.entities.Users;
import pe.edu.upc.aaw.safeparking.repositories.IUsuarioRepository;
import pe.edu.upc.aaw.safeparking.serviceinterfaces.IUsuarioService;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;

    @Override
    public void insert(Users users) {
        uR.save(users);
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int idDessert) {
        uR.deleteById(idDessert);
    }

    @Override
    public Users listId(int idUsuario) {
        return uR.findById(idUsuario).orElse(new Users());
    }
}
