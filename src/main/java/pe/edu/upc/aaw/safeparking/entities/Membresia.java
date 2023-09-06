package pe.edu.upc.aaw.safeparking.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "membresia")
public class Membresia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMembresia;
    @Column(name = "tipoMembresia", nullable = false, length = 50)
    private String tipoMembresia;
    @Column(name = "fechaInicio", nullable = false)
    private LocalDate fechaInicio;
    @Column(name = "fechaFin", nullable = false)
    private LocalDate fechaFin;
    @Column(name = "precio", nullable = false)
    private double precio;

    public Membresia(int idMembresia, String tipoMembresia, LocalDate fechaInicio, LocalDate fechaFin, double precio) {
        this.idMembresia = idMembresia;
        this.tipoMembresia = tipoMembresia;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public Membresia() {
    }

    public int getIdMembresia() {
        return idMembresia;
    }

    public void setIdMembresia(int idMembresia) {
        this.idMembresia = idMembresia;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

