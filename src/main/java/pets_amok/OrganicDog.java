package pets_amok;

public class OrganicDog extends Dog implements Organic {
    protected int thirst;
    protected int hunger;
    protected int boredom;
    protected int cleanliness;

    public OrganicDog(String name, String description) {
        super(name, description);
    }

    public OrganicDog(String name, String description, int happiness, int health, int thirst, int hunger, int boredom, int cleanliness) {
        super(name, description, happiness, health);
        this.thirst = thirst;
        this.hunger = hunger;
        this.boredom = boredom;
        this.cleanliness = cleanliness;
    }

    @Override
    public void walkDogs() {

    }

    @Override
    public void feed() {
        hunger -= 3;

    }

    @Override
    public void waterPets() {
        thirst -= 3;

    }

    @Override
    public void fixBoredom() {
        boredom -= 3;

    }

    @Override
    public void cageNeedsCleaned() {
        cleanliness -= 1;
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

    public void tick() {
        hunger = hunger + 2;
        thirst = thirst + 2;
        boredom = boredom + 4;
        cleanliness = cleanliness + 2;
    }

}
