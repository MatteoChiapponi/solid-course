package main.java.ISP;

public class EmailSender {

    public static void sendEmail(IEmailGetter emailGetter, String message){
        //Envía un mensaje la direccion de correo del Contacto c.
        var email = emailGetter.getEmail();
        System.out.println("enviando mensaje al correo: " +  email);
    }
}
