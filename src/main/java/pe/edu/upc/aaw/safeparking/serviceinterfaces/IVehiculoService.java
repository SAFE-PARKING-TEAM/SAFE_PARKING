package pe.edu.upc.aaw.safeparking.serviceinterfaces;

import pe.edu.upc.aaw.safeparking.entities.Vehiculo;

import java.util.List;

public interface IVehiculoService {
    public void insert(Vehiculo membresia);
    public List<Vehiculo> list();
}
