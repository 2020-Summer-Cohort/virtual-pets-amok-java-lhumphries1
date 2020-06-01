package pets_amok;

public abstract class VirtualPet {
    private int thirst = 20;
    private int hunger = 20;
    private int boredom = 20;
    private int cleanliness = 3;
    private String name;
    public VirtualPet(String name) {
        this.name = name;
    }

    protected String hungerInfo;
    private String thirstInfo;
    private String boredomInfo;
    protected boolean cageNeedsCleaned;

    public VirtualPet(String hunger, String thirstInfo, String boredomInfo) {
        this.hungerInfo = hunger;
        this.thirstInfo = thirstInfo;
        this.boredomInfo = boredomInfo;
        cageNeedsCleaned = true;
    }

    void hunger() { hunger -= 2; }

    void thirst() { thirst -= 2; }

    void boredom(){ boredom -=2; }

    public String getHungerInfo() { return hungerInfo; }

    public String getThirstInfo() { return thirstInfo; }

    public String getBoredomInfo() { return boredomInfo; }

    public boolean cageNeedsCleaned() { return cageNeedsCleaned; }

    public abstract void eat();

    public abstract void cageCleanliness();

    public void cleanliness(){ cleanliness -=1; }

    public void animalCalls() {
        System.out.println("I make pet sounds to indicate my need level.");
    }
    public void tick() {
        hunger = hunger + 2;
        thirst = thirst + 2;
        boredom = boredom + 4;
        cleanliness = cleanliness + 2;
    }
}

