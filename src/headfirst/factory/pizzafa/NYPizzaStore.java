package headfirst.factory.pizzafa;

public class NYPizzaStore extends PizzaStore
{
  Pizza createPizza(String item)
  {
    Pizza pizza= null;
    if (item.equals("cheese"))
    {
      pizza = new NYStyleCheesePizza();
    }
    return pizza;
  }
}