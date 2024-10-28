package com.Tuts1028;

import java.util.Scanner;

/*
* 사용자로부터 하나의 숫자를 입력받은 다음 그 수만큼
* 3의 배수를 출력하는 프로그램 작성.
*
* 예:
* 입력값: 5
* 출력값: 3 6 9 12 15
* */
public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.print(3*i + " ");
        }
    }
}
