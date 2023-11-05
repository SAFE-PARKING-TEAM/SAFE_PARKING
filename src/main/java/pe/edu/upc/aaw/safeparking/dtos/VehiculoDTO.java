package pe.edu.upc.aaw.safeparking.dtos;

public class VehiculoDTO {
    private int idVehiculo;
    private String placaVehiculo;
    private String categoriaVehiculo;
    private String colorVehiculo;
    private String marcaVehiculo;
    private String tamanioVehiculo;
    private String tarjetaPropiedadVehiculo;
    private String imagenVehiculo;

    public String getImagenVehiculo() {
        return imagenVehiculo;
    }

    public void setImagenVehiculo(String imagenVehiculo) {
        this.imagenVehiculo = imagenVehiculo;
    }

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

    public String getTamanioVehiculo() {
        return tamanioVehiculo;
    }

    public void setTamanioVehiculo(String tamanioVehiculo) {
        this.tamanioVehiculo = tamanioVehiculo;
    }

    public String getTarjetaPropiedadVehiculo() {
        return tarjetaPropiedadVehiculo;
    }

    public void setTarjetaPropiedadVehiculo(String tarjetaPropiedadVehiculo) {
        this.tarjetaPropiedadVehiculo = tarjetaPropiedadVehiculo;
    }
}