package headfirst.strategy;

public class ModelDuck extends Duck{
	public ModelDuck()
	{
		fb = new FlyNoWay();
		qb = new Quack();
	}
	public void display(){
		System.out.println("Model...");
	}
}