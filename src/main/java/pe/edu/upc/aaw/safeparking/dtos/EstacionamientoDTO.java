package pe.edu.upc.aaw.safeparking.dtos;

import pe.edu.upc.aaw.safeparking.entities.Localizacion;

import java.time.LocalDate;

public class EstacionamientoDTO {
    private int idEstacionamiento;
    private String tipoEstacionamiento;
    private String disponibilidad;
    private String foto;
    private Float promedioValoracion;
    private int capacidad;
    private LocalDate fechaRegistro;
    private Double precio;
    private UsuarioDTO users;
    private LocalizacionDTO localizacion;

    public int getIdEstacionamiento() {return idEstacionamiento;}

    public void setIdEstacionamiento(int idEstacionamiento) {this.idEstacionamiento = idEstacionamiento;}

    public String getTipoEstacionamiento() {return tipoEstacionamiento;}

    public void setTipoEstacionamiento(String tipoEstacionamiento) {this.tipoEstacionamiento = tipoEstacionamiento;}

    public String getDisponibilidad() {return disponibilidad;}

    public void setDisponibilidad(String disponibilidad) {this.disponibilidad = disponibilidad;}

    public String getFoto() {return foto;}

    public void setFoto(String foto) {this.foto = foto;}

    public Float getPromedioValoracion() {return promedioValoracion;}

    public void setPromedioValoracion(Float promedioValoracion) {this.promedioValoracion = promedioValoracion;}

    public int getCapacidad() {return capacidad;}

    public void setCapacidad(int capacidad) {this.capacidad = capacidad;}

    public LocalDate getFechaRegistro() {return fechaRegistro;}

    public void setFechaRegistro(LocalDate fechaRegistro) {this.fechaRegistro = fechaRegistro;}

    public Double getPrecio() {return precio;}

    public void setPrecio(Double precio) {this.precio = precio;}

    public UsuarioDTO getUsers() {
        return users;
    }

    public void setUsers(UsuarioDTO users) {
        this.users = users;
    }

    public LocalizacionDTO getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(LocalizacionDTO localizacion) {
        this.localizacion = localizacion;
    }

    public EstacionamientoDTO() {
    }

    public EstacionamientoDTO(int idEstacionamiento, String tipoEstacionamiento, String disponibilidad, String foto, Float promedioValoracion, int capacidad, LocalDate fechaRegistro, Double precio, UsuarioDTO users, LocalizacionDTO localizacion) {
        this.idEstacionamiento = idEstacionamiento;
        this.tipoEstacionamiento = tipoEstacionamiento;
        this.disponibilidad = disponibilidad;
        this.foto = foto;
        this.promedioValoracion = promedioValoracion;
        this.capacidad = capacidad;
        this.fechaRegistro = fechaRegistro;
        this.precio = precio;
        this.users = users;
        this.localizacion = localizacion;
    }
}
