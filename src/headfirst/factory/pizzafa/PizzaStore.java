package headfirst.factory.pizzafa;

public abstract class PizzaStore
{
  abstract Pizza createPizza(String item);
  public Pizza orderPizza(String type)
  {
    Pizza pizza;
    pizza = createPizza(type);
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    pizza.toString();
    return pizza; 
  }
}
