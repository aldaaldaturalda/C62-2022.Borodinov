package main;

import models.CreateFactoryDoWarriorsImpl;
import models.SquadElf;
import models.SquadOrk;
import models.SquadPeople;

/*
Написать программу, эмулирующую компьютерную игру.
В игре имеется несколько отрядов персонажей:
- отряд орков OrcSquad
- отряд элфов ElfSquad
- отряд людей PeopleSquad
В каждом отряде есть следующие солдаты:
- воин warrior
- маг mage
- лучник archer
Воин рубится на мечах.
Маг колдует.
Лучник стреляет из лука.
Используя паттерн проектирования Abstract Factory, реализовать персонажей игры и их действия.
 */
public class Main {
    public static void main(String[] args) {
//        CreateFactoryDoWarriorsImpl squadElf = new SquadElf();
//        squadElf.createArcher().GetTypeOfWeapon();
//        squadElf.createWarrior().GetTypeOfWeapon();
//        squadElf.createWizard().GetTypeOfWeapon();
        CreateFactoryDoWarriorsImpl createTypeOfWarriors = CreateTypeOfWarriors("squadork");
        createTypeOfWarriors.createArcher().GetTypeOfWeapon();
        createTypeOfWarriors.createWizard().GetTypeOfWeapon();
        createTypeOfWarriors.createWarrior().GetTypeOfWeapon();
        System.out.println("!!!");
        CreateFactoryDoWarriorsImpl people = CreateTypeOfWarriors("squadpeople");
        createTypeOfWarriors.createWarrior().GetTypeOfWeapon();
        createTypeOfWarriors.createWizard().GetTypeOfWeapon();
        createTypeOfWarriors.createArcher().GetTypeOfWeapon();
        System.out.println("!!!");
        CreateFactoryDoWarriorsImpl elf = CreateTypeOfWarriors("squadelf");
        createTypeOfWarriors.createWizard().GetTypeOfWeapon();
        createTypeOfWarriors.createArcher().GetTypeOfWeapon();
        createTypeOfWarriors.createWarrior().GetTypeOfWeapon();
    }

    static CreateFactoryDoWarriorsImpl CreateTypeOfWarriors(String type) {
        if (type.equalsIgnoreCase("Squadork")) {
            return new SquadOrk();
        } else if (type.equalsIgnoreCase("SquadElf")) {
            return new SquadElf();
        } else if (type.equalsIgnoreCase("SquadPeople")) {
            return new SquadPeople();
        } else {
            throw new RuntimeException(type + "Have no person what you wanted ");
        }
    }
}
