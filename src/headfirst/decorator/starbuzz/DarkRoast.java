package headfirst.decorator.starbuzz;

public class DarkRoast extends Beverage
{
  public DarkRoast()
  {
    description = "Dark Roast Coffee\n";
  }
  public double cost()
  {
    return .99;
  }
}