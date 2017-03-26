package headfirst.strategy;

public abstract class Duck{
  public FlyBehavior fb;
  public QuackBehavior qb;
  public Duck(){}
  public void setFlyBehavior(FlyBehavior f)
  {
    this.fb=f;
  }
  public void setQuackBehavior(QuackBehavior q)
  {
  	this.qb=q;
  }
  public void performFly()
  {
    fb.fly();
    System.out.println("All duck fly...");
  }
  public void performQuack(){
  	qb.quack();
  }
  abstract void display();
  public void swim()
  {
    System.out.println("All ducks float, even decoys!");
  }
}