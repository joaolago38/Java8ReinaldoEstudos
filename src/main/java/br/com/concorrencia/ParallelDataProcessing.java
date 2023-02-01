package br.com.concorrencia;
import java.util.function.Function;
import java.util.stream.Stream;

public class ParallelDataProcessing {
    public static void main(String[] args) {
        System.out.println(
                "Iterative sum done in:" +
                        measureSumPerf(ParallelDataProcessing::iterativeSum, 10_000_000) +
                        " msecs"
        );
        System.out.println(
                "Sequential sum done in:" +
                        measureSumPerf(ParallelDataProcessing::sequentialSum, 10_000_000) +
                        " msecs"
        );
        System.out.println(
                "Parallel sum done in:" +
                        measureSumPerf(ParallelDataProcessing::parallelSum, 10_000_000) +
                        " msecs"
        );


    }

    public static long measureSumPerf(final Function<Long, Long> adder, final long n){
        long fastest = Long.MAX_VALUE;
        for(int i = 0; i < 10; i++){
            final long start = System.nanoTime();
            final long sum = adder.apply(n);
            final long duration = (System.nanoTime() - start)/ 1_000_000;
            System.out.println("Result: " + sum);
            if(duration < fastest) fastest = duration;
        }
        return fastest;
    }

    public static long iterativeSum(final long n){
        long result = 0;
        for(long i = 1L; i <= n; i++){
            result += i;
        }
        return result;
    }

    public static long sequentialSum(final long n){
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .reduce(0L, (x, y) -> x + y);

    }
    public static long parallelSum(final long n){
        return Stream.iterate(1L, i -> i + 1)
                .limit(n)
                .parallel()
                .reduce(0L, (x, y) -> x + y);

    }
}
