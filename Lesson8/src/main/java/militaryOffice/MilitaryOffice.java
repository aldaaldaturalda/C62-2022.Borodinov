package militaryOffice;

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public int getRecruits() {
        int count = 0;
        for (Person person : personRegistry.getPersons()) {
            if (checkRecruits(person)) {
                count++;
            }
        }
        return count;
    }

    public Person[] getRecruitsInExactCity() {
        Person[] persons = personRegistry.getPersons();
        Person[] personRecruits = new Person[persons.length];
        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            if (checRecruits(person) && person.getName().equalsIgnoreCase(name)) {
                personRecruits[i] = person;
            }
        }
        return personRecruits;
    }
}


