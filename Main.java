public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Victoreliux");
        Video video1 = new Video("Las frustraciones al no poner atencion al cien en clase", 120, "url1");
        usuario1.subirVideo(video1);
        
        usuario1.mostrarInfoUsuario();

        Usuario usuario2 = new Usuario("Slimm27");
        Comentario comentario1 = new Comentario("Saquenme de latinoamerica", usuario2);
        System.out.println("Contenido del comentario: " + comentario1.getContenido());
        System.out.println("Autor del comentario: " + comentario1.getAutor().nombre);

        Visualizacion visualizacion = new Visualizacion(usuario1, video1);
        System.out.println("Espectador: " + visualizacion.getEspectador().nombre);
        System.out.println("Video: " + visualizacion.getVideo().titulo);
    }
}