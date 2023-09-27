package pe.edu.upc.aaw.safeparking.dtos;

import pe.edu.upc.aaw.safeparking.entities.Estacionamiento;
import pe.edu.upc.aaw.safeparking.entities.Horario;


public class HorarioEstacionamientoDTO {
    private int idHorarioEstacionamiento;

    private EstacionamientoDTO estacionamiento;

    private Horario horario;

    public int getIdHorarioEstacionamiento() {
        return idHorarioEstacionamiento;
    }

    public void setIdHorarioEstacionamiento(int idHorarioEstacionamiento) {
        this.idHorarioEstacionamiento = idHorarioEstacionamiento;
    }

    public EstacionamientoDTO getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(EstacionamientoDTO estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}