package com.Tuts1028;


import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Enter the number1 : ");
        int a = 1;
        System.out.println("Enter the number : ");
        int b = sc.nextInt();

        //findEvenSums(a, b);
        //findOddSums(a, b);
        //findTenMultiplesSums(a, b);

        for(int i = 1; i<=iterateThisMuch(b); i++){
                System.out.printf("%d ~ %d까지의 짝수합:", a, 10*i);
                findEvenSums(a,10*i);

                System.out.printf("%d ~ %d까지의 홀수합:", a, 10*i);
                findOddSums(a,10*i);

                System.out.printf("%d ~ %d까지의 10의배수의 합:", a, 10*i);
                findTenMultiplesSums(a, 10*i);
        }


        sc.close();
    }

    public static int iterateThisMuch(int n){
        return n / 10;
    }

    public static void findEvenSums(int a, int b){
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        int evenSum = 0;

        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                evenSum += i;
            }
        }
        System.out.println(" Sum of all evens: " + evenSum);
    }
    public static void findOddSums(int a, int b){
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        int oddSum = 0;
        // 3 4 5 6 7 8 -> 4 6 8
        for(int i = start; i <= end; i++){
            if(i % 2 == 1){
                oddSum += i;
            }
        }
        System.out.println(" Sum of all odds: " + oddSum);
    }

    public static void findTenMultiplesSums(int a, int b){
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        int tenMultipleSum = 0;
        // 3 4 5 6 7 8 -> 4 6 8
        for(int i = start; i <= end; i++){
            if(i % 10 == 0){
                tenMultipleSum += i;
            }
        }
        System.out.println(" Sum of all multiples of 10: " + tenMultipleSum);
    }
}
