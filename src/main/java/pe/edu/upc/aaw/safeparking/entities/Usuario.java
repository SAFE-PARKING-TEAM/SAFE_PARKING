package pe.edu.upc.aaw.safeparking.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name ="nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name ="apellido", length = 50, nullable = false)
    private String apellido;
    @Column(name ="correo", length = 50, nullable = false)
    private String correo;
    @Column(name ="constrasenia", length = 50, nullable = false)
    private String contrasenia;
    @Column(name ="genero", length = 50, nullable = false)
    private String genero;
    @Column(name ="dni", nullable = false)
    private int dni;
    @Column(name ="imagen", length = 100, nullable = false)
    private String imagen;
    @Column(name ="fechaNacimiento", nullable = false)
    private LocalDate fechaNacimiento;
    @Column(name ="telefono", nullable = false)
    private int telefono;

    @ManyToOne
    @JoinColumn(name = "idMembresia")
    private Membresia membresia;

    @ManyToOne
    @JoinColumn(name = "idRol")
    private Rol rol;


    public Usuario() {
    }

    public Usuario(int idUsuario, String nombre, String apellido, String correo, String contrasenia, String genero, int dni, String imagen, LocalDate fechaNacimiento, int telefono, Membresia membresia, Rol rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.genero = genero;
        this.dni = dni;
        this.imagen = imagen;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.membresia = membresia;
        this.rol = rol;
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

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
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

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
