package com.Tuts1028;

import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Ex03_pracFunctional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;

        // User input
        System.out.println("Enter a number: ");
        int b = sc.nextInt();

        // Iterate the range and find sums
        IntStream.rangeClosed(1, iterateThisMuch(b)).forEach(i -> {
            int rangeEnd = 10 * i;

            System.out.printf("From %d to %d; ", a, rangeEnd);
            findSumInRange(a, rangeEnd, n -> n % 2 == 0, "sum of all evens");

            System.out.printf("From %d to %d; ", a, rangeEnd);
            findSumInRange(a, rangeEnd, n -> n % 2 == 1, "sum of all odds");

            System.out.printf("From %d to %d; ", a, rangeEnd);
            findSumInRange(a, rangeEnd, n -> n % 10 == 0, "sum of all multiples of 10");

        });


    }

    public static int iterateThisMuch(int n){
        return n / 10;
    }

    public static void findSumInRange(int a, int b, IntPredicate condition, String message){
        int sum = IntStream.rangeClosed(Math.min(a, b), Math.max(a,b))
                .filter(condition)
                .sum();
        System.out.println(" " + message + ": " + sum);
    }

}


