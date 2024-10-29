package com.Tuts1029;

/* 사용자가 입력하는 숫자를 계속 받고,
0을 입력하면 총합을 출력하는 로직
* 단, if 문을 쓰지 말것
* */

import java.util.Scanner;

public class WhileEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 1;
        int sum = 0;

        while (input != 0) {
            System.out.println("Enter number: ");
            input = sc.nextInt(); // dynamic reassignment
            sum += input;
        }
        System.out.println("Sum: " + sum);

        sc.close();
    }
}
