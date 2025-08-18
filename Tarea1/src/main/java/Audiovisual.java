/**
 *
 * @author randa
 */
public class Audiovisual {
    private String titulo;
    private String genero;
    private int anio;
    private double clasificacion;
    private String comentario;

    public Audiovisual(String titulo, String genero, int anio, double clasificacion, String comentario) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.clasificacion = clasificacion;
        this.comentario = comentario;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }
    public double getClasificacion() { return clasificacion; }
    public void setClasificacion(double clasificacion) { this.clasificacion = clasificacion; }
    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }
}
