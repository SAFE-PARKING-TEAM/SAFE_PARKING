package pe.edu.upc.aaw.safeparking.dtos;

import pe.edu.upc.aaw.safeparking.entities.ReservaEstacionamiento;

import javax.persistence.*;
import java.time.LocalDate;

public class PagoDTO {
    private int idPago;
    private LocalDate fechaEmision;
    private double precioTotal;
    private String tipoPago;
    private ReservaEstacionamientoDTO reservaEstacionamiento;

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public ReservaEstacionamientoDTO getReservaEstacionamiento() {
        return reservaEstacionamiento;
    }

    public void setReservaEstacionamiento(ReservaEstacionamientoDTO reservaEstacionamiento) {
        this.reservaEstacionamiento = reservaEstacionamiento;
    }

    public PagoDTO() {
    }

    public PagoDTO(int idPago, LocalDate fechaEmision, double precioTotal, String tipoPago, ReservaEstacionamientoDTO reservaEstacionamiento) {
        this.idPago = idPago;
        this.fechaEmision = fechaEmision;
        this.precioTotal = precioTotal;
        this.tipoPago = tipoPago;
        this.reservaEstacionamiento = reservaEstacionamiento;
    }
}
