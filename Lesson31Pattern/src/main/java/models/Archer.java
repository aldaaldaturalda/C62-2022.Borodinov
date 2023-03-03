package models;

public class Archer implements CreateTypeOfWeapons {
    @Override
    public void getTypeOfWeapon() {
        System.out.println("Лучник стреляет из лука");
    }
}
