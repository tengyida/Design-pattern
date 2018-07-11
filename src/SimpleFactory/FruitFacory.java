package SimpleFactory;

public class FruitFacory {
	public static Fruit getFruit(String type) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class fruit = Class.forName(type);
		return (Fruit) fruit.newInstance();
	}
}
