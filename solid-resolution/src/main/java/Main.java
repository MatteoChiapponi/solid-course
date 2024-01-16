package main.java;

import main.java.LSP.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // LSP
        ConfiguracionHoraria configuracionHoraria = new ConfiguracionHoraria();
        ConfiguracionUsuario configuracionUsuario = new ConfiguracionUsuario();
        ConfiguracionSistema configuracionSistema = new ConfiguracionSistema();

        List<Loadable> loadableList = List.of(configuracionHoraria,configuracionSistema,configuracionUsuario);
        List<Saveable> saveableList = List.of(configuracionSistema,configuracionUsuario);

        Configuration configuration = new Configuration();
        configuration.cargarConfiguracion(loadableList);
        configuration.salvarConfiguracion(saveableList);
    }
}
