package tecolotl.web.ejercicios.modelo;

public class EjerciciosModelo {
    private String nombreActividad;
    private String tipoAprendizaje;
    private int tiempoActividad;
    private String topico;
    private String lenguaje;
    private String preguntaDetonadora;

    public EjerciciosModelo(String nombreActividad, String tipoAprendizaje, int tiempoActividad, String topico, String lenguaje, String preguntaDetonadora) {
        this.nombreActividad = nombreActividad;
        this.tipoAprendizaje = tipoAprendizaje;
        this.tiempoActividad = tiempoActividad;
        this.topico = topico;
        this.lenguaje = lenguaje;
        this.preguntaDetonadora = preguntaDetonadora;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getTipoAprendizaje() {
        return tipoAprendizaje;
    }

    public void setTipoAprendizaje(String tipoAprendizaje) {
        this.tipoAprendizaje = tipoAprendizaje;
    }

    public int getTiempoActividad() {
        return tiempoActividad;
    }

    public void setTiempoActividad(int tiempoActividad) {
        this.tiempoActividad = tiempoActividad;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getPreguntaDetonadora() {
        return preguntaDetonadora;
    }

    public void setPreguntaDetonadora(String preguntaDetonadora) {
        this.preguntaDetonadora = preguntaDetonadora;
    }
}
