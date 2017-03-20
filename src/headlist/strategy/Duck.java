package headlist.strategy;

public abstract class Duck{
  Flybehavior flyBehavior;
  QuackBehavior quackBehavior;
  public Duck(){}
  public void setFlayBehavior(FlyBehavior fb)
  {
    flyBehavior=fb;
  }
  public void setQuackBehavior(QuackBehavior qb)
  {
    quackBehavior=qb;
  }
  
  abstract void display();
  
  public void performFly()
  {
    flyBehavior.fly();
  }
  public void performQuack()
  {
    quackBehavior.quack();
  }
  public void swim()
  {
    System.out.println("All ducks float, even decoys!");
  }
}