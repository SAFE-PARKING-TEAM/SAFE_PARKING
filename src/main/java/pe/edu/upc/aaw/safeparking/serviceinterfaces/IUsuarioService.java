package pe.edu.upc.aaw.safeparking.serviceinterfaces;

import pe.edu.upc.aaw.safeparking.entities.Usuario;

import java.util.List;

public interface IUsuarioService {

    public void insert(Usuario usuario);
    public List<Usuario> list();
    public void delete(int idUsuario);
    public Usuario listId(int idUsuario);
    
}
