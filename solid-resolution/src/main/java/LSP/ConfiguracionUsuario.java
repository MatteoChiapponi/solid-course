package main.java.LSP;

public class ConfiguracionUsuario implements Loadable, Saveable{
    @Override
    public void load() {
        System.out.println("Configuracion usuario cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuracion usuario almacenada");
    }
}
