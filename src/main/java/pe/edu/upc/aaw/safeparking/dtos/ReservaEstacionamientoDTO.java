package pe.edu.upc.aaw.safeparking.dtos;

import pe.edu.upc.aaw.safeparking.entities.HorarioEstacionamiento;
import pe.edu.upc.aaw.safeparking.entities.Users;
import pe.edu.upc.aaw.safeparking.entities.Vehiculo;

import java.time.LocalDate;

public class ReservaEstacionamientoDTO {

    private int idReservaEstacionamiento;

    private String estado;
    private boolean favorito;
    private LocalDate fecha;

    private UsuarioDTO users;

    private Vehiculo vehiculo;

    private HorarioEstacionamiento horarioEstacionamiento;

    public int getIdReservaEstacionamiento() {
        return idReservaEstacionamiento;
    }

    public void setIdReservaEstacionamiento(int idReservaEstacionamiento) {
        this.idReservaEstacionamiento = idReservaEstacionamiento;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public HorarioEstacionamiento getHorarioEstacionamiento() {
        return horarioEstacionamiento;
    }

    public void setHorarioEstacionamiento(HorarioEstacionamiento horarioEstacionamiento) {
        this.horarioEstacionamiento = horarioEstacionamiento;
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

    public UsuarioDTO getUsuario() {
        return users;
    }

    public void setUsuario(UsuarioDTO users) {
        this.users = users;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

}
