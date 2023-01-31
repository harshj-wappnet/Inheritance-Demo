// simple demo of multi-level inheritance
public class Main {
    public static void main(String[] args) {
        Baby_Dog babyDog = new Baby_Dog();

        // babydog class can access both animal and dog class property
        babyDog.eat();
        babyDog.bark();
        babyDog.weep();
    }
}

//parent class
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

//child class of Animal
class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}

//child class of Dog
class Baby_Dog extends Dog {
    void weep() {
        System.out.println("weeping");
    }
}
