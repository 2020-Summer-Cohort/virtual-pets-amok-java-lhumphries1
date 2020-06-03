package pets_amok;

import java.util.Collection;
import java.util.HashMap;

public class VirtualPetShelter {



    public Collection<VirtualPet> retrieveVirtualPet() {
        return petShelter.values();
    }


    HashMap<String, VirtualPet> petShelter = new HashMap<>();

    public VirtualPetShelter() {
        OrganicCat organicCat = new OrganicCat("Orion", "Furry", 10, 20, 20, 20, 20, 20);
        OrganicDog organicDog = new OrganicDog("Spot", "Shaggy", 10, 20, 20, 20, 20, 20);
        RoboticCat roboticCat = new RoboticCat("Elliot", "Squeeky and Metallic", 20, 20, 20);
        RoboticDog roboticDog = new RoboticDog("Bear", "Abstract Grey and blocky", 20, 20, 20);

        petShelter.put(organicCat.getName(), organicCat);
        petShelter.put(organicDog.getName(), organicDog);
        petShelter.put(roboticCat.getName(), roboticCat);
        petShelter.put(roboticDog.getName(), roboticDog);
    }


    public void feedPets() {
        for (VirtualPet pet : petShelter.values()) {
            pet.feed();
        }
    }

    public void waterPets() {
        for (VirtualPet pet : petShelter.values()) {
            pet.waterPets();
        }
    }

    public void playWithPets() {
        for (VirtualPet pet : petShelter.values()) {
            pet.fixBoredom();
        }
    }

    public void adoptPet(String petName) {
        petShelter.remove(petName);
    }

    public void tickAllPets() {
        for (VirtualPet pet : petShelter.values()) {
            pet.tickAll();
        }
    }
}
