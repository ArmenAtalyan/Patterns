package abstractFactory2;

public class DwarfSquadronFactory extends SquadronFactory {
    @Override
    public Mage createMag() {
        return new DwarfMage();
    }

    @Override
    public Archer createArcher() {
        return new DwarfArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new DwarfWarrior();
    }
}
