package dennisMohle.myZoo.com;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to My aYouZoo Program\n\n");
//        System.out.println("\n Number of animals is: " + Animal.numOfAnimals);


        // local variables
        String animalName;
        String species;
        int age;


        // ArrayList of Animal objects
        ArrayList<Animal> animals = new ArrayList<>();

        // ArrayList of Hyena names.
        ArrayList<String> hyenaNames = new ArrayList<>();
        // ArrayList of Lion names.
        ArrayList<String> lionNames = new ArrayList<>();
        // ArrayList of Tiger names.
        ArrayList<String> tigerNames = new ArrayList<>();
        // ArrayList of Bear names.
        ArrayList<String> bearNames = new ArrayList<>();

        // Open an external file, parse it line by line, and fill the name arrayLists
        String aFilePath = "C:\\Users\\Amanda Panda\\Desktop\\FCC\\CIT 63\\module-05-aheartyou88-main\\module-05-aheartyou88-main\\animalNames.txt";
        File aFile = new File(aFilePath);

        try (Scanner scanner = new Scanner(aFile)) {
            while (scanner.hasNextLine()) {
                String aLine = scanner.nextLine();

                System.out.println("\n List of " + aLine);


                if (aLine.contains("Hyena")) {
//                     Skip the next line because it is a blank line.
                    scanner.nextLine();

                    String[] myHyenaNamesArray = scanner.nextLine().split(", ");
                    hyenaNames.addAll(Arrays.asList(myHyenaNamesArray));
//                     Pop the first hyena name off the list
                    String firstHyenaName = hyenaNames.remove(0);
                    System.out.println("First hyena name: " + firstHyenaName);
                    // and do this again and observe what is happening
                    firstHyenaName = hyenaNames.remove(0);
                    System.out.println("Second hyena name: " + firstHyenaName);
                    // and one more time
                    firstHyenaName = hyenaNames.remove(0);
                    System.out.println("Third hyena name: " + firstHyenaName);
                }
                if (aLine.contains("Lion")) {
//                     Skip the next line because it is a blank line.
                    scanner.nextLine();

                    String[] myLionNamesArray = scanner.nextLine().split(", ");
                    lionNames.addAll(Arrays.asList(myLionNamesArray));
//                     Pop the first hyena name off the list
                    String firstLionName = lionNames.remove(0);
                    System.out.println("First lion name: " + firstLionName);
                    // and do this again and observe what is happening
                    firstLionName = lionNames.remove(0);
                    System.out.println("Second lion name: " + firstLionName);
                    // and one more time
                    firstLionName = lionNames.remove(0);
                    System.out.println("Third lion name: " + firstLionName);
                }

                if (aLine.contains("Bear")) {
//                     Skip the next line because it is a blank line.
                    scanner.nextLine();

                    String[] myBearNamesArray = scanner.nextLine().split(", ");
                    bearNames.addAll(Arrays.asList(myBearNamesArray));
//                     Pop the first hyena name off the list
                    String firstBearName = bearNames.remove(0);
                    System.out.println("First bear name: " + firstBearName);
                    // and do this again and observe what is happening
                    firstBearName = bearNames.remove(0);
                    System.out.println("Second bear name: " + firstBearName);
                    // and one more time
                    firstBearName = bearNames.remove(0);
                    System.out.println("Third bear name: " + firstBearName);
                }

                if (aLine.contains("Tiger")) {
//                     Skip the next line because it is a blank line.
                    scanner.nextLine();

                    String[] myTigerNamesArray = scanner.nextLine().split(", ");
                    bearNames.addAll(Arrays.asList(myTigerNamesArray));
//                     Pop the first hyena name off the list
                    String firstTigerName = bearNames.remove(0);
                    System.out.println("First bear name: " + firstTigerName);
                    // and do this again and observe what is happening
                    firstTigerName = bearNames.remove(0);
                    System.out.println("Second bear name: " + firstTigerName);
                    // and one more time
                    firstTigerName = bearNames.remove(0);
                    System.out.println("Third bear name: " + firstTigerName);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + aFilePath);
            e.printStackTrace();
        }

            //Space between the paragraphs
        System.out.println("\n\n");

                // Open an external file, parse it line by line, and get age and species
        String filePath = "C:\\Users\\Amanda Panda\\Desktop\\FCC\\CIT 63\\module-05-aheartyou88-main\\module-05-aheartyou88-main\\arrivingAnimals.txt";
        File file = new File(filePath);




        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();


                // Age is in the first element of the array named parts
                String[] parts = line.split(", ");


                // Check if the line has at least 1 part
                if (parts.length >= 1) {
                    String ageAndSpecies = parts[0];
                    System.out.println("Age and Species: " + ageAndSpecies );


                    // Get age out of 'ageAndSpecies'
                    String[] theParts = ageAndSpecies.split(" ");
                    for (int i=0; i<5; i++) {
                        System.out.println("theParts[" + i + "] is " + theParts[i]);
                    }
                    age = Integer.parseInt(theParts[0]);
                    species = theParts[4];


                    // Create a new animal object.
                    Animal myAnimal = new Animal("name needed", species, age);


                    // Add the new Animal object to the ArrayList of Animals
                    animals.add(myAnimal);
                }
                System.out.println("\n Number of animals is: " + Animal.numOfAnimals);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filePath);
            e.printStackTrace();
        }

//Space between the paragraphs
        System.out.println("\n\n");

        Hyena.color();
        Bear.color();
        Tiger.color();
        Lion.color();


    }


    // We now have an arrayList of Animals. Let's output them!
//        for (Animal animal : animals){
//            System.out.println(animal);
//            System.out.println("Animal name: " + animal.getName() + ", Age: " + animal.getAge() + ", Species: " + animal.getSpecies());
//        }
//        System.out.println("\n Number of animals is: " + Animal.numOfAnimals);
//
//    }

}
