package militaryOffice;

import java.util.Arrays;

import static militaryOffice.Sex.MALE;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[15];
        persons[0] = new Person("Vitaliy", 20, MALE, "Belarus", "Minsk");
        persons[1] = new Person("Igor", 25, MALE, "Belarus", "Minsk");
        persons[2] = new Person("Vladimir", 18, MALE, "Belarus", "Minsk");
        persons[3] = new Person("Alexander", 40, MALE, "Belarus", "Minsk");
        persons[4] = new Person("Ignat", 27, MALE, "Belarus", "Minsk");
        persons[5] = new Person("Oleg", 23, MALE, "Belarus", "Homel");
        persons[6] = new Person("Vitold", 42, MALE, "Belarus", "Minsk");
        persons[7] = new Person("Maksim", 38, MALE, "Belarus", "Minsk");
        persons[8] = new Person("Ramil", 21, MALE, "Belarus", "Minsk");
        persons[9] = new Person("Evgeniy", 29, MALE, "Belarus", "Bobryisk");
        persons[10] = new Person("Alexander", 20, MALE, "Belarus", "Minsk");
        persons[11] = new Person("Andrey", 22, MALE, "Belarus", "Minsk");
        persons[12] = new Person("Alexander", 26, MALE, "Belarus", "Minsk");
        persons[13] = new Person("Vitaliy", 27, MALE, "Belarus", "Minsk");
        persons[14] = new Person("Vlad", 24, MALE, "Belarus", "Minsk");
        MilitaryOffice militaryOffice = new MilitaryOffice(new PersonRegistry(persons));
        System.out.println(Arrays.toString(militaryOffice.getRecruitsByName("Alexander")));
        System.out.println(militaryOffice.getRecruitsExactAge(18, 20) + "\n");
        System.out.println(Arrays.toString(militaryOffice.getRecruitsInExactCity()) + "\n");
        System.out.println(militaryOffice.getRecruits() + "\n");
    }
}
