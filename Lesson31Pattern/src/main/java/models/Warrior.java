package models;

public class Warrior implements CreateTypeOfWeapons {

    @Override
    public void getTypeOfWeapon() {
        System.out.println("Воин рубится на мечах");
    }
}
