package animalkingdom;

public class Mammal extends Animal {
    //constructor
    public Mammal(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return "walk";
    }
    
    @Override
    public String breathe() {
        return "lungs";
    }
    
    @Override
    public String reproduce() {
        return "live birth";
    }

    @Override
    public String toString() {
        return "Mammal{id: " + this.id + ", name: " + this.name + ", yearNamed: " + this.year + "}";
    }
}
