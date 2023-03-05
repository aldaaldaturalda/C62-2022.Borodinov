package homework.interfaces;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.getMessage();
        client.sentMessage();
        Smartphone smartphone = new Smartphone();
        smartphone.checkSmartphone();
        Application.checkStatic();
    }
}
