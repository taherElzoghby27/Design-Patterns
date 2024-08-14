package com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.sauce;

import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.creator.PizzaIngredientFactory;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.Pizza;

public class SaucePizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public SaucePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        sauce = pizzaIngredientFactory.createSauce();
    }
}
