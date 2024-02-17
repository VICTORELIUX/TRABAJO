public class Usuario {
    public String nombre;
    public Video videoSubido;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Video getVideoSubido() {
        return videoSubido;
    }

    public void subirVideo(Video video) {
        this.videoSubido = video;
    }

    public void mostrarInfoUsuario() {
        System.out.println("Nombre del usuario: " + nombre);
        if (videoSubido != null) {
            System.out.println("Video subido por el usuario: " + videoSubido.getTitulo());
        } else {
            System.out.println("El usuario no ha subido ningún video.");
        }
    }
}