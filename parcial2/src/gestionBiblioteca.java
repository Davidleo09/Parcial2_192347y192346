public class gestionBiblioteca {
    private Libro[] libros;
    private Usuario[] usuarios;
    private int cantidadLibros;
    private int cantidadUsuarios;

    public void GestionBiblioteca() {
        this.libros = new Libro[100]; 
        this.usuarios = new Usuario[100];
        this.cantidadLibros = 0;
        this.cantidadUsuarios = 0;
    }

    public void registrarLibro(Libro libro) {
        if (cantidadLibros < libros.length) {
            libros[cantidadLibros] = libro;
            cantidadLibros++;
            System.out.println("Libro \"" + libro.getTitulo() + "\" registrado en la biblioteca.");
        } else {
            System.out.println("No se puede registrar más libros.");
        }
    }

    public void registrarUsuario(Usuario usuario) {
        if (cantidadUsuarios < usuarios.length) {
            usuarios[cantidadUsuarios] = usuario;
            cantidadUsuarios++;
            System.out.println("Usuario \"" + usuario.getNombre() + "\" registrado en la biblioteca.");
        } else {
            System.out.println("No se puede registrar más usuarios.");
        }
    }

    public boolean verificarDisponibilidad(String titulo) {
        for (int i = 0; i < cantidadLibros; i++) {
            if (libros[i].getTitulo().equals(titulo)) {
                return libros[i].getEstado();
            }
        }
        return false;
    }

    public void mostrarHistorialPrestamos() {
        for (int i = 0; i < cantidadUsuarios; i++) {
            System.out.print("Usuario: " + usuarios[i].getNombre() + ", Libros prestados: ");
            for (Libro libro : usuarios[i].getLibrosPrestados()) {
                if (libro != null) {
                    System.out.print(libro.getTitulo() + " ");
                }
            }
            System.out.println();
        }
    }
}
