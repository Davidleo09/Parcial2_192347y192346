public class Libro{
    String titulo;
    private String autor;
    private String ISBN;
    private boolean estado;

    public Libro(String titulo, String autor, String ISBN, boolean estado){
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.estado = true ;
    }
    public void prestar() {
        if (this.estado) {
            this.estado = false; 
        } else {
            System.out.println("El libro " + this.titulo + " ya está prestado.");
        }
    }

    public void devolver() {
        if (!this.estado) {
            this.estado = true; 
        } else {
            System.out.println("El libro " + this.titulo + " no estaba prestado.");
        }
    }
    public boolean getEstado(){
        return estado;
    }
    public String getTitulo() { 
        return titulo;
    }
}
