package com.venki.playground.tensa.zangetsu.designpattern.singleton;

/**
 * Created by vm023561 on 5/1/15.
 */
public class Singleton {
    private Singleton() {
    }

    private static class SingletonHolder {
        public static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }


}
