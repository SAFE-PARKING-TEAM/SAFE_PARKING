package pe.edu.upc.aaw.safeparking.dtos;

public class PrecioTotalporMesDTO {

    private double PrecioTotal;
    private String Mes;

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        PrecioTotal = precioTotal;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String mes) {
        Mes = mes;
    }
}
