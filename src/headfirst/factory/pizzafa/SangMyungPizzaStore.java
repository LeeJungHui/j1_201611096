package headfirst.factory.pizzafa;

public class SangMyungPizzaStore extends PizzaStore{
  public Pizza createPizza(String type){
    Pizza pizza = null;
    if(type.equals("SMstyle")){
      pizza = new SMStylePizza();
    }
    return pizza;
  }
}