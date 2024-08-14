package com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.cheese;

import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.creator.PizzaIngredientFactory;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.Pizza;

public class CheesePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        cheese = pizzaIngredientFactory.createCheese();
    }

}
