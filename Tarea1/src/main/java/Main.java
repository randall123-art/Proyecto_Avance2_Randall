/**
 *
 * @author randa
 */
public class Main {
    public static void main(String[] args) {
        Pelicula peli = new Pelicula("Inception", "Ciencia Ficción", 2010, 9.0, "Excelente película.");
        Serie serie = new Serie("Breaking Bad", "Drama", 2008, 9.5, "Muy recomendada.");
        Documental docu = new Documental("Nuestro Planeta", "Naturaleza", 2019, 8.7, "Muy informativo.");
        Usuario usuario = new Usuario("Carlos", "carlos@email.com");
        Usuario.iniciarSesion(usuario);
    }
}
