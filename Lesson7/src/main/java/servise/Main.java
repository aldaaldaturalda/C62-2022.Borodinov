package servise;

import model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Benq", "32gb", "1023gb", 1000);
        for (int i = 0; i < 1023; i++) {
            computer.on();
            computer.off();
        }
    }
}
