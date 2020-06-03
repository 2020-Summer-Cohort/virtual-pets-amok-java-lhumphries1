package pets_amok;

public class RoboticCat extends Cat implements Robotic {
    protected int batteryLevel;
    protected int oilLevel;
    protected int gearMaintance;

    public RoboticCat(String name, String description) {
        super(name, description);
    }

    public RoboticCat(String name, String description, int batteryLevel, int oilLevel, int gearMaintance) {
        super(name, description);
        this.batteryLevel = batteryLevel;
        this.oilLevel = oilLevel;
        this.gearMaintance = gearMaintance;
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
        gearMaintance -= 3;
    }
}
