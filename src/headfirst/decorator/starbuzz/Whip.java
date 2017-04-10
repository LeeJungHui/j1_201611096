package headfirst.decorator.starbuzz;

public class Whip extends CondimentDecorator
{
   Beverage beverage;
   public Whip(Beverage b)
   {
     this.beverage = b;
   }
   
   public String getDescription()
   {
     return beverage.getDescription() + "Adding Whip\n";
   }
   
   public double cost()
   {
     return beverage.cost()+0.10;
   }
}