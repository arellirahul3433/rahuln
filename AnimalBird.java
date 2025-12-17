class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Bird extends Animal {
    private double wingSpan;

    Bird(String name, double wingSpan) {
        super(name);
        this.wingSpan = wingSpan;
    }

    void fly() {
        System.out.println(name + " is flying with wingspan " + wingSpan + " meters.");
    }

    @Override
    void eat() {
        System.out.println(name + " pecks at food.");
    }
}

public class AnimalBird {
    public static void main(String[] args) {
        Animal a = new Animal("Generic Animal");
        a.eat();
        a.sleep();

        Bird b = new Bird("Sparrow", 0.25);
        b.eat();
        b.fly();
        b.sleep();

        // Polymorphism: reference type is Animal, actual object is Bird
        Animal poly = new Bird("Eagle", 2.0);
        poly.eat();
        // poly.fly(); // compile error — need cast
        if (poly instanceof Bird) {
            ((Bird) poly).fly();
        }
    }
}
