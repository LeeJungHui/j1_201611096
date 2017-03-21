package headfirst.strategy;

public abstract class Duck{
  public FlyBehavior fb;
  public Duck(){}
  public void setFlyBehavior(FlyBehavior f)
  {
    this.fb=f;
  }
  public void performFly()
  {
    fb.fly();
    System.out.println("All duck fly...");
  }
  abstract void display();
  public void swim()
  {
    System.out.println("All ducks float, even decoys!");
  }
}