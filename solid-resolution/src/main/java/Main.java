package main.java;

import main.java.ISP.Contacto;
import main.java.ISP.EmailSender;
import main.java.ISP.GmailAccount;
import main.java.ISP.SMSSender;
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

        // ISP

        GmailAccount gmailAccount = new GmailAccount("mateo","mateo@gmail.com");
        Contacto contacto = new Contacto("lea","direccion","lea@gmail.com","123456");

        SMSSender.sendSMS(contacto,"mensaje");
        EmailSender.sendEmail(contacto,"mensaje");
        EmailSender.sendEmail(gmailAccount,"mensaje");
    }
}
