package pe.edu.upc.aaw.safeparking.serviceinterfaces;

import pe.edu.upc.aaw.safeparking.entities.Estacionamiento;


import java.util.List;

public interface IEstacionamientoService {
    public void insert(Estacionamiento estacionamiento);
    public List<Estacionamiento> list();
    public void delete(int idEstacionamiento);
    public Estacionamiento listId(int idEstacionamiento);
}
