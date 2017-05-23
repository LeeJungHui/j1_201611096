package headfirst.iterator.dinermerger.before;

public class MenuItem
{
  String name;
  String description;
  boolean vegetarian;
  double price;
  public MenuItem(String n,String d,boolean v, double p)
  {
    name = n;
    description = d;
    vegetarian = v;
    price = p;
  }
  public String getName()
  {
    return name;
  }
  public String getDescription()
  {
    return description;
  }
  public boolean getVege()
  {
    return vegetarian;
  }
  public double getPrice()
  {
    return price;
  }
}