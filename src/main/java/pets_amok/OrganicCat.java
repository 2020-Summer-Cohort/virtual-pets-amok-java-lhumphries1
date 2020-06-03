package pets_amok;

public class OrganicCat extends Cat implements Organic {
    protected int thirst;
    protected int hunger;
    protected int boredom;
    protected int cleanliness;


    public OrganicCat(String name, String description) {
        super(name, description);
    }

    public OrganicCat(String name, String description, int happiness, int health, int thirst, int hunger, int boredom, int cleanliness) {
        super(name, description, happiness, health);
        this.thirst = thirst;
        this.hunger = hunger;
        this.boredom = boredom;
        this.cleanliness = cleanliness;
    }



    @Override
    public void cageNeedsCleaned() {
        cageNeedsCleaned = false;
        System.out.println("Box needs cleaned. :-( ");
    }

    @Override
    public void tickAll() {

    }

    @Override
    public String getBoredomNeed() {
        return null;
    }

    @Override
    int getThirstNeed() {
        return 0;
    }

    @Override
    public int getHungerNeed() {
        return 0;
    }

    @Override
    public void feed() {
        hunger -= 2;

    }

    @Override
    public void waterPets() {
        thirst -= 2;
    }

    @Override
    public void fixBoredom() {
        boredom -= 1;

    }


    public void tick() {
        hunger = hunger + 2;
        thirst = thirst + 2;
        boredom = boredom + 4;
        cleanliness = cleanliness + 2;

    }
}