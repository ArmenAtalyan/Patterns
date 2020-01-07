package abstractFactory2;

public class ElfSquadronFactory extends SquadronFactory{
    @Override
    public Mage createMag() {
        return new ElfMage();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }
}
