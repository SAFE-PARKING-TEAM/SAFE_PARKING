package pe.edu.upc.aaw.safeparking.dtos;

import pe.edu.upc.aaw.safeparking.entities.Localizacion;
import pe.edu.upc.aaw.safeparking.entities.Users;

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
    private Users users;
    private Localizacion localizacion;

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

    public Users getUsuario() {return users;}

    public void setUsuario(Users users) {this.users = users;}

    public Localizacion getLocalizacion() {return localizacion;}

    public void setLocalizacion(Localizacion localizacion) {this.localizacion = localizacion;}
}
