package pe.edu.upc.aaw.safeparking.dtos;

import pe.edu.upc.aaw.safeparking.entities.Localizacion;
import pe.edu.upc.aaw.safeparking.entities.Usuario;

import java.time.LocalDate;

public class EstacionamientoDTO {
    private int idEstacionamiento;
    private String tipoEstacionamiento;
    private String disponibilidad;
    private byte[] foto;
    private Float promedioValoracion;
    private int capacidad;
    private LocalDate fechaRegistro;
    private Double precio;
    private UsuarioDTO usuario;
    private LocalizacionDTO localizacion;

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    public LocalizacionDTO getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(LocalizacionDTO localizacion) {
        this.localizacion = localizacion;
    }

    public int getIdEstacionamiento() {return idEstacionamiento;}

    public void setIdEstacionamiento(int idEstacionamiento) {this.idEstacionamiento = idEstacionamiento;}

    public String getTipoEstacionamiento() {return tipoEstacionamiento;}

    public void setTipoEstacionamiento(String tipoEstacionamiento) {this.tipoEstacionamiento = tipoEstacionamiento;}

    public String getDisponibilidad() {return disponibilidad;}

    public void setDisponibilidad(String disponibilidad) {this.disponibilidad = disponibilidad;}

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public Float getPromedioValoracion() {return promedioValoracion;}

    public void setPromedioValoracion(Float promedioValoracion) {this.promedioValoracion = promedioValoracion;}

    public int getCapacidad() {return capacidad;}

    public void setCapacidad(int capacidad) {this.capacidad = capacidad;}

    public LocalDate getFechaRegistro() {return fechaRegistro;}

    public void setFechaRegistro(LocalDate fechaRegistro) {this.fechaRegistro = fechaRegistro;}

    public Double getPrecio() {return precio;}

    public void setPrecio(Double precio) {this.precio = precio;}


}