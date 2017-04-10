package headfirst.decorator.starbuzz;

public class MilkBubble extends CondimentDecorator
{
    Beverage beverage;
    public MilkBubble(Beverage b)
    {
      this.beverage = b;
    }
    public String getDescription()
    {
      return beverage.getDescription()+"Adding MilkBubble\n";
    }
    public double cost()
    {
      return beverage.cost()+0.5;
    }
}