package pe.edu.upc.aaw.safeparking.serviceinterfaces;

import pe.edu.upc.aaw.safeparking.entities.Horario;

import java.util.List;

public interface IHorarioService {
    public void insert(Horario horario);
    public List<Horario> list();
    public void delete(int idHorario);
    public Horario listId(int idHorario);

}
