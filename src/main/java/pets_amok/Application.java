package pets_amok;

public class Application {
    VirtualPetShelter virtualPetShelter = new VirtualPetShelter();


    public static void main(String[] args){
        for (VirtualPet animalCall : VirtualPetShelter.retrieveVirtualPet(){
            System.out.println(animalCall.animalCall);
        }


//    public static void printPetStatus(VirtualPetShelter virtualPetShelter) {
//        for (VirtualPet pet : virtualPetShelter.petShelter.values()) {
//            System.out.println("Name " + pet.getName());
//            System.out.println("Hunger " + pet.getHungerNeed());
//            System.out.println("Play " + pet.getBoredomNeed());
//            System.out.println("Drink " + pet.getThirstNeed());
//
//       }
    }
}