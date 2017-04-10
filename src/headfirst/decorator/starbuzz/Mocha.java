package headfirst.decorator.starbuzz;

public class Mocha extends CondimentDecorator
{
  Beverage beverage;
  public Mocha(Beverage b)
  {
    this.beverage = b;
  }
  public String getDescription()
  {
   return beverage.getDescription()+"Adding Mocha\n";
  }
  public double cost()
  {
    return beverage.cost()+0.2;
  }
}