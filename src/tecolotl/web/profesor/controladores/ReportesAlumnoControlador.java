package web.profesor.controladores;

import tecolotl.web.controlador.PaginacionControlador;
import web.profesor.modulo.TablaActividades;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collection;

@RequestScoped
@Named

public class ReportesAlumnoControlador extends PaginacionControlador<TablaActividades> {

    private TablaActividades tablaActividades;

    @PostConstruct

    public void init() {

        Collection<TablaActividades> collection = new ArrayList<>();
        for (int i=0; i < 10; i++) {
            ((ArrayList<TablaActividades>) collection).add(new TablaActividades("10/03/2019","What do you do before sleeping?","90%","250","",i));
        }
        getCollectionDataModel().setWrappedData(collection);
    }

    public TablaActividades getTablaActividades() {
        return tablaActividades;
    }

    public void setTablaActividades(TablaActividades tablaActividades) {
        this.tablaActividades = tablaActividades;
    }
}
