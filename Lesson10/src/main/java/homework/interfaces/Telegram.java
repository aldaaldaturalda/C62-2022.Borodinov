package homework.interfaces;

public class Telegram implements Messenger, Application {
    @Override
    public void getMessage() {
        System.out.println("Вы получили сообщение");
    }

    @Override
    public void sentMessage() {
        System.out.println("У вас пропущенное сообщение");
    }
}
