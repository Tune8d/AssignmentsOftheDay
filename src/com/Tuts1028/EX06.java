package com.Tuts1028;

/*승수를 입력하여 값을 구하는 프로그램
* 입력값: 5
* 출력값: 3^5 = 243
* */

import java.util.Scanner;

public class EX06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("3 powered by "+ num + " is " + Math.pow(3, num) );

    }
}
