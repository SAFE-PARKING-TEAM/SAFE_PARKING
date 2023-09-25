package pe.edu.upc.aaw.safeparking.dtos;

public class VehiculoDTO {
    private int idVehiculo;
    private String placaVehiculo;
    private String categoriaVehiculo;
    private String colorVehiculo;
    private String marcaVehiculo;
    private double tamanioVehiculo;
    private String tarjetaPropiedadVehiculo;

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getCategoriaVehiculo() {
        return categoriaVehiculo;
    }

    public void setCategoriaVehiculo(String categoriaVehiculo) {
        this.categoriaVehiculo = categoriaVehiculo;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public double getTamanioVehiculo() {
        return tamanioVehiculo;
    }

    public void setTamanioVehiculo(double tamanioVehiculo) {
        this.tamanioVehiculo = tamanioVehiculo;
    }

    public String getTarjetaPropiedadVehiculo() {
        return tarjetaPropiedadVehiculo;
    }

    public void setTarjetaPropiedadVehiculo(String tarjetaPropiedadVehiculo) {
        this.tarjetaPropiedadVehiculo = tarjetaPropiedadVehiculo;
    }

    public VehiculoDTO() {
    }

    public VehiculoDTO(int idVehiculo, String placaVehiculo, String categoriaVehiculo, String colorVehiculo, String marcaVehiculo, double tamanioVehiculo, String tarjetaPropiedadVehiculo) {
        this.idVehiculo = idVehiculo;
        this.placaVehiculo = placaVehiculo;
        this.categoriaVehiculo = categoriaVehiculo;
        this.colorVehiculo = colorVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.tamanioVehiculo = tamanioVehiculo;
        this.tarjetaPropiedadVehiculo = tarjetaPropiedadVehiculo;
    }
}