package com.mycompany.designpatterns.singleton;
//solution 1

//public class Singleton {
//
//    static private Singleton uniqueSingleton;
//
//    private Singleton() {
//        System.out.println("initiated constructor");
//    }
//
//    public synchronized static Singleton getInstance() {
//        if (uniqueSingleton == null) {
//            uniqueSingleton = new Singleton();
//        }
//        return uniqueSingleton;
//    }
//}
//solution 2
//
//public class Singleton {
//
//    static private Singleton uniqueSingleton = new Singleton();
//
//    private Singleton() {
//        System.out.println("initiated constructor");
//    }
//
//    public static Singleton getInstance() {
//        return uniqueSingleton;
//    }
//}
//solution 3
//
//public class Singleton {
//
//    static volatile private Singleton uniqueInstance;
//
//    private Singleton() {
//        System.out.println("initiated constructor");
//    }
//
//    public static Singleton getInstance() {
//        if (uniqueInstance == null) {
//            synchronized (Singleton.class) {
//                if (uniqueInstance == null) {
//                    uniqueInstance = new Singleton();
//                }
//            }
//
//        }
//        return uniqueInstance;
//    }
//}
//solution 4
//
public class Singleton {

    private Singleton() {
        System.out.println("initiated constructor");
    }

    private static class Loader {

        static final Singleton uniqueSingleton = new Singleton();
    }

    public static Singleton getInstance() {
        return Loader.uniqueSingleton;
    }
}
