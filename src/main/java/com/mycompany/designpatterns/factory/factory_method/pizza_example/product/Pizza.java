package com.mycompany.designpatterns.factory.factory_method.pizza_example.product;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("preparing "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce");
        System.out.print("Adding toppings : ");
        for(String topping:toppings){
            System.out.print(topping+" ");
        }
        System.out.println();
    }

    public void bake() {
        System.out.println("Bake for 25 minute at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("place pizza in official pizzaStore box");
    }

    public String getName() {
        return name;
    }
}
