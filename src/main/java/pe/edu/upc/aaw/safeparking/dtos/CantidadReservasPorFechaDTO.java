package pe.edu.upc.aaw.safeparking.dtos;

import java.time.LocalDate;

public class CantidadReservasPorFechaDTO {
    private LocalDate date_reservation;
    private int reservation_quantity;

    public LocalDate getDate_reservation() {
        return date_reservation;
    }

    public void setDate_reservation(LocalDate date_reservation) {
        this.date_reservation = date_reservation;
    }

    public int getReservation_quantity() {
        return reservation_quantity;
    }

    public void setReservation_quantity(int reservation_quantity) {
        this.reservation_quantity = reservation_quantity;
    }
}
