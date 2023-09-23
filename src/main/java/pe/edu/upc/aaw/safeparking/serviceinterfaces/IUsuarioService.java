package pe.edu.upc.aaw.safeparking.serviceinterfaces;

import pe.edu.upc.aaw.safeparking.entities.Users;

import java.util.List;

public interface IUsuarioService {

    public void insert(Users users);
    public List<Users> list();
    public void delete(int idUsuario);
    public Users listId(int idUsuario);
    
}
