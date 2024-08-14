package com.mycompany.designpatterns.factory.abstract_factory.pizza_example;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.creator.ChicagoPizzaStore;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.creator.NYPizzaStore;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.creator.PizzaStore;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.Pizza;

/**
 *
 * @author Taher
 */
public class test {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");
        Pizza pizza1 = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza1 + "\n");
        Pizza pizza2 = chicagoStore.orderPizza("Sauce");
        System.out.println("Ethan ordered a " + pizza2 + "\n");
    }
}
