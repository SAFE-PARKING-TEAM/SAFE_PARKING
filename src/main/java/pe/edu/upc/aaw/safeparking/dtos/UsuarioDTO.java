package pe.edu.upc.aaw.safeparking.dtos;

import pe.edu.upc.aaw.safeparking.entities.Membresia;

import java.time.LocalDate;

public class UsuarioDTO {
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String username;
    private String password;
    private String genero;
    private int dni;
    private String imagen;
    private LocalDate fechaNacimiento;
    private int telefono;
    private MembresiaDTO membresia;
    private Boolean enabled;
    //private List<Role> roles;

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

    public MembresiaDTO getMembresia() {
        return membresia;
    }

    public void setMembresia(MembresiaDTO membresia) {
        this.membresia = membresia;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public UsuarioDTO() {
    }

    public UsuarioDTO(int idUsuario, String nombre, String apellido, String correo, String username, String password, String genero, int dni, String imagen, LocalDate fechaNacimiento, int telefono, MembresiaDTO membresia, Boolean enabled) {
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
        this.membresia = membresia;
        this.enabled = enabled;
    }
}