public class MiniDuckSimulator {
 
	public static void main(String[] args) {
		Duck[] ducksInSimulator = new Duck[]{
				new MallardDuck(),
				new RedHeadDuck(),
				new RubberDuck(),
				new DecoyDuck(),
				new ModelDuck()
		};

		for (Duck duck : ducksInSimulator) {
			duck.display();
			duck.performQuack();
			duck.swim();
			duck.performFly();
			System.out.println();
		}

		ducksInSimulator[4].setFlyBehavior(new FlyRocketPowered());
		ducksInSimulator[4].performFly();
	}
}