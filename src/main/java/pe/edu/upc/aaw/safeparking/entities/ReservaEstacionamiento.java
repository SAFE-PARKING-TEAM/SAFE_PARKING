package pe.edu.upc.aaw.safeparking.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reservaEstacionamiento")
public class ReservaEstacionamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReservaEstacionamiento;
    @Column(name = "estado",nullable = false,length = 50)
    private String estado;
    @Column(name = "favorito",nullable = false)
    private boolean favorito;
    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @OneToOne
    @JoinColumn(name = "idVehiculo")
    private Vehiculo vehiculo;
    @ManyToOne
    @JoinColumn(name = "idHorarioEstacionamiento")
    private HorarioEstacionamiento horarioEstacionamiento;

    public ReservaEstacionamiento() {
    }

    public ReservaEstacionamiento(int idReservaEstacionamiento, String estado, boolean favorito, LocalDate fecha, Usuario usuario, Vehiculo vehiculo, HorarioEstacionamiento horarioEstacionamiento) {
        this.idReservaEstacionamiento = idReservaEstacionamiento;
        this.estado = estado;
        this.favorito = favorito;
        this.fecha = fecha;
        this.usuario = usuario;
        this.vehiculo = vehiculo;
        this.horarioEstacionamiento = horarioEstacionamiento;
    }

    public int getIdReservaEstacionamiento() {
        return idReservaEstacionamiento;
    }

    public void setIdReservaEstacionamiento(int idReservaEstacionamiento) {
        this.idReservaEstacionamiento = idReservaEstacionamiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public HorarioEstacionamiento getHorarioEstacionamiento() {
        return horarioEstacionamiento;
    }

    public void setHorarioEstacionamiento(HorarioEstacionamiento horarioEstacionamiento) {
        this.horarioEstacionamiento = horarioEstacionamiento;
    }
}