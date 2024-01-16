package main.java.LSP;

public class ConfiguracionSistema implements Loadable, Saveable {

    @Override
    public void load() {
        System.out.println("Configuracion sistema cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuracion sistema almacenada");
    }
}
