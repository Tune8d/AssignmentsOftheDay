package com.Tuts1029;

/*
 입력된 정수의 개수를 입력받음
 해당 값으로 정수를 입력받음
 출력은 입력된 값이 평균
 입력은 int, 출력은 double
 */

import java.util.Scanner;

public class WhileEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of inputs: ");
        int noOfNums = sc.nextInt();
        int input = 0;
        int sum = 0;

        // save the number of inputs
        int counter = noOfNums;

        // loop for sum
        while (noOfNums > 0) {
            System.out.print("Enter input : ");
            noOfNums--;
            input = sc.nextInt();
            sum += input;
        }

        System.out.printf("Average: %.2f", (double)sum / counter);


    }
}
