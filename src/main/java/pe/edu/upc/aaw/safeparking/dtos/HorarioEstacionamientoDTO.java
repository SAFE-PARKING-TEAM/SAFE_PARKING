package pe.edu.upc.aaw.safeparking.dtos;

import pe.edu.upc.aaw.safeparking.entities.Estacionamiento;
import pe.edu.upc.aaw.safeparking.entities.Horario;


public class HorarioEstacionamientoDTO {
    private int idHorarioEstacionamiento;

    private EstacionamientoDTO estacionamiento;

    private HorarioDTO horario;

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

    public HorarioDTO getHorario() {
        return horario;
    }

    public void setHorario(HorarioDTO horario) {
        this.horario = horario;
    }

    public HorarioEstacionamientoDTO() {
    }

    public HorarioEstacionamientoDTO(int idHorarioEstacionamiento, EstacionamientoDTO estacionamiento, HorarioDTO horario) {
        this.idHorarioEstacionamiento = idHorarioEstacionamiento;
        this.estacionamiento = estacionamiento;
        this.horario = horario;
    }
}
