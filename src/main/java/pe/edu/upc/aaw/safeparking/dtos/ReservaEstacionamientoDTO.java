package pe.edu.upc.aaw.safeparking.dtos;

import pe.edu.upc.aaw.safeparking.entities.HorarioEstacionamiento;
import pe.edu.upc.aaw.safeparking.entities.Vehiculo;

import java.time.LocalDate;

public class ReservaEstacionamientoDTO {

    private int idReservaEstacionamiento;

    private String estado;
    private boolean favorito;
    private LocalDate fecha;

    private UsuarioDTO users;

    private VehiculoDTO vehiculo;

    private HorarioEstacionamientoDTO horarioEstacionamiento;

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

    public UsuarioDTO getUsers() {
        return users;
    }

    public void setUsers(UsuarioDTO users) {
        this.users = users;
    }

    public VehiculoDTO getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(VehiculoDTO vehiculo) {
        this.vehiculo = vehiculo;
    }

    public HorarioEstacionamientoDTO getHorarioEstacionamiento() {
        return horarioEstacionamiento;
    }

    public void setHorarioEstacionamiento(HorarioEstacionamientoDTO horarioEstacionamiento) {
        this.horarioEstacionamiento = horarioEstacionamiento;
    }

    public ReservaEstacionamientoDTO() {

    }

    public ReservaEstacionamientoDTO(int idReservaEstacionamiento, String estado, boolean favorito, LocalDate fecha, UsuarioDTO users, VehiculoDTO vehiculo, HorarioEstacionamientoDTO horarioEstacionamiento) {
        this.idReservaEstacionamiento = idReservaEstacionamiento;
        this.estado = estado;
        this.favorito = favorito;
        this.fecha = fecha;
        this.users = users;
        this.vehiculo = vehiculo;
        this.horarioEstacionamiento = horarioEstacionamiento;
    }
}
