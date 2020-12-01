package animalkingdom;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //Filter method for animals
    private static List<Animal> filterAnimal(List<Animal> animals, CheckAnimals test) {
        List<Animal> tempAnimalList = new ArrayList<>();

        for (Animal a : animals) {
            if (test.test(a)) {
                tempAnimalList.add(a);
            }
        }
        return tempAnimalList;
    }

    //Print List method
    private static void printArrayList(List<Animal> list) {
        for (Animal a : list) {
            System.out.println(a);
        }
    }



    //MAIN
    public static void main(String[] args) {
        //create animal list
        List<Animal> animalList = new ArrayList<>();
        
        //instantiate mammals and add to list
        animalList.add(new Mammal("Panda", 1869));
        animalList.add(new Mammal("Zebra", 1778));
        animalList.add(new Mammal("Koala", 1816));
        animalList.add(new Mammal("Sloth", 1804));
        animalList.add(new Mammal("Armadillo", 1758));
        animalList.add(new Mammal("Raccoon", 1758));
        animalList.add(new Mammal("Bigfoot", 2021));

        //instantiate birds and add to list
        animalList.add(new Bird("Pigeon", 1837));
        animalList.add(new Bird("Peacock", 1821));
        animalList.add(new Bird("Toucan", 1758));
        animalList.add(new Bird("Parrot", 1824));
        animalList.add(new Bird("Swan", 1758));
        
        //instantiate fish and add to list
        animalList.add(new Fish("Salmon", 1758));
        animalList.add(new Fish("Catfish", 1817));
        animalList.add(new Fish("Perch", 1758));

        // Sort descending by year
        System.out.println("*** List all the animals in descending order by year named ***");
        animalList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        printArrayList(animalList);

        //sort by name alphabetically     
        System.out.println("\n*** List all the animals in ascending by name ***");
        animalList.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
        printArrayList(animalList);

        //List all the animals order by how they move 
        System.out.println("\n*** List all the animals order by how they move ***");
        animalList.sort((a1, a2) -> a1.move().compareTo(a2.move()));
        printArrayList(animalList);

        //sort by animals who breathe by lungs     
        System.out.println("\n*** List only those animals the breath with lungs ***");
        List<Animal> filteredAnimalsList = filterAnimal(animalList, a -> a.breathe() == "lungs");
        printArrayList(filteredAnimalsList);

        //List only those animals that breath with lungs and were named in 1758 ***
        System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
        filteredAnimalsList = filterAnimal(animalList, a -> (a.breathe() == "lungs") && (a.getYear() == 1758));
        printArrayList(filteredAnimalsList);

        //*** List only those animals that lay eggs and breath with lungs ***
        System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
        filteredAnimalsList = filterAnimal(animalList, a -> (a.reproduce() == "eggs") && (a.breathe() == "lungs"));
        printArrayList(filteredAnimalsList);

        //List alphabetically only those animals that were named in 1758 ***
        System.out.println("\n*** List only those animals that were named in 1758 ***");
        filteredAnimalsList = filterAnimal(animalList, a -> a.getYear() == 1758);
        filteredAnimalsList.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
        printArrayList(filteredAnimalsList);

        //Stretch *** For the list of animals, list alphabetically those animals that are mammals ***
        System.out.println("\n ***List alphabetically those animals that are mammals ***");
        filteredAnimalsList = filterAnimal(animalList, a ->(a.reproduce() == "live birth") && (a.breathe() == "lungs"));
        filteredAnimalsList.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));
        printArrayList(filteredAnimalsList);
    }
}