package headfirst.factory.pizzaaf.small;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        PizzaStore chiStore = new ChicagoPizzaStore();
        Pizza pizza2 = chiStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza2.getName() + "\n");
        PizzaStore smStore = new SMPizzaStore();
        Pizza pizza3 = smStore.orderPizza("SlicedPotato");
        System.out.println("Ethan ordered a " + pizza3.getName() + "\n");
 }
}