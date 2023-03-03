package main;

import models.*;

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
        CreateFactoryDoSquadImpl ork = createFactoryDoWarriors("squadork");
        ork.createWarrior().getTypeOfWeapon();
        ork.createArcher().getTypeOfWeapon();
        ork.createWizard().getTypeOfWeapon();
        System.out.println("!!!");
        CreateFactoryDoSquadImpl people = createFactoryDoWarriors("squadpeople");
        people.createWizard().getTypeOfWeapon();
        people.createArcher().getTypeOfWeapon();
        people.createWarrior().getTypeOfWeapon();
        System.out.println("!!!");
        CreateFactoryDoSquadImpl elf = createFactoryDoWarriors("squadelf");
        elf.createWarrior().getTypeOfWeapon();
        elf.createArcher().getTypeOfWeapon();
        elf.createWizard().getTypeOfWeapon();
        System.out.println("!!!!");

    }

    static CreateFactoryDoSquadImpl createFactoryDoWarriors(String type) {
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

    static CreateRobokopPartsImpl createRobokop(String robotType) {
        if (robotType.equalsIgnoreCase("rObokop")) {
            return new Robokop();
        } else {
            throw new RuntimeException(robotType + "Have no robokop ");
        }
    }
}