package animalkingdom;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Main {
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
        animalList.add(new Mammal("Zorro", 1869));

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

        //Sort descending by year
        // Collections.sort(animalList, Comparator.reverseOrder());
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));

        for (Animal a : animalList) {
            System.out.println(a);
        }
    }
}