// simple demo of multiple inheritance
// In java multiple inheritance is not supported, so we use interfaces to implement.
public class Main2 {
    public static void main(String[] args) {

        Human human = new Human();//constructing object

        human.run();
        human.speak();
        human.show();

    }

}

//base interface 1
interface Moveable {
    public void run();
}

//base interface 2
interface Speakable {
    public void speak();
}

//child interface inheriting two interfaces
interface Ability extends Moveable, Speakable {
    public void show();
}

//child class who implement all above interface methods
class Human implements Ability {

    @Override
    public void run() {
        System.out.println("I can run..");
    }

    @Override
    public void speak() {
        System.out.println("I can Speak..");
    }

    @Override
    public void show() {
        System.out.println("I am a Human i can run and speak..");
    }

}
