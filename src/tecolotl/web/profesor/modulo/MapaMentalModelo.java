package tecolotl.web.profesor.modulo;

public class MapaMentalModelo {
    private String pregunta;
    private int puntaje1;
    private int puntaje2;
    private int puntaje3;
    private int puntaje4;

    public MapaMentalModelo(String pregunta, int puntaje1, int puntaje2, int puntaje3, int puntaje4) {
        this.pregunta = pregunta;
        this.puntaje1 = puntaje1;
        this.puntaje2 = puntaje2;
        this.puntaje3 = puntaje3;
        this.puntaje4 = puntaje4;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public int getPuntaje1() {
        return puntaje1;
    }

    public void setPuntaje1(int puntaje1) {
        this.puntaje1 = puntaje1;
    }

    public int getPuntaje2() {
        return puntaje2;
    }

    public void setPuntaje2(int puntaje2) {
        this.puntaje2 = puntaje2;
    }

    public int getPuntaje3() {
        return puntaje3;
    }

    public void setPuntaje3(int puntaje3) {
        this.puntaje3 = puntaje3;
    }

    public int getPuntaje4() {
        return puntaje4;
    }

    public void setPuntaje4(int puntaje4) {
        this.puntaje4 = puntaje4;
    }
}
