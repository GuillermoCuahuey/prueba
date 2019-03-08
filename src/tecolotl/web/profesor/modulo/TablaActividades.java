package web.profesor.modulo;

public class TablaActividades {

    private String fecha;
    private String titulo;
    private String puntuacion;
    private String monedas;
    private String actividades;
    private int id;

    public TablaActividades(String fecha, String titulo, String puntuacion, String monedas, String actividades, int id) {
        this.fecha = fecha;
        this.titulo = titulo;
        this.puntuacion = puntuacion;
        this.monedas = monedas;
        this.actividades = actividades;
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getMonedas() {
        return monedas;
    }

    public void setMonedas(String monedas) {
        this.monedas = monedas;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
