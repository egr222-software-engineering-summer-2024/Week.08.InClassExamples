public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck[] ducksInSimulator = new Duck[]{
                new MallardDuck(),
                new RedheadDuck(),
                new RubberDuck()
        };

        for (Duck duck : ducksInSimulator) {
            duck.display();
            duck.quack();
            duck.swim();
            duck.fly();
            System.out.println();
        }
    }
}