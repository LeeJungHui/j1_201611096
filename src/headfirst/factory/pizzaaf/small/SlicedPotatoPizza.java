package headfirst.factory.pizzaaf.small;

public class SlicedPotatoPizza extends Pizza
{
  PizzaIngredientFactory inFac;
  public SlicedPotatoPizza(PizzaIngredientFactory ingredientFac)
  {
    name = "SlicedPotato Pizza";
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