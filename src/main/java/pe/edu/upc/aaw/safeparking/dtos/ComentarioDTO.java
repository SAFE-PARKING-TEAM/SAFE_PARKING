package pe.edu.upc.aaw.safeparking.dtos;

import pe.edu.upc.aaw.safeparking.entities.ReservaEstacionamiento;

import java.time.LocalDate;

public class ComentarioDTO {
    private int idComentario;
    private String contenido;
    private int valoracion;
    private LocalDate fechaCreacion;
    private ReservaEstacionamiento reservaEstacionamiento;

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public ReservaEstacionamiento getReservaEstacionamiento() {
        return reservaEstacionamiento;
    }

    public void setReservaEstacionamiento(ReservaEstacionamiento reservaEstacionamiento) {
        this.reservaEstacionamiento = reservaEstacionamiento;
    }
}
