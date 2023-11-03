package pe.edu.upc.aaw.safeparking.entities;

import javax.persistence.*;

@Entity
@Table(name = "Localizacion")
public class Localizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLocalizacion;
    @Column(name = "direccion", length = 50, nullable = false)
    private String direccion;
    @Column(name = "distrito", length = 50, nullable = false)
    private String distrito;
    @Column(name = "region", length = 50, nullable = false)
    private String region;
    @Column(name = "referencia", length = 50, nullable = false)
    private String referencia;
    @Column(name = "latitud", nullable = false)
    private double latitud;
    @Column(name = "longitud", nullable = false)
    private double longitud;
    public Localizacion() {
    }

    public Localizacion(int idLocalizacion, String direccion, String distrito, String region, String referencia, double latitud, double longitud) {
        this.idLocalizacion = idLocalizacion;
        this.direccion = direccion;
        this.distrito = distrito;
        this.region = region;
        this.referencia = referencia;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(int idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}