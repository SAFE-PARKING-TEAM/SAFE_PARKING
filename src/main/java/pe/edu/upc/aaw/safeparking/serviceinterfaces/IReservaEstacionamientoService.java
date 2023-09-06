package pe.edu.upc.aaw.safeparking.serviceinterfaces;

import pe.edu.upc.aaw.safeparking.entities.ReservaEstacionamiento;

import java.util.List;

public interface IReservaEstacionamientoService {

    public void insert(ReservaEstacionamiento reservaEstacionamiento);
    public List<ReservaEstacionamiento> list();
}
