package pe.edu.upc.aaw.safeparking.serviceinterfaces;

import pe.edu.upc.aaw.safeparking.entities.Role;

import java.util.List;

public interface IRolService {
    public void insert(Role role);
    public List<Role> list();
    public void delete(int idRol);
    public Role listId(int idRol);
}
