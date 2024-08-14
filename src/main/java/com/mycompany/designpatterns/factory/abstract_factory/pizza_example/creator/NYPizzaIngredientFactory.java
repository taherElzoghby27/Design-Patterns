package com.mycompany.designpatterns.factory.abstract_factory.pizza_example.creator;

import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.cheese.Cheese;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.cheese.ReggianoCheese;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.clam.Clam;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.clam.FrozenClams;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.dough.Dough;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.dough.ThinCrustDough;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.sauce.PlumTomatoSauce;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.sauce.Sauce;

public class NYPizzaIngredientFactory extends PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Clam createClam() {
        return new FrozenClams();
    }
}
