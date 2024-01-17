package main.java.ISP;

public class GmailAccount implements IEmailGetter{
    String name, emailAddress;

    public GmailAccount(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    @Override
    public String getEmail() {
        return emailAddress;
    }
}
