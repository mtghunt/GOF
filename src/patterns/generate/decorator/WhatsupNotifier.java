package patterns.generate.decorator;

public class WhatsupNotifier implements Notifier{

    private Notifier notifier;

    public WhatsupNotifier(Notifier notifier){
        this.notifier = notifier;
    }

    public  WhatsupNotifier(){

    }

    @Override
    public void send(String message) {
        if (notifier!=null) notifier.send(message);
        System.out.println("Whatsup отправлен: " + message);
    }
}
