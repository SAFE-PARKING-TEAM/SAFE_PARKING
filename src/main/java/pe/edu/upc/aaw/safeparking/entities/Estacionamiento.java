package pe.edu.upc.aaw.safeparking.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "estacionamiento")
public class Estacionamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstacionamiento;
    @Column(name = "tipoEstacionamiento",nullable = false,length = 50)
    private String tipoEstacionamiento;
    @Column(name = "disponibilidad",nullable = false,length = 50)

    private String disponibilidad;
    @Column(name = "foto",nullable = false,length = 50)

    private String foto;
    @Column(name = "promedioValoracion",nullable = false)

    private Float promedioValoracion;
    @Column(name = "capacidad",nullable = false)

    private int capacidad;
    @Column(name = "fechaRegistro",nullable = false)

    private LocalDate fechaRegistro;
    @Column(name = "precio",nullable = false)

    private Double precio;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Users users;
    @OneToOne
    @JoinColumn(name = "idLocalizacion")
    private Localizacion localizacion;

    public Estacionamiento() {
    }

    public Estacionamiento(int idEstacionamiento, String tipoEstacionamiento, String disponibilidad, String foto, Float promedioValoracion, int capacidad, LocalDate fechaRegistro, Double precio, Users users, Localizacion localizacion) {
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

    public int getIdEstacionamiento() {
        return idEstacionamiento;
    }

    public void setIdEstacionamiento(int idEstacionamiento) {
        this.idEstacionamiento = idEstacionamiento;
    }

    public String getTipoEstacionamiento() {
        return tipoEstacionamiento;
    }

    public void setTipoEstacionamiento(String tipoEstacionamiento) {
        this.tipoEstacionamiento = tipoEstacionamiento;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Float getPromedioValoracion() {
        return promedioValoracion;
    }

    public void setPromedioValoracion(Float promedioValoracion) {
        this.promedioValoracion = promedioValoracion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Users getUsuario() {
        return users;
    }

    public void setUsuario(Users users) {
        this.users = users;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }
}
