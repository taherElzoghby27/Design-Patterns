package com.mycompany.designpatterns.factory.abstract_factory.pizza_example.creator;

import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.sauce.Sauce;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.clam.Clam;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.cheese.Cheese;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.dough.Dough;

public abstract class PizzaIngredientFactory {

    public abstract Dough createDough();

    public abstract Sauce createSauce();

    public abstract Cheese createCheese();

    public abstract Clam createClam();
}
