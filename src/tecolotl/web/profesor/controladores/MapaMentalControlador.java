package tecolotl.web.profesor.controladores;

import tecolotl.web.controlador.PaginacionControlador;
import tecolotl.web.profesor.modulo.MapaMentalModelo;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@RequestScoped
@Named
public class MapaMentalControlador extends PaginacionControlador<MapaMentalModelo> {
    private List<MapaMentalModelo> mapaMentalModelos;

    @PostConstruct
    public void init(){
        mapaMentalModelos = new ArrayList<>();

        for (int i = 0;i < 11; i++){
            mapaMentalModelos.add(new MapaMentalModelo("What activities do the kittens do?",6,7,8,9));
        }
        getCollectionDataModel().setWrappedData(mapaMentalModelos);
    }

    public List<MapaMentalModelo> getMapaMentalModelos() {
        return mapaMentalModelos;
    }

    public void setMapaMentalModelos(List<MapaMentalModelo> mapaMentalModelos) {
        this.mapaMentalModelos = mapaMentalModelos;
    }
}
