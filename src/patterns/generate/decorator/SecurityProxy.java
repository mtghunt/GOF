package patterns.generate.decorator;

public class SecurityProxy implements Notifier{

    private Notifier n;

    public SecurityProxy(Notifier n) {
      this.n = n;
    }


    public void send(String message) {
        n.send(message);

    }

    boolean checkAccess(){
        return false;
    }
}
