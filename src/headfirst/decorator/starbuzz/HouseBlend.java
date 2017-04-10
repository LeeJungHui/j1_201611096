package headfirst.decorator.starbuzz;

public class HouseBlend extends Beverage
{
  public HouseBlend()
  {
    description = "house blend coffee\n";  
  }
  public double cost()
  {
    return 0.89;
  }
}