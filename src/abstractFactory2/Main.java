package abstractFactory2;

public class Main {
    public static void main(String[] args) {
        SquadronFactory factory = new ElfSquadronFactory();
        factory.createArcher().shoot();
        factory.createMag().cast();
        factory.createWarrior().attack();
        factory = new DwarfSquadronFactory();
        factory.createWarrior().attack();;
        factory.createMag().cast();
        factory.createArcher().shoot();
    }
}
