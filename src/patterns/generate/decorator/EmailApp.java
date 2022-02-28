package patterns.generate.decorator;

public class EmailApp {

    public static void main(String[] args) {

        //email->wu->sms->null

        Notifier sms = new SmsNotifier();
        Notifier wu = new WhatsupNotifier(sms);
        SecurityProxy email = new SecurityProxy(new EmailNotifier(wu));

        if(email.checkAccess() )
            email.send("Привер Вася");

    }

}
