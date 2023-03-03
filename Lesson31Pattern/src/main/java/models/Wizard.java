package models;

public class Wizard implements CreateTypeOfWeapons {
    @Override
    public void getTypeOfWeapon() {
        System.out.println("Маг колдует");
    }
}
