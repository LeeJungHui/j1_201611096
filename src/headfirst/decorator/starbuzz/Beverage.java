package headfirst.decorator.starbuzz;

public abstract class Beverage{
  String description = "UnKnown beverage";
  public String getDescription()
  {
    return description;
  }
  public abstract double cost();
}