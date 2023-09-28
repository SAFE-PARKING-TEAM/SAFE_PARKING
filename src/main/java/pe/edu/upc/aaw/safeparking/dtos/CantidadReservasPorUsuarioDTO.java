package pe.edu.upc.aaw.safeparking.dtos;

public class CantidadReservasPorUsuarioDTO {
    private int nameUser;
    private String nameRole;
    private int quantityReservation;

    public int getNameUser() {
        return nameUser;
    }

    public void setNameUser(int nameUser) {
        this.nameUser = nameUser;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public int getQuantityReservation() {
        return quantityReservation;
    }

    public void setQuantityReservation(int quantityReservation) {
        this.quantityReservation = quantityReservation;
    }
}