import java.beans.Transient;

/**
 * Created by Mihnea on 04.05.2017.
 */
abstract public class Animal {
    String name = "???";
    public void printName() {
        System.out.println(name);
    }
    public abstract void feed();
}
class Cow extends Animal {
    @Override
    public void feed() {
        addHay();
    }
    private void addHay() {
        System.out.println("Feeding the Cow with hay.");
    }
}
class Bird extends Animal {
    @Override
    public void feed() {
        addSeed();
    }
    private void addSeed() {
        System.out.println("Feeding the Birds with seeds.");
    }
}
class Lion extends Animal {
    String name = "Leo";
    @Override
    public void feed() {
        addMeat();
    }
    private void addMeat() {
        System.out.println("Feeding the Lion with meat.");
    }
}
class AnimalTest {
    public void feedAnimal(Animal animal) {
        animal.feed();
    }

    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal bird = new Bird();
        Animal lion = new Lion();
        AnimalTest test = new AnimalTest();
        test.feedAnimal(cow);
        test.feedAnimal(bird);
        test.feedAnimal(lion);
        System.out.println(lion.name); // will NOT print Leo
        lion.printName(); // will NOT print Leo
        Lion anotherLion = new Lion();
        System.out.println(anotherLion.name); // WILL print Leo
    }
}
