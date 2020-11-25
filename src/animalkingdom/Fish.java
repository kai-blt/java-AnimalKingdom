package animalkingdom;

public class Fish extends Animal {
    //constructor
    public Fish(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return "swim";
    }
    
    @Override
    public String breathe() {
        return "gills";
    }
    
    @Override
    public String reproduce() {
        return "eggs";
    }

    @Override
    public String toString() {
        return "id: " + this.id + ", name: " + this.name + ", yearNamed = " + this.year;
    }
}
