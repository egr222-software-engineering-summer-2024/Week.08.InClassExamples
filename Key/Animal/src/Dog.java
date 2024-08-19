public class Dog extends Animal {
    public Dog() {
    }

    @Override
    public void makeSound() {
        Bark();
    }

    public void Bark() {
        System.out.println("Bark!");
    }
}