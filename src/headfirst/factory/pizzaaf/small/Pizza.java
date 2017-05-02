package headfirst.factory.pizzaaf.small;

import java.util.ArrayList;
public abstract class Pizza
{
  String name;
  Dough dough;
  String sauce;
  Cheese cheese;
  Potato potato;
  ArrayList<String> toppings = new ArrayList<String>();
  abstract void prepare();
  public void bake()
  {
    System.out.println("Bake for 25 minutes at 350");
  }
  public void cut()
  {
    System.out.println("Cutting the pizza into diagonal slices");
  }
  public void box()
  {
    System.out.println("Place pizza in official PizzaStore box");
  }
  void setName(String name) {
      this.name = name;
  }
  public String getName()
  {
    return name;
  }
}