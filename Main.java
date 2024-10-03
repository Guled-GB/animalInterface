
interface Animal {

    void eat();
    void drink();
    void sleep();
    void workout();
}

class Lion implements Animal {
    private String name;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating meat.");
    }

    @Override
    public void drink() {
        System.out.println(name + " is drinking water.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    @Override
    public void workout() {
        System.out.println(name + " is running in the savannah.");
    }
}

class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating dog food.");
    }

    @Override
    public void drink() {
        System.out.println(name + " is drinking water.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " is sleeping in the kennel.");
    }

    @Override
    public void workout() {
        System.out.println(name + " is fetching the ball.");
    }
}

class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating cat food.");
    }

    public void drink() {
        System.out.println(name + " is drinking milk.");
    }


    public void sleep() {
        System.out.println(name + " is sleeping on the couch.");
    }


    public void workout() {
        System.out.println(name + " is chasing a mouse.");
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Leo");
        Dog dog = new Dog("Max");
        Cat cat = new Cat("Whiskers");

        lion.eat();
        lion.drink();
        lion.sleep();
        lion.workout();

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.workout();

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.workout();
    }
}
