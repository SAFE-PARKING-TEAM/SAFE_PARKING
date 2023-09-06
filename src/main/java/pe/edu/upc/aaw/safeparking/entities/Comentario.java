package pe.edu.upc.aaw.safeparking.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idComentario;
    @Column(name = "contenido", length = 50, nullable = false)
    private String contenido;
    @Column(name = "valoracion", nullable = false)
    private int valoracion;
    @Column(name = "fechaCreacion", nullable = false)
    private LocalDate fechaCreacion;

    @ManyToOne
    @JoinColumn(name = "idReservaEstacionamiento")
    private ReservaEstacionamiento reservaEstacionamiento;

    public Comentario() {
    }

    public Comentario(int idComentario, String contenido, int valoracion, LocalDate fechaCreacion, ReservaEstacionamiento reservaEstacionamiento) {
        this.idComentario = idComentario;
        this.contenido = contenido;
        this.valoracion = valoracion;
        this.fechaCreacion = fechaCreacion;
        this.reservaEstacionamiento = reservaEstacionamiento;
    }

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
