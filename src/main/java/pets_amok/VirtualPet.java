package pets_amok;

public abstract class VirtualPet {
    public VirtualPet(String newPetName) {
    }

    public String getName() {
        return name;
    }

    protected String name;
    protected String description;
    protected int happiness;
    protected int health;
    boolean cageNeedsCleaned;

    public VirtualPet(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public VirtualPet(String name, String description, int happiness, int health) {
        this.name = name;
        this.description = description;
        this.happiness = happiness;
        this.health = health;
    }

    public void feed() {
    }

    public void waterPets() {
    }

    public void fixBoredom() {
    }

    public void cageNeedsCleaned() {
    }

    public abstract void tickAll();



    public abstract String getBoredomNeed();

    abstract int getThirstNeed();

    public abstract int getHungerNeed();
}
