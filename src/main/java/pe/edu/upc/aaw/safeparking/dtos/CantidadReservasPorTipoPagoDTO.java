package pe.edu.upc.aaw.safeparking.dtos;

public class CantidadReservasPorTipoPagoDTO {

    private int reservation_quantity;
    private String tipoPgo;

    public int getReservation_quantity() {
        return reservation_quantity;
    }

    public void setReservation_quantity(int reservation_quantity) {
        this.reservation_quantity = reservation_quantity;
    }

    public String getTipoPgo() {
        return tipoPgo;
    }

    public void setTipoPgo(String tipoPgo) {
        this.tipoPgo = tipoPgo;
    }
}
