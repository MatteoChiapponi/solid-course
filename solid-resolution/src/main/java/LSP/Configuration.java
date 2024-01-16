package main.java.LSP;

import java.util.List;

public class Configuration {


    public void cargarConfiguracion(List<Loadable> loadableConfigurations){
        loadableConfigurations.forEach(config -> config.load());
    }

    public void salvarConfiguracion(List<Saveable> saveableConfigurations){
        saveableConfigurations.forEach(config -> config.save());
    }

}
