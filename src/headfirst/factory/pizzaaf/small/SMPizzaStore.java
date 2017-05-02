package headfirst.factory.pizzaaf.small;

public class SMPizzaStore extends PizzaStore
{
  Pizza createPizza(String item)
  {
    Pizza pizza= null;
    PizzaIngredientFactory inFac = new SMPizzaIngredientFactory();
    if (item.equals("MeshPotato"))
    {
      pizza = new MeshPotatoPizza(inFac);
    }
    else if(item.equals("SlicedPotato"))
    {
      pizza = new SlicedPotatoPizza(inFac);
    }
    return pizza;
  }
}