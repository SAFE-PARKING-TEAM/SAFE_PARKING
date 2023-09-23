package pe.edu.upc.aaw.safeparking.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "pago")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;
    @Column(name = "fechaEmision",nullable = false)
    private LocalDate fechaEmision;
    @Column(name = "precioTotal",nullable = false)
    private double precioTotal;
    @Column(name = "tipoPago",nullable = false,length = 50)
    private String tipoPago;

    @OneToOne
    @JoinColumn(name = "idReservaEstacionamiento")
    private ReservaEstacionamiento reservaEstacionamiento;

    public Pago() {
    }
    public Pago(int idPago, LocalDate fechaEmision, double precioTotal, String tipoPago, ReservaEstacionamiento reservaEstacionamiento) {
        this.idPago = idPago;
        this.fechaEmision = fechaEmision;
        this.precioTotal = precioTotal;
        this.tipoPago = tipoPago;
        this.reservaEstacionamiento = reservaEstacionamiento;
    }

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

    public ReservaEstacionamiento getReservaEstacionamiento() {
        return reservaEstacionamiento;
    }

    public void setReservaEstacionamiento(ReservaEstacionamiento reservaEstacionamiento) {
        this.reservaEstacionamiento = reservaEstacionamiento;
    }
}
