package br.com.concorrencia;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class NonTransitiveSpinner {
    private static final int ARRAY_SIZE = 4;
    private static final int RUNNING_SIZE = 10000;

    /**
     * @param args
     */
    public static void main(String[] args) {
        serialCalculation();

    }

    private static void serialCalculation() {
        final long start = System.currentTimeMillis();
        double[] spinResult;
        int[] spinnerA;
        int[] spinnerB;
        int[] spinnerC;
        while (true) {
            spinnerA = loadArrayWithRndValues();
            spinnerB = loadArrayWithRndValues();
            spinnerC = loadArrayWithRndValues();

            spinResult = spin(spinnerA, spinnerB, spinnerC);
            if (spinResult[0] > 55. && spinResult[1] > 55. && spinResult[2] > 55.) {
                break;
            }

        }

        System.out.println(Arrays.toString(spinResult));

        System.out.println("Spinner A: " + Arrays.toString(spinnerA));
        System.out.println("Spinner B: " + Arrays.toString(spinnerB));
        System.out.println("Spinner C: " + Arrays.toString(spinnerC));

        System.out.println("Elapsed Time: " + (System.currentTimeMillis() - start) + " msecs");
    }

    /**
     *
     * @return
     */
    private static int[] loadArrayWithRndValues() {
        final Random rnd = ThreadLocalRandom.current();
        final int[] arr = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            arr[i] = rnd.nextInt(10);
        }
        return arr;
    }

    /**
     *
     * @param arrA
     * @param arrB
     * @param arrC
     * @return
     */
    private static double[] spin(int[] arrA, int[] arrB, int[] arrC) {
        final Random rnd = ThreadLocalRandom.current();
        final double[] accumulator = new double[3];
        for (int i = 0; i < RUNNING_SIZE; i++) {
            final int a = arrA[rnd.nextInt(ARRAY_SIZE)];
            final int b = arrB[rnd.nextInt(ARRAY_SIZE)];
            final int c = arrC[rnd.nextInt(ARRAY_SIZE)];
            accumulator[0] += checkValues(a, b);
            accumulator[1] += checkValues(b, c);
            accumulator[2] += checkValues(c, a);
        }
        return normalize(accumulator);

    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    private static int checkValues(int x, int y) {
        return x > y ? 1 : 0;
    }

    /**
     *
     * @param d
     * @return
     */
    private static double[] normalize(final double[] d) {
        final double[] res = new double[3];
        res[0] = (d[0] / RUNNING_SIZE) * 100.0;
        res[1] = (d[1] / RUNNING_SIZE) * 100.0;
        res[2] = (d[2] / RUNNING_SIZE) * 100.0;
        return res;
    }

}
