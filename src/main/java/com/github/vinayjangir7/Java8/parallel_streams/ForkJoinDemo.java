package com.github.vinayjangir7.Java8.parallel_streams;


import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

public class ForkJoinDemo extends RecursiveTask<Long> {

	
    public static final long THRESHOLD = 10;

    private final long[] numbers;
    private final int start;
    private final int end;

    public ForkJoinDemo(long[] numbers) {
        this(numbers, 0, numbers.length);
    }

    private ForkJoinDemo(long[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int length = end - start;
        if (length <= THRESHOLD) {
            return computeSequentially();
        }
        ForkJoinDemo leftTask = new ForkJoinDemo(numbers, start, start + length/2);
        leftTask.fork();
        ForkJoinDemo rightTask = new ForkJoinDemo(numbers, start + length/2, end);
        Long rightResult = rightTask.compute();
        Long leftResult = leftTask.join();
        return leftResult + rightResult;
    }

    private long computeSequentially() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static long forkJoinSum(long n) {
        long[] numbers = LongStream.rangeClosed(1, n).toArray();
        ForkJoinTask<Long> task = new ForkJoinDemo(numbers);
        return ParallelStreamsDriver.FORK_JOIN_POOL.invoke(task);
    }
}
