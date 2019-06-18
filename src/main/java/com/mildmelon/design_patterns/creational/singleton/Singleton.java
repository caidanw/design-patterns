package com.mildmelon.designpatterns.creational.singleton;

public class Singleton {

    // Single instance
    private static volatile Singleton instance = null;

    // Private constructor so no one can use the keyword "new"
    private Singleton()  {
        // Protect from instantiation on reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static Singleton getInstance() {
        // Lazy load by only creating an instance when it's needed
        if (instance == null) {
            // Don't create new instances for each thread
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

}
