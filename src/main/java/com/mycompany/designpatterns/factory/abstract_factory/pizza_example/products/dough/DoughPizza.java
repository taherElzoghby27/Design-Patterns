package com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.dough;

import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.creator.PizzaIngredientFactory;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.Pizza;

public class DoughPizza extends Pizza {

    private PizzaIngredientFactory pizzaIngredientFactory;

    public DoughPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = pizzaIngredientFactory.createDough();
    }
}
