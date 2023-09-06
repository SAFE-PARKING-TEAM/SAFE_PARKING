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
    @Column(name = "fechaInicio",nullable = false)
    private LocalDate fechaInicio;
    @Column(name = "fechaFin",nullable = false)
    private LocalDate fechaFin;
    @Column(name = "favorito",nullable = false)
    private boolean favorito;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @OneToOne
    @JoinColumn(name = "idVehiculo")
    private Vehiculo vehiculo;
    @ManyToOne
    @JoinColumn(name = "idEstacionamiento")
    private Estacionamiento estacionamiento;

    public ReservaEstacionamiento() {
    }

    public ReservaEstacionamiento(int idReservaEstacionamiento, String estado, LocalDate fechaInicio, LocalDate fechaFin, boolean favorito, Usuario usuario, Vehiculo vehiculo, Estacionamiento estacionamiento) {
        this.idReservaEstacionamiento = idReservaEstacionamiento;
        this.estado = estado;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.favorito = favorito;
        this.usuario = usuario;
        this.vehiculo = vehiculo;
        this.estacionamiento = estacionamiento;
    }

    public int getIdReserva() {
        return idReservaEstacionamiento;
    }

    public void setIdReserva(int idReserva) {
        this.idReservaEstacionamiento = idReserva;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
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

    public Estacionamiento getEstacionamiento() {
        return estacionamiento;
    }

    public void setEstacionamiento(Estacionamiento estacionamiento) {
        this.estacionamiento = estacionamiento;
    }
}

