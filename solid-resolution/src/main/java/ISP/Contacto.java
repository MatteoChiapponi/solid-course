package main.java.ISP;

public class Contacto implements IEmailGetter, IPhoneNumberGetter {
    String name, address, emailAddress, telephone;

    public Contacto(String name, String address, String emailAddress, String telephone) {
        this.name = name;
        this.address = address;
        this.emailAddress = emailAddress;
        this.telephone = telephone;
    }
    @Override
    public String getEmail() {
        return emailAddress;
    }

    @Override
    public String getPhoneNumber() {
        return telephone;
    }

}
