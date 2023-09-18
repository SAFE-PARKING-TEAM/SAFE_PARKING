package pe.edu.upc.aaw.safeparking.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "rol")
public class Rol implements Serializable {

    //private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRol;
    @Column(name = "nombreRol",nullable = false,length = 50)
    private String nombreRol;
    @ManyToOne
    @JoinColumn(name="idUsuario")

    private Usuario usuario;

    public Rol() {
    }
    public Rol(int idRol, String nombreRol, Usuario usuario) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
        this.usuario = usuario;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
