package headfirst.factory.pizzaaf.small;

public class MeshPotatoPizza extends Pizza
{
  PizzaIngredientFactory inFac;
  public MeshPotatoPizza(PizzaIngredientFactory ingredientFac)
  {
    name = "MeshPotato Pizza";
    //dough = "Regular Crust";
    //sauce = "Marinara Pizza Sauce";
    this.inFac = ingredientFac;
    toppings.add("olive");
    toppings.add("onion");
  }
  void prepare()
  {
    dough = inFac.createDough();
    cheese = inFac.createCheese();
    potato = inFac.createPotato();
  }
}