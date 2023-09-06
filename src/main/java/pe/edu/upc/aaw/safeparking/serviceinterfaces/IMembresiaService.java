package pe.edu.upc.aaw.safeparking.serviceinterfaces;

import pe.edu.upc.aaw.safeparking.entities.Membresia;

import java.util.List;

public interface IMembresiaService {
    public void insert(Membresia membresia);
    public List<Membresia> list();
    public void delete(int idMembresia);
    public Membresia listId(int idMembresia);
}
