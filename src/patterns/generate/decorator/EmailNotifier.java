package patterns.generate.decorator;

public class EmailNotifier implements Notifier{

    private Notifier notifier;

    public  EmailNotifier(Notifier notifier){
        this.notifier = notifier;
    }


    public  EmailNotifier(){

    }

    @Override
    public void send(String message) {
        if (notifier!=null) notifier.send(message);
        System.out.println("Email отправлен: " + message);
    }
}


