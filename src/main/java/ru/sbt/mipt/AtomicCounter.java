package ru.sbt.mipt;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by 17046613 on 25.11.2018.
 */

public class AtomicCounter {

    private AtomicInteger counter = new AtomicInteger( 0 );

 public int count() {
     return counter.getAndIncrement();
 }
}
