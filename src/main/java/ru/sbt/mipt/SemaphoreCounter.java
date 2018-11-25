package ru.sbt.mipt;

import java.util.concurrent.Semaphore;

/**
 * Created by 17046613 on 25.11.2018.
 */
public class SemaphoreCounter {

    Semaphore semaphore = new Semaphore(1);
    private int counter = 0;

    public int count() {
        try {

            semaphore.acquire();
            counter++;
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        finally {
            semaphore.release();
        }
        return counter;
    }

}

