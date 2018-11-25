package ru.sbt.mipt;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 17046613 on 25.11.2018.
 */
public class ReentrantLockCounter {
        private int counter = 0;

        private Lock lock = new ReentrantLock(true);

        public int count() {
            lock.lock();

            try {
                return counter++;
            } finally {
                lock.unlock();
            }
        }
}

