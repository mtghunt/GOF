package patterns.generate.decorator;

public class SmsNotifier implements Notifier{

    private Notifier notifier;

    public SmsNotifier(Notifier notifier){
        this.notifier = notifier;
    }

    public  SmsNotifier(){

    }

    @Override
    public void send(String message) {
        if (notifier!=null) notifier.send(message);
        System.out.println("Sms отправлен: " + message);
    }
}
