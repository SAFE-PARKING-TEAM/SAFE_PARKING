package pe.edu.upc.aaw.safeparking.entities;

import javax.persistence.*;
import java.sql.Blob;
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
    @Column(name = "foto",nullable = true)

    private byte[] foto;
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
    private Usuario usuario;
    @OneToOne
    @JoinColumn(name = "idLocalizacion")
    private Localizacion localizacion;

    public Estacionamiento() {
    }

    public Estacionamiento(int idEstacionamiento, String tipoEstacionamiento, String disponibilidad, byte[] foto, Float promedioValoracion, int capacidad, LocalDate fechaRegistro, Double precio, Usuario usuario, Localizacion localizacion) {
        this.idEstacionamiento = idEstacionamiento;
        this.tipoEstacionamiento = tipoEstacionamiento;
        this.disponibilidad = disponibilidad;
        this.foto = foto;
        this.promedioValoracion = promedioValoracion;
        this.capacidad = capacidad;
        this.fechaRegistro = fechaRegistro;
        this.precio = precio;
        this.usuario = usuario;
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

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Localizacion getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(Localizacion localizacion) {
        this.localizacion = localizacion;
    }
}