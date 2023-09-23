package pe.edu.upc.aaw.safeparking.dtos;

import pe.edu.upc.aaw.safeparking.entities.Users;

public class IncidenteDTO {
    private int idIncidente;
    private String descripcion;
    private String tipoIncidente;
    private UsuarioDTO users;

    public UsuarioDTO getUsuario() {
        return users;
    }

    public void setUsuario(UsuarioDTO users) {
        this.users = users;
    }

    public int getIdIncidente() {
        return idIncidente;
    }

    public void setIdIncidente(int idIncidente) {
        this.idIncidente = idIncidente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoIncidente() {
        return tipoIncidente;
    }

    public void setTipoIncidente(String tipoIncidente) {
        this.tipoIncidente = tipoIncidente;
    }
}
