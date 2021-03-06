package headfirst.factory.pizzafa;

import java.util.ArrayList;
public class Pizza
{
  String name;
  String dough;
  String sauce;
  ArrayList<String> toppings = new ArrayList<String>();
  public void prepare()
  {
    System.out.println("Preparing" + name);
  }
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
  public String getName()
  {
    return name;
  }
  public String toString() {
    StringBuffer display = new StringBuffer();
    display.append("---- " + name + " ----\n");
    display.append(dough + "\n");
    display.append(sauce + "\n");
    for (int i = 0; i < toppings.size(); i++) {
      display.append((String)toppings.get(i) + "\n");
    }
    System.out.println(display);
    return display.toString();
  }
}