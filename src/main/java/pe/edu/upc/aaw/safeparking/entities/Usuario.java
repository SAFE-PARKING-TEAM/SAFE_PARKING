package pe.edu.upc.aaw.safeparking.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name ="nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name ="apellido", length = 50, nullable = false)
    private String apellido;
    @Column(name ="correo", length = 100, nullable = false)
    private String correo;
    @Column(name ="username", length = 50, nullable = false)
    private String username;
    @Column(name ="password", length = 200, nullable = false)
    private String password;
    @Column(name ="genero", length = 50, nullable = false)
    private String genero;
    @Column(name ="dni", nullable = false)
    private Long dni;
    @Column(name ="imagen", length = 100, nullable = false)
    private String imagen;
    @Column(name ="fechaNacimiento", nullable = false)
    private LocalDate fechaNacimiento;
    @Column(name ="telefono", nullable = false)
    private Long telefono;
    @Column(name ="enabled", nullable = false)
    private Boolean enabled;
    @ManyToOne
    @JoinColumn(name = "idMembresia")
    private Membresia membresia;


    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String apellido, String correo, String username, String password, String genero, Long dni, String imagen, LocalDate fechaNacimiento, Long telefono, Boolean enabled, Membresia membresia) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.username = username;
        this.password = password;
        this.genero = genero;
        this.dni = dni;
        this.imagen = imagen;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.enabled = enabled;
        this.membresia = membresia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}