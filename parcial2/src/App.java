public class App {
    
    public static void main(String[] args) {
        gestionBiblioteca biblioteca = new gestionBiblioteca();

        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "123456789");
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", "987654321");

        biblioteca.registrarLibro(libro1);
        biblioteca.registrarLibro(libro2);

        Usuario usuario1 = new Usuario("Juan Perez", "001");
        Usuario usuario2 = new Usuario("Maria Garcia", "002");

        biblioteca.registrarUsuario(usuario1);
        biblioteca.registrarUsuario(usuario2);

        usuario1.prestarLibro(libro1);
        usuario1.prestarLibro(libro2);
        usuario1.devolverLibro(libro1);

        biblioteca.mostrarHistorialPrestamos();
    }

}
