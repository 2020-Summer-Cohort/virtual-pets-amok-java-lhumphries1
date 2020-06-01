package pets_amok;

public class Robotic extends VirtualPet {
    public Robotic() {
        super("Looking for power source", "Looking for oil", "Quantizing input and output!");
    }

    public void animalCalls() {
        System.out.println("I quantize one and zeros to mimic a real bark!!" + "" + "(Loading...(BUZZ BUZZ)" + "bark");
    }

    @Override
    public void thirst() {
        super.thirst();
        System.out.println("I pass voltage through my receiving conductors on my coil pack to quench my energy decline.");
    }
    @Override
    public void getAttention(){
        System.out.println("Can you check my gears for play time.");
    }

    @Override
    public void eat() {
        System.out.println("I can only have full synthetic oil, nothing less!");
    }

    @Override
    public void cageCleanliness() {
        cageNeedsCleaned = false;
        System.out.println("I may have an oil link if this happens.");
    }
}