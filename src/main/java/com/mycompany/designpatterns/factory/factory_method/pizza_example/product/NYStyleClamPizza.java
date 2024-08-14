package com.mycompany.designpatterns.factory.factory_method.pizza_example.product;

public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza() {
        name = "NY style Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Clam");

    }

}
