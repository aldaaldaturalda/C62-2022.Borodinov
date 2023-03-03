package models;

public class Archer implements CreateTypeOfWarriors {
    @Override
    public void GetTypeOfWeapon() {
        System.out.println("Лучник стреляет из лука");
    }
}
