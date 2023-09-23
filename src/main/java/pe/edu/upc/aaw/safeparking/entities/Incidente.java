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
    private String tipoIncidencia;

    @ManyToOne
    @JoinColumn(name="idUsuario")
    private Users users;

    public Incidente(int idIncidente, String descripcion, String tipoIncidencia, Users users) {
        this.idIncidente = idIncidente;
        this.descripcion = descripcion;
        this.tipoIncidencia = tipoIncidencia;
        this.users = users;
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

    public String getTipoIncidencia() {
        return tipoIncidencia;
    }

    public void setTipoIncidencia(String tipoIncidencia) {
        this.tipoIncidencia = tipoIncidencia;
    }

    public Users getUsuario() {
        return users;
    }

    public void setUsuario(Users users) {
        this.users = users;
    }
}
