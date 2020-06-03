package pets_amok;

public abstract class Dog extends VirtualPet {

    public Dog(String name, String description) {
        super(name, description);
    }

    public Dog(String name, String description, int happiness, int health) {
        super(name, description, happiness, health);
    }

    public abstract void walkDogs();

 }