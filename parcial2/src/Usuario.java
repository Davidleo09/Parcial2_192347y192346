public class Usuario {
    String nombre;
    private String ID;
    private Libro[] librosPrestados;
    private int maxPrestados;
    private int cantidadPrestados;    

    public Usuario(String nombre, String ID, int librosPrestados){
        this.nombre = nombre;
        this.ID = ID;
        this.librosPrestados = new Libro[3]; 
        this.maxPrestados = 3;
        this.cantidadPrestados = 0;
    }
    public void prestarLibro(Libro libro){
        if (cantidadPrestados < maxPrestados) {
            if (libro.getEstado()) {
                libro.prestar();
                librosPrestados[cantidadPrestados] = libro;
                cantidadPrestados++;
                System.out.println(nombre + " ha tomado prestado el libro \"" + libro.getTitulo() + "\".");
            } 
            else {
                System.out.println("El libro \"" + libro.getTitulo() + "\" no está disponible.");
            }
        } 
        else {
            System.out.println(nombre + " ya tiene el máximo permitido de " + maxPrestados + " libros prestados.");
        }
    }
    public void devolverLibro(Libro libro) {
        boolean encontrado = false;
        for (int i = 0; i < cantidadPrestados; i++) {
            if (librosPrestados[i] == libro) {
                libro.devolver();
                librosPrestados[i] = librosPrestados[cantidadPrestados - 1]; 
                librosPrestados[cantidadPrestados - 1] = null;
                cantidadPrestados--;
                encontrado = true;
                System.out.println(nombre + " ha devuelto el libro " + libro.getTitulo() + ".");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El libro " + libro.getTitulo() + " no fue prestado por " + nombre + ".");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Libro[] getLibrosPrestados() {
        return librosPrestados;
    }
}


