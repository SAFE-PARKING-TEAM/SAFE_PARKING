package pe.edu.upc.aaw.safeparking.dtos;

public class CantidadReservasPorUsuarioDTO {
    private String nameUser;
    private int quantityReservation;

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }


    public int getQuantityReservation() {
        return quantityReservation;
    }

    public void setQuantityReservation(int quantityReservation) {
        this.quantityReservation = quantityReservation;
    }
}