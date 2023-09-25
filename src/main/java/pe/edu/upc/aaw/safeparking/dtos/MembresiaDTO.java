package pe.edu.upc.aaw.safeparking.dtos;

import java.time.LocalDate;

public class MembresiaDTO {

    private int idMembresia;
    private String tipoMembresia;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double precio;

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

    public MembresiaDTO() {
    }

    public MembresiaDTO(int idMembresia, String tipoMembresia, LocalDate fechaInicio, LocalDate fechaFin, double precio) {
        this.idMembresia = idMembresia;
        this.tipoMembresia = tipoMembresia;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }
}
