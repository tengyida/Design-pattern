package SimpleFactory;

public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Fruit apple = FruitFacory.getFruit("SimpleFactory.Apple");//包名+类名
		Fruit banana = FruitFacory.getFruit("SimpleFactory.Banana");
		apple.get();
		banana.get();
	}
}