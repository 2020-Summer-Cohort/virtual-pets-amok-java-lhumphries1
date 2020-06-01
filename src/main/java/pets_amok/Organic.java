package pets_amok;

public abstract class Organic extends VirtualPet {

    public Organic() {
        super("Organic food is needed", "Needs water to drink", "I need to be amused with playful entertainment");
    }

    public void animalCalls() {
        System.out.println("I use my vocal cords to let you know mt different needs");
    }

    @Override
    public void thirst() {
        super.thirst();
        System.out.println("Fresh running water is all I need.");
    }

    @Override
    public void getAttention(){
        System.out.println("Please pet me while sit on you lap.");
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
