package animalkingdom;

abstract class Animal {
    //Fields
    protected int id;
    protected String name;
    protected int year;

    //constructor
    public Animal(String name, int year) {
        this.id = Math.random() * 1000;
        this.name = name;
        this.year = year;
    }

    //methods
    public String eat(String food) {
        return this.name + " ate " + this.food;
    }

    abstract String move(String movement);
    abstract String breathe(String breath_type);
    abstract String reproduce(String rep_type);
}