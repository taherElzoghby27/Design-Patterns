package com.mycompany.designpatterns.singleton;

public class Test {

    public static void main(String[] args) {
        //Singleton instance1 = Singleton.getInstance();
        //Singleton instance2 = Singleton.getInstance();
        //System.out.println(instance1 + "\n" + instance2);
        Thread t1 = new Thread(() -> {
            Singleton instance1 = Singleton.getInstance();
        });
        Thread t2 = new Thread(() -> {
            Singleton instance2 = Singleton.getInstance();
        });
        t1.start();
        t2.start();
//        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
//        boiler.fill();
//        boiler.boil();
//        boiler.drain();
    }
}
