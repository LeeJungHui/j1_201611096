package headfirst.factory.pizzafa;

public class PizzaMain{
  public static void main(String[] args){
    PizzaStore ns = new NYPizzaStore();
    ns.orderPizza("cheese");
    PizzaStore sms = new SangMyungPizzaStore();
    sms.orderPizza("SMstyle");
  }
}