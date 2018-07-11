
public class MainClass {
	public static void main(String[] args) {
//		Fruit apple = new Apple();
//		Fruit banana = new Banana();
//		apple.get();
//		banana.get();
		FruitFacory fruitFacory = new FruitFacory();
		Fruit apple = fruitFacory.getApple();
		Fruit banana = fruitFacory.getBanana();
		apple.get();
		banana.get();
	}
}