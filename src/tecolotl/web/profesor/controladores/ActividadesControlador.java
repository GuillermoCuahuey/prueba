package tecolotl.web.profesor.controladores;

import tecolotl.web.coordinacion.modulo.TareaModelo;
import tecolotl.web.profesor.modulo.ActividadesModelo;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@Named
public class ActividadesControlador {

    private List<ActividadesModelo> tarea1;

    private List<ActividadesModelo> tarea2;
    private List<ActividadesModelo> tarea3;
    private List<ActividadesModelo> tarea4;

    @PostConstruct
    public void init(){
        tarea1 = new ArrayList<>();
        tarea2 = new ArrayList<>();
        tarea3 = new ArrayList<>();
        tarea4 = new ArrayList<>();
        for (int i = 0; i < 3; i++){
            tarea1.add(new ActividadesModelo("sports","plays and games with your friends","aprende sobre los direrentes temas a tratar de deportes","10:12","https://vimeo.com/319326066"));
        }
        for (int i = 0; i < 2; i++){
            tarea2.add(new ActividadesModelo("gettings","Meet people","aprende como conocer nuevas personas","25:12"));
        }
        for (int i = 0; i < 4; i++){
            tarea3.add(new ActividadesModelo("to be","Learning about this verb","usa el verbo to be mejor","08:12"));
        }
        for (int i = 0; i < 5; i++){
            tarea4.add(new ActividadesModelo("Time and preposition","Preposition of time","tiempos y preposiciones","9:12"));
        }
    }

    public List<ActividadesModelo> getTarea1() {
        return tarea1;
    }

    public void setTarea1(List<ActividadesModelo> tarea1) {
        this.tarea1 = tarea1;
    }

    public List<ActividadesModelo> getTarea2() {
        return tarea2;
    }

    public void setTarea2(List<ActividadesModelo> tarea2) {
        this.tarea2 = tarea2;
    }

    public List<ActividadesModelo> getTarea3() {
        return tarea3;
    }

    public void setTarea3(List<ActividadesModelo> tarea3) {
        this.tarea3 = tarea3;
    }

    public List<ActividadesModelo> getTarea4() {
        return tarea4;
    }

    public void setTarea4(List<ActividadesModelo> tarea4) {
        this.tarea4 = tarea4;
    }
}
