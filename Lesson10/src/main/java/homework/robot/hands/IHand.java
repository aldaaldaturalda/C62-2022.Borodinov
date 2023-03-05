package homework.robot.hands;

public interface IHand {
    void grab();// схватить

    void release();// освободить

    void upAndDown();// двигаться вверх и вниз

    int getPrice(); // получить цену
}
