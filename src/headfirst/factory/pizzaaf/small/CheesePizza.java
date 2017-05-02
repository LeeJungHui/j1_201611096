package headfirst.factory.pizzaaf.small;

public class CheesePizza extends Pizza
{
  PizzaIngredientFactory inFac;
  public CheesePizza(PizzaIngredientFactory ingredientFac)
  {
    name = "Cheese Pizza";
    //dough = "Regular Crust";
    //sauce = "Marinara Pizza Sauce";
    this.inFac = ingredientFac;
    toppings.add("Fresh Mozzarella");
    toppings.add("Parmesan");
  }
  void prepare()
  {
    dough = inFac.createDough();
    cheese = inFac.createCheese();
  }
}