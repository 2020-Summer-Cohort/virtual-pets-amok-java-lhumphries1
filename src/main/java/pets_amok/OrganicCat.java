package pets_amok;

public class OrganicCat extends Organic {

//    @Override
//public cat(){ super("I am picky and will only eat tuna from the can.", "I drink water but love milk too!", "I love attention");}


    @Override
    public void thirst() {
        System.out.println("I like love milk");
        System.out.println("I also drink water to stay hydrated");
    }
    @Override
    public void cageCleanliness(){
        cageNeedsCleaned = false;
        System.out.println("Box needs cleaned. :-( ");
    }
}