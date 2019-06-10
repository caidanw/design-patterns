package com.mildmelon.designpatterns.creational.singleton;

public class Singleton
{

    // Single static instance
    private static Singleton instance = new Singleton();

    // Private constructor so no one can use the keyword "new"
    private Singleton() {}

    public static Singleton getInstance()
    {
        return instance;
    }

}
