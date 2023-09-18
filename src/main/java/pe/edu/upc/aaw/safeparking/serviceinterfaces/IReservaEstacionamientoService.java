package pe.edu.upc.aaw.safeparking.serviceinterfaces;

import pe.edu.upc.aaw.safeparking.entities.ReservaEstacionamiento;

import java.util.List;

public interface IReservaEstacionamientoService {

    public void insert(ReservaEstacionamiento reservaEstacionamiento);
    public List<ReservaEstacionamiento> list();

    public void delete(int idReservaEstacionamiento);
    public ReservaEstacionamiento listId(int idReservaEstacionamiento);
    public List<String[]> quantityreservationByUser();
    public List<String[]>quantityreservationbyDate();
    public List<String[]>quantityreservationbyPay();

}
