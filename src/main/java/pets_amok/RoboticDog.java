package pets_amok;

public class RoboticDog extends Dog implements Robotic {


    protected int batteryLevel;
    protected int oilLevel;
    protected int gearMaintance;


    public RoboticDog(String name, String description) {
        super(name, description);
    }

    @Override
    public void walkDogs() {

    }

    public RoboticDog(String name, String description, int batteryLevel, int oilLevel, int gearMaintance) {
        super(name, description);
    }


    @Override
    public void batteryLevel() {
        batteryLevel -= 5;

    }

    @Override
    public void oilLevel() {
        oilLevel -= 5;

    }

    @Override
    public void gearMaintance() {
        gearMaintance -= 2;
    }
}
