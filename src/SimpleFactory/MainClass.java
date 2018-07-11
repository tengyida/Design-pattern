package SimpleFactory;
/**
 *一.简单工厂模式又叫静态工厂方法模式，通过专门定义的类创建其他类的实例，被创建的实例通常具有相同的父类
 *二.工厂角色,抽象角色(工厂创建实例的父类)，具体产品角色(工厂创建的实例)
 *三.
 */
public class MainClass {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Fruit apple = FruitFacory.getFruit("SimpleFactory.Apple");//包名+类名
		Fruit banana = FruitFacory.getFruit("SimpleFactory.Banana");
		apple.get();
		banana.get();
	}
}