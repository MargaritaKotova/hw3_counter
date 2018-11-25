package ru.sbt.test;

import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import ru.sbt.mipt.AtomicCounter;
import ru.sbt.mipt.ReentrantLockCounter;
import ru.sbt.mipt.SemaphoreCounter;
import ru.sbt.mipt.SynchronizedCounter;

import java.util.concurrent.TimeUnit;

    /**
     * Created by 17046613 on 24.11.2018.
     */


    @State(Scope.Benchmark)
    public class test {


        public static void main(String[] args) throws RunnerException {
            Options options = new OptionsBuilder()
                    .include(test.class.getName())
                    .warmupIterations(10)
                    .measurementIterations(30)
                    .forks(1)
                    .resultFormat(ResultFormatType.CSV)
                    .result("result.csv")
                    .mode(Mode.Throughput)
                    .build();
            new Runner(options).run();
        }

        private SynchronizedCounter synchronizedCounter;
        private SemaphoreCounter semaphoreCounter;
        private AtomicCounter atomicCounter;
        private ReentrantLockCounter reentrantLockCounter;

        @Setup
        public void set(){
            synchronizedCounter = new SynchronizedCounter();
            semaphoreCounter = new SemaphoreCounter();
            atomicCounter = new AtomicCounter();
            reentrantLockCounter = new ReentrantLockCounter();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(1)
        public int synchronizedCounterThreads_1() {
            return synchronizedCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(1)
        public int semaphoreCounterThreads_1() {
            return semaphoreCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(1)
        public int atomicCounterThreads_1() {
            return atomicCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(1)
        public int reentrantCounterThreads_1() {
            return reentrantLockCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(2)
        public int synchronizedCounterThreads_2() {
            return synchronizedCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(2)
        public int semaphoreCounterThreads_2() {
            return semaphoreCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(2)
        public int atomicCounterThreads_2() {
            return atomicCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(2)
        public int reentrantCounterThreads_2() {
            return reentrantLockCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(4)
        public int synchronizedCounterThreads_4() {
            return synchronizedCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(4)
        public int semaphoreCounterThreads_4() {
            return semaphoreCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(4)
        public int atomicCounterThreads_4() {
            return atomicCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(4)
        public int reentrantCounterThreads_4() {
            return reentrantLockCounter.count();
        }


        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(8)
        public int synchronizedCounterThreads_8() {
            return synchronizedCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(8)
        public int semaphoreCounterThreads_8() {
            return semaphoreCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(8)
        public int atomicCounterThreads_8() {
            return atomicCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(8)
        public int reentrantCounterThreads_8() {
            return reentrantLockCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(16)
        public int synchronizedCounterThreads_16() {
            return synchronizedCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(16)
        public int semaphoreCounterThreads_16() {
            return semaphoreCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(16)
        public int atomicCounterThreads_16() {
            return atomicCounter.count();
        }

        @Benchmark
        @OutputTimeUnit(TimeUnit.MICROSECONDS)
        @Threads(16)
        public int reentrantCounterThreads_16() {
            return reentrantLockCounter.count();
        }


    }


