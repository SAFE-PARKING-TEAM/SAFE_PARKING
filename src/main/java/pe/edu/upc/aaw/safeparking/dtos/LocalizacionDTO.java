package pe.edu.upc.aaw.safeparking.dtos;

public class LocalizacionDTO {
    private int idLocalizacion;
    private String direccion;
    private String distrito;
    private String region;
    private String referencia;

    public int getIdLocalizacion() {return idLocalizacion;}

    public void setIdLocalizacion(int idLocalizacion) {this.idLocalizacion = idLocalizacion;}

    public String getDireccion() { return direccion;}

    public void setDireccion(String direccion) { this.direccion = direccion;}

    public String getDistrito() {return distrito;}

    public void setDistrito(String distrito) {this.distrito = distrito;}

    public String getRegion() {return region;}

    public void setRegion(String region) {this.region = region;}

    public String getReferencia() {return referencia;}

    public void setReferencia(String referencia) {this.referencia = referencia;}


}
