package com.mycompany.designpatterns.factory.abstract_factory.pizza_example.creator;

import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.cheese.CheesePizza;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.clam.ClamPizza;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.dough.DoughPizza;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.Pizza;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.sauce.SaucePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory
                = new NYPizzaIngredientFactory();
        switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            }
            case "Dough" -> {
                pizza = new DoughPizza(ingredientFactory);
                pizza.setName("New York Style Dough Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
            }
            case "Sauce" -> {
                pizza = new SaucePizza(ingredientFactory);
                pizza.setName("New York Style Sauce Pizza");
            }
            default -> {
            }
        }
        return pizza;
    }

}
