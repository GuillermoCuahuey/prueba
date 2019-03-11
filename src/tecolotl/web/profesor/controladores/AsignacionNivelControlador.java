package web.profesor.controladores;

import tecolotl.web.controlador.PaginacionControlador;
import web.profesor.modulo.TablaNivel;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collection;

@RequestScoped
@Named

public class AsignacionNivelControlador extends PaginacionControlador<TablaNivel> {

    private TablaNivel tablaNivel;

    @PostConstruct

    public void init() {

        int numero = (int) (Math.random() * 8) + 1;
        int numero0 = (int) (Math.random() * 5) + 1;
        int numero1= (int) (Math.random() * 3) + 1;
        int numero2 = (int) (Math.random() * 7) + 1;
        int numero3 = (int) (Math.random() * 6) + 1;
        Collection<TablaNivel> collection = new ArrayList<>();
        for (int i=0; i < 15; i++) {
            ((ArrayList<TablaNivel>) collection).add(new TablaNivel("What do you do before sleeping?" + i,numero,numero0,numero1,numero2,"10/10", i));
        }
        getCollectionDataModel().setWrappedData(collection);
    }

    public TablaNivel getTablaNivel() {
        return tablaNivel;
    }

    public void setTablaNivel(TablaNivel tablaNivel) {
        this.tablaNivel = tablaNivel;
    }
}
