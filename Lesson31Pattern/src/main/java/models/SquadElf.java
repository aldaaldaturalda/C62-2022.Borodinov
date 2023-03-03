package models;

public class SquadElf implements CreateFactoryDoWarriorsImpl {
    @Override
    public Archer createArcher() {
        return new Archer();
    }

    @Override
    public Wizard createWizard() {
        return new Wizard();
    }

    @Override
    public Warrior createWarrior() {
        return new Warrior();
    }
}
