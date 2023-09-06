package pe.edu.upc.aaw.safeparking.serviceinterfaces;

import pe.edu.upc.aaw.safeparking.entities.Localizacion;

import java.util.List;

public interface ILocalizacionService {
    public void insert(Localizacion localizacion);
    public List<Localizacion> list();
    public void delete(int idLocalizacion);
    public Localizacion listId(int idLocalizacion);
}


