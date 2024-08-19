public class AnimalSimulator {
    public static void main(String[] args) {
        // Programming to an implementation (using the Dog class directly)
        Dog dog = new Dog();
        dog.Bark();

        // Programming to an interface (or abstract class)
        Animal animal = new Dog();
        animal.makeSound();

        // Programming that works no matter what Animal is being implemented (completely abstract)
        Animal x = GetAnimal();
        x.makeSound();
    }

    public static Animal GetAnimal() {
        return new Cat();
    }
}