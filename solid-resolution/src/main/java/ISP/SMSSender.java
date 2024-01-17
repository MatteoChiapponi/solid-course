package main.java.ISP;

public class SMSSender {

    public static void sendSMS(IPhoneNumberGetter phoneNumberGetter, String message){
        //Envía un mensaje SMS al teléfono del Contacto c.
        var phoneNumber = phoneNumberGetter.getPhoneNumber();
        System.out.println("enviando mensaje al numero: " + phoneNumber);
    }
}
