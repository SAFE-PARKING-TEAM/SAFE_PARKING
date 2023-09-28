package pe.edu.upc.aaw.safeparking.entities;

import javax.persistence.*;

@Entity
@Table(name = "incidente")
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idIncidente;
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    @Column(name = "tipoIncidente", nullable = false, length = 50)
    private String tipoIncidente;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Usuario usuario;

    public Incidente(int idIncidente, String descripcion, String tipoIncidente, Usuario usuario) {
        this.idIncidente = idIncidente;
        this.descripcion = descripcion;
        this.tipoIncidente = tipoIncidente;
        this.usuario = usuario;
    }

    public Incidente() {
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}