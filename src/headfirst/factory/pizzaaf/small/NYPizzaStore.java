package headfirst.factory.pizzaaf.small;

public class NYPizzaStore extends PizzaStore
{
  Pizza createPizza(String item)
  {
    Pizza pizza= null;
    PizzaIngredientFactory inFac = new NYPizzaIngredientFactory();
    if (item.equals("cheese"))
    {
      pizza = new CheesePizza(inFac);
    }
    return pizza;
  }
}