package com.github.vinayjangir7.Java8.parallel_streams;

import java.util.concurrent.ForkJoinPool;
import java.util.function.Function;

public class ParallelStreamsDriver {

    public static final ForkJoinPool FORK_JOIN_POOL = new ForkJoinPool();

    public static void main(String[] args) {
        System.out.println("Iterative Sum done in: " + measurePerf(ParallelStreamMethods::iterativeSum, 10_000_000L) + " msecs");
        System.out.println("Sequential Sum done in: " + measurePerf(ParallelStreamMethods::sequentialSum, 10_000_000L) + " msecs");
        System.out.println("Parallel Sum done in: " + measurePerf(ParallelStreamMethods::parallelSum, 10_000_000L) + " msecs" );
        System.out.println("Range Sum done in: " + measurePerf(ParallelStreamMethods::rangedSum, 10_000_000L) + " msecs");
        System.out.println("Parallel range Sum done in: " + measurePerf(ParallelStreamMethods::parallelRangedSum, 10_000_000L) + " msecs" );
        System.out.println("ForkJoin sum done in: " + measurePerf(ForkJoinDemo::forkJoinSum, 10_000_000L) + " msecs" );
        System.out.println("SideEffect sum done in: " + measurePerf(ParallelStreamMethods::sideEffectSum, 10_000_000L) + " msecs" );
        System.out.println("SideEffect parallel sum done in: " + measurePerf(ParallelStreamMethods::sideEffectParallelSum, 10_000_000L) + " msecs" );
    }

    public static <T, R> long measurePerf(Function<T, R> f, T input) {
        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 10; i++) {
            long start = System.nanoTime();
            R result = f.apply(input);
            long duration = (System.nanoTime() - start) / 1_000_000;
            /*System.out.println("Result: " + result);*/
            if (duration < fastest) {
                fastest = duration;
            }
        }
        return fastest;
    }
}

