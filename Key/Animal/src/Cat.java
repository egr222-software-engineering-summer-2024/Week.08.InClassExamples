public class Cat extends Animal {
    public Cat() {
    }

    @Override
    public void makeSound() {
        Meow();
    }

    public void Meow() {
        System.out.println("Meow");
    }
}