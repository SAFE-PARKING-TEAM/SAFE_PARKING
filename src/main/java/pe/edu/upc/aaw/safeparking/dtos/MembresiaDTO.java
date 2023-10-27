package pe.edu.upc.aaw.safeparking.dtos;

import java.time.LocalDate;

public class MembresiaDTO {

    private int id_membresia;
    private String tipoMembresia;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precio;

    public int getIdMembresia() {
        return id_membresia;
    }

    public void setIdMembresia(int id_membresia) {
        this.id_membresia = id_membresia;
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