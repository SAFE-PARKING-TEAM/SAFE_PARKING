package pe.edu.upc.aaw.safeparking.entities;

import javax.persistence.*;

@Entity
@Table(name = "HorarioEstacionamiento")
public class HorarioEstacionamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHorarioEstacionamiento;
    @ManyToOne
    @JoinColumn(name = "idEstacionamiento")
    private Estacionamiento estacionamiento;
    @ManyToOne
    @JoinColumn(name = "idHorario")
    private Horario horario;

    public HorarioEstacionamiento() {
    }

    public HorarioEstacionamiento(int idHorarioEstacionamiento, Estacionamiento estacionamiento, Horario horario) {
        this.idHorarioEstacionamiento = idHorarioEstacionamiento;
        this.estacionamiento = estacionamiento;
        this.horario = horario;
    }

    public int getIdHorarioEstacionamiento() {
        return idHorarioEstacionamiento;
    }

    public void setIdHorarioEstacionamiento(int idHorarioEstacionamiento) {
        this.idHorarioEstacionamiento = idHorarioEstacionamiento;
    }

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
