package headfirst.decorator.starbuzz;

public class Shot extends CondimentDecorator
{
    Beverage beverage;
    public Shot(Beverage b)
    {
      this.beverage = b;
    }
    public String getDescription()
    {
      return beverage.getDescription()+"Adding Espresso Shot\n";
    }
    public double cost()
    {
      return beverage.cost()+1.99;
    }
}