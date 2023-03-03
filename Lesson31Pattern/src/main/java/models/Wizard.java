package models;

public class Wizard implements CreateTypeOfWeapons {
    @Override
    public void getTypeOfWeapon() {
        System.out.println("Маг колдует");
    }

    @Override
    public void skillSpeed() {
        System.out.println("Speed 20");
    }
}
