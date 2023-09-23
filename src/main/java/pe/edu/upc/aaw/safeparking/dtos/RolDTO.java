package pe.edu.upc.aaw.safeparking.dtos;

import pe.edu.upc.aaw.safeparking.entities.Users;

public class RolDTO {
    private int idRol;
    private String nombreRol;
    private UsuarioDTO users;

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public UsuarioDTO getUsuario() {
        return users;
    }

    public void setUsuario(UsuarioDTO users) {
        this.users = users;
    }
}


