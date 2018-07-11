package SimpleFactory;

public class FruitFacory {
	public static Fruit getFruit(String type)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//		if (type.equalsIgnoreCase("apple")) {
//			return Apple.class.newInstance();
//		} else if (type.equalsIgnoreCase("banana")) {
//			return Banana.class.newInstance();
//		} else {
//			System.out.println("输入的类型有误");
//		}

		Class fruit = Class.forName(type);
		return (Fruit) fruit.newInstance();
	}
}
