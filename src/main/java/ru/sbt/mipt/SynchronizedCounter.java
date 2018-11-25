package ru.sbt.mipt;

/**
 * Created by 17046613 on 24.11.2018.
 */
public class SynchronizedCounter {

    private int counter = 0;

    public synchronized int count() {
        return counter++;
    }
}
