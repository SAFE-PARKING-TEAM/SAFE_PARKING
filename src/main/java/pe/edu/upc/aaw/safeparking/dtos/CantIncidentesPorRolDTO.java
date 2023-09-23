package pe.edu.upc.aaw.safeparking.dtos;

public class CantIncidentesPorRolDTO {
    private String nombreRol;
    private int cantIncidentes;

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public int getCantIncidentes() {
        return cantIncidentes;
    }

    public void setCantIncidentes(int cantIncidentes) {
        this.cantIncidentes = cantIncidentes;
    }
}
