package models;

public class Archer implements CreateTypeOfWarriors {
    @Override
    public void getTypeOfWeapon() {
        System.out.println("Лучник стреляет из лука");
    }
}
