package dennisMohle.myZoo.com;

import java.util.HashMap;
import java.util.Map;
public class Animal {


    private String animalName;
    private String species;
    private int age;


    // Create a static attribute that belongs to the Animal class.
    public static int numOfAnimals = 0;
    private static final Map<String, Integer> speciesCount = new HashMap<>();


    // Animal Class constructors
    public Animal(String name, String aSpecies, int anAge) {
        System.out.println("\n A new Animal object was created.\n");


        // Create initial values for the class attributes.
        animalName = name;
        species = aSpecies;
        age = anAge;
        numOfAnimals++;


        speciesCount.put(species, speciesCount.getOrDefault(species, 0) + 1);


    }


    public Animal() {
        System.out.println("\n A new Animal object was created.\n");
        numOfAnimals++;
    }


    // Getters and Setters for each attribute (optional, but recommended for good practice)
    public String getName() {
        return animalName;
    }


    public void setName(String name) {
        this.animalName = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getSpecies() {
        return species;
    }


    public void setSpecies(String species) {
        this.species = species;
    }


    public static int getSpeciesCount(String species) {
        return speciesCount.getOrDefault(species, 0);
    }
}


class Hyena extends Animal{


    public static void color() {
        System.out.println("The color of Hyenas are ginger with patterns and dark spots");
    }


}


class Lion extends Animal{


    public static void color() {
        System.out.println("The color of Lions are buff yellow and orange-brown");
    }


}

class Bear extends Animal{


    public static void color() {
        System.out.println("The color of Bears are black, brown and many more.");
    }


}
class Tiger extends Animal{


    public static void color() {
        System.out.println("The color of Tigers are orange with dark stripes");
    }


}



