package animalkingdom;

abstract class Animal {
    //Fields
    protected int id;
    protected static int currId = 0;
    protected String name;
    protected int year;

    //constructor
    public Animal(String name, int year) {
        currId++;
        this.id = currId;
        this.name = name;
        this.year = year;
    }

    //methods
    public String eat(String food) {
        return this.name + " ate " + food;
    }

    int getid() {
        return id;
    }

    String getName() {
        return name;
    }

    int getYear() {
        return year;
    }

    abstract String move();
    abstract String breathe();
    abstract String reproduce();

}