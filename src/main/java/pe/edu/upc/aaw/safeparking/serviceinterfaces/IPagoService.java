package pe.edu.upc.aaw.safeparking.serviceinterfaces;

import pe.edu.upc.aaw.safeparking.entities.Pago;

import java.util.List;

public interface IPagoService{
    public void insert(Pago pago);
    public List<Pago> list();
    public void delete(int idPago);
    public Pago listId(int idPago);
}