package pe.edu.upc.aaw.safeparking.entities;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name = "horario")
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHorario;
    @Column(name = "horaApertura", nullable = false ,length = 50)
    private String horaApertura;
    @Column(name = "horaCierre", nullable = false ,length = 50)
    private String horaCierre;
    @Column(name ="fecha", nullable = false)
    private LocalDate fecha;

    public Horario() {
    }

    public Horario(int idHorario, String horaApertura, String horaCierre, LocalDate fecha) {
        this.idHorario = idHorario;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.fecha = fecha;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }

    public String getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(String horaApertura) {
        this.horaApertura = horaApertura;
    }

    public String getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(String horaCierre) {
        this.horaCierre = horaCierre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}