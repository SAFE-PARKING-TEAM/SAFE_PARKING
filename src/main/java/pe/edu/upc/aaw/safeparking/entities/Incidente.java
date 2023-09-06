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
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

}
