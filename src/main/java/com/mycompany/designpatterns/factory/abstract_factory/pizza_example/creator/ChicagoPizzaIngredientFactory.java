package com.mycompany.designpatterns.factory.abstract_factory.pizza_example.creator;

import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.cheese.Cheese;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.cheese.MozzarellaCheese;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.clam.Clam;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.clam.FreshClam;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.dough.Dough;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.dough.ThickCrustDough;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.sauce.MarinaraSauce;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.sauce.Sauce;

public class ChicagoPizzaIngredientFactory extends PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }

}
