package headfirst.decorator.starbuzz;

public class CaSyrup extends CondimentDecorator
{
    Beverage beverage;
    public CaSyrup(Beverage b)
    {
      this.beverage = b;
    }
    public String getDescription()
    {
      return beverage.getDescription()+"Adding CaSyrup\n";
    }
    public double cost()
    {
      return beverage.cost()+0.3;
    }
}