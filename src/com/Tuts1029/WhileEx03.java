package com.Tuts1029;

/*
* 2의 승수를 구하는 로직.
* 입력값: N
* 출력값: 2^N
* */

import java.util.Scanner;

public class WhileEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter power: ");
        int n = sc.nextInt();
        int prod = 1;

        while(n > 0) {
            prod *= 2;
            n--;
        }

        System.out.println("2 powered by your number is " + prod);
    }
}
