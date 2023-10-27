package pe.edu.upc.aaw.safeparking.entities;

import javax.persistence.*;
import java.sql.Time;
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
    @Column(name = "dia",nullable = false,length = 50)
    private String dia;

    public Horario() {
    }

    public Horario(int idHorario, String horaApertura, String horaCierre, String dia) {
        this.idHorario = idHorario;
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.dia = dia;
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

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}