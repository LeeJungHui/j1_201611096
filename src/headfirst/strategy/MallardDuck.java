package headfirst.strategy;

public class MallardDuck extends Duck
{
  public MallardDuck()
  {
    fb = new FlyWithWings();
  }
  public void display()
  {
    System.out.println("Mallard..");
  }
}