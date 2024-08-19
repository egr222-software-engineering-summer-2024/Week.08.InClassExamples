public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck [] ducksInSimulator = new Duck[] {
                new MallardDuck(),
                new RedheadDuck(),
                new RubberDuck(),
                new ModelDuck()
        };

        for (Duck duck : ducksInSimulator) {
            duck.display();
            duck.quack();
            duck.swim();
            duck.fly();
            System.out.println();
        }

        ducksInSimulator[0].setFlyBehavior(new FlyWithRocketPower());

        for (Duck duck : ducksInSimulator) {
            duck.display();
            duck.quack();
            duck.swim();
            duck.fly();
            System.out.println();
        }
    }
}