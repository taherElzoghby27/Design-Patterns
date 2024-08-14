package com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products;

import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.cheese.Cheese;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.clam.Clam;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.dough.Dough;
import com.mycompany.designpatterns.factory.abstract_factory.pizza_example.products.sauce.Sauce;

public abstract class Pizza {

    String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Cheese cheese;
    protected Clam clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("---- ").append(name).append(" ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        return result.toString();
    }
}
