package pe.edu.upc.aaw.safeparking.serviceinterfaces;

import pe.edu.upc.aaw.safeparking.entities.Incidente;

import java.util.List;

public interface IIncidenteService {
    public void insert(Incidente incidente);
    public List<Incidente> list();
    public void delete(int idIncidente);
    public  List<String[]>cantIncidentesPorTipoRol();
}
