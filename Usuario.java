package lab4;
// Clase para representar a un usuario
class Usuario {
    String nombre;
    String contrasena;
    boolean esPremium;
    // Otras propiedades y métodos necesarios
    public Object productosSeleccionados;

    // Constructor
    public Usuario(String nombre, String contrasena, boolean esPremium) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.esPremium = esPremium;
    }
}