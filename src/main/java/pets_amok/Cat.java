package pets_amok;

public class Cat extends VirtualPet {

    public Cat(String name, String description) {
        super(name, description);
    }

    public Cat(String name, String description, int happiness, int health) {
        super(name, description, happiness, health);
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
}
