package pets_amok;

public abstract class Organic extends VirtualPet {

    public Organic() {
        super("Food is needed", "Dehydration", "Can we play");
    }

    public void animalCalls() {
        System.out.println("I use my vocal cords to let you know what i need");
    }

    @Override
    public void thirst() {
        super.thirst();
        System.out.println("Fresh running water is all I need.");
    }
    @Override
    public void eat(){
        super.hungerInfo = "Organic meals";
        System.out.println("Ill take food from your hand with my mouth");
    }

    @Override
    public void cageCleanliness(){
        cageNeedsCleaned = false;
        System.out.println("Was not cared for enough and i had to go. :-( ");
    }

}
