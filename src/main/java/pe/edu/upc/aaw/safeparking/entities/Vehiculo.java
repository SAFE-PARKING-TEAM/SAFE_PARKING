package pe.edu.upc.aaw.safeparking.entities;

import javax.persistence.*;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVehiculo;
    @Column(name = "placaVehiculo",nullable = false,length = 8)
    private String placaVehiculo;
    @Column(name = "categoriaVehiculo",nullable = false,length = 15)
    private String categoriaVehiculo;
    @Column(name = "colorVehiculo",nullable = false,length = 20)
    private String colorVehiculo;
    @Column(name = "marcaVehiculo",nullable = false,length = 20)
    private String marcaVehiculo;
    @Column(name = "tamanioVehiculo",nullable = false ,length = 20)
    private String tamanioVehiculo;
    @Column(name = "tarjetaPropiedadVehiculo",nullable = false, length = 50)
    private String tarjetaPropiedadVehiculo;
    @Column(name = "imagenVehiculo",nullable = false, length = 50)
    private String imagenVehiculo;
    public Vehiculo() {
    }

    public Vehiculo(int idVehiculo, String placaVehiculo, String categoriaVehiculo, String colorVehiculo, String marcaVehiculo, String tamanioVehiculo, String tarjetaPropiedadVehiculo, String imagenVehiculo) {
        this.idVehiculo = idVehiculo;
        this.placaVehiculo = placaVehiculo;
        this.categoriaVehiculo = categoriaVehiculo;
        this.colorVehiculo = colorVehiculo;
        this.marcaVehiculo = marcaVehiculo;
        this.tamanioVehiculo = tamanioVehiculo;
        this.tarjetaPropiedadVehiculo = tarjetaPropiedadVehiculo;
        this.imagenVehiculo = imagenVehiculo;
    }

    public String getImagenVehiculo() {
        return imagenVehiculo;
    }

    public void setImagenVehiculo(String imagenVehiculo) {
        this.imagenVehiculo = imagenVehiculo;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public String getCategoriaVehiculo() {
        return categoriaVehiculo;
    }

    public String getColorVehiculo() {
        return colorVehiculo;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public String getTamanioVehiculo() {
        return tamanioVehiculo;
    }

    public String getTarjetaPropiedadVehiculo() {
        return tarjetaPropiedadVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public void setCategoriaVehiculo(String categoriaVehiculo) {
        this.categoriaVehiculo = categoriaVehiculo;
    }

    public void setColorVehiculo(String colorVehiculo) {
        this.colorVehiculo = colorVehiculo;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public void setTamanioVehiculo(String tamanioVehiculo) {
        this.tamanioVehiculo = tamanioVehiculo;
    }

    public void setTarjetaPropiedadVehiculo(String tarjetaPropiedadVehiculo) {
        this.tarjetaPropiedadVehiculo = tarjetaPropiedadVehiculo;
    }
}