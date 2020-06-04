package pets_amok;

import java.util.Scanner;

public class Application {
    VirtualPetShelter virtualPetShelter = new VirtualPetShelter();


    //    public static void main(String[] args){
//        for (VirtualPet animalCall : VirtualPetShelter.retrieveVirtualPet(){
//            System.out.println(animalCall.animalCall);
//        }
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Pet Shelter");
        gameLoop(input);
    }

    public static void whatToDo() {
        System.out.println("Choose your interaction with you pet!");
        System.out.println("1. Play with pet. ");
        System.out.println("2. Play with all pets.");
        System.out.println("3. Give pets a drink.");
        System.out.println("4. Feed pets");
        System.out.println("5. Adopt a pet");
        System.out.println("6. Add pet to shelter.");
        System.out.println("7. Do nothing.");
    }

    public static void gameLoop(Scanner input) {
        VirtualPetShelter virtualPetShelter = new VirtualPetShelter();


        while (true) {
            printPetStatus(virtualPetShelter);
            whatToDo();
            virtualPetShelter.tickAllPets();

            int userChoice = input.nextInt();

            if (userChoice == 1) {
                System.out.println("Play with pet friend.");
                printPetStatus(virtualPetShelter);
                String choice = input.nextLine();
                if (virtualPetShelter.petShelter.containsKey(choice)) {
                    VirtualPet playWithPet = virtualPetShelter.petShelter.get(choice);
                    System.out.println("You picked " + playWithPet.getName());
                    playWithPet.fixBoredom();
                } else {
                    System.out.println("Iam sorry there no pet with that name");
                    continue;
                }
            }
            if (userChoice == 2) {
                virtualPetShelter.playWithPets();
            }

            if (userChoice == 3) {
                virtualPetShelter.waterPets();

            }
            if (userChoice == 4) {
                virtualPetShelter.feedPets();
            }
            if (userChoice == 5) {
                System.out.println("Would you like to adopt a pet.");
                printPetStatus(virtualPetShelter);
                String choice = input.nextLine();
                if (virtualPetShelter.petShelter.containsKey(choice)) {
                    VirtualPet adoptPet = virtualPetShelter.petShelter.get(choice);
                    System.out.println("You picked " + adoptPet.getName());
                    virtualPetShelter.petShelter.remove(adoptPet.getName());
                } else {
                    System.out.println("Iam sorry there no pet with that name");
                    break;
                }
            }
            if (userChoice == 6) {
                System.out.println("Admit a pet to the shelter.");
                System.out.println("What is your pets name?");
                String newPetName = input.nextLine();

                System.out.println("Describe of you pet.");
                String description = input.nextLine();
                System.out.println("What type is your pet.");
                System.out.println("1. Robotic Dog");
                System.out.println("2. Robotic Cat");
                System.out.println("3. Dog");
                System.out.println("4. Cat");
                switch (input.nextInt()) {
                    case 1:
                        virtualPetShelter.petShelter.put(newPetName, new RoboticDog(newPetName, description));
                    case 2:
                        virtualPetShelter.petShelter.put(newPetName, new RoboticCat(newPetName, description));
                    case 3:
                        virtualPetShelter.petShelter.put(newPetName, new OrganicDog(newPetName, description));
                    case 4:
                        virtualPetShelter.petShelter.put(newPetName, new OrganicCat(newPetName, description));
                }
                OrganicCat newPet = new OrganicCat(newPetName, description);
                OrganicDog newPet1 = new OrganicDog(newPetName, description);
                RoboticCat newPet2 = new RoboticCat(newPetName, description);
                RoboticDog newPet3 = new RoboticDog(newPetName, description);
                virtualPetShelter.petShelter.put(newPet.getName(), newPet);
                printPetStatus(virtualPetShelter);
            }
            if (userChoice == 7) {
                System.out.println("Exit");
                break;

            }

        }
    }


    public static void printPetStatus(VirtualPetShelter virtualPetShelter) {
        for (VirtualPet pet : virtualPetShelter.petShelter.values()) {
            System.out.println("Name " + pet.getName());
            System.out.println("Hunger " + pet.getHungerNeed());
            System.out.println("Play " + pet.getBoredomNeed());
            System.out.println("Drink " + pet.getThirstNeed());

        }
    }
}