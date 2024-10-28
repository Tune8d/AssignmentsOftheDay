package com.Tuts1028;

/* 입력값 1: 입력가능횟수
* 입력값 2 ... n : 값 입력
* 출력값: 2 ...  n 의 평균값 (소수점 3자리까지)
*
* */

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력할 횟수: ");
        int iterateThisMuch = sc.nextInt();
        float sum = 0;

        for (int i = 1; i <= iterateThisMuch; i++) {
            System.out.print("입력값 " + i + ": ");
            sum += sc.nextInt();
        }

        System.out.printf("입력값의 평균: %.3f", sum/iterateThisMuch);

    }
}
