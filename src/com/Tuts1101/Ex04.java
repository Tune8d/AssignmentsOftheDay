package com.Tuts1101;


import java.util.Scanner;

/*명수만 늘리기*/
public class Ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int k = 2; k <= 10; k += input) {

            for (int i = 1; i < 10; i++) {
                for (int j = k; j < k + input && j < 10; j++) {
                    System.out.printf("%d * %d = %2d \t\t", j, i, i * j);
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
