package pe.edu.upc.aaw.safeparking.serviceinterfaces;

import pe.edu.upc.aaw.safeparking.entities.HorarioEstacionamiento;

import java.util.List;

public interface IHorarioEstacionamientoService {
    public void insert(HorarioEstacionamiento horarioEstacionamiento);
    public List<HorarioEstacionamiento> list();
}
