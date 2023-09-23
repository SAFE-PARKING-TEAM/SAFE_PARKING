package pe.edu.upc.aaw.safeparking.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roles")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRol;
    @Column(name = "nombreRol",nullable = false,length = 50)
    private String nombreRol;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Users users;

    public Role() {
    }

    public Role(int idRol, String nombreRol, Users users) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.users = users;
    }

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

    public Users getUsuario() {
        return users;
    }

    public void setUsuario(Users users) {
        this.users = users;
    }

}
