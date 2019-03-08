package tecolotl.web.profesor.modulo;

import java.sql.Time;

public class ActividadesModelo {
    private String tag;
    private String titulo;
    private String descripcion;
    private String tiempo;
    private String url;

    public ActividadesModelo(String tag, String titulo, String descripcion, String tiempo, String url) {
        this.tag = tag;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
        this.url = url;
    }

    public ActividadesModelo(String tag, String titulo, String descripcion, String tiempo) {
        this.tag = tag;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }
}
