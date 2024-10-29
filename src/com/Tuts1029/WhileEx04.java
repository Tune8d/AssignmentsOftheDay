package com.Tuts1029;

/*
    - 1 + 4 - 9 + 16
* -1^2 + 2^2 - 3^2 + 4^2 - 5^2 + 6^2 - //
* 입력은 생성 개수
*   * 홀수번째는 (-1) * a ^ 2
*   * 짝수번째는 a ^ 2
* 출력은 상기식의 합계 (5050)
*
* 예시)
* 입력값: 4
* 생성값:
* // 입력값은 생성값의 개수이자, 최대값이다.
* -1^2 - 3^2
*  2^2 + 4^2
*
* 예시2 (if문 미적용)
* -1^ 2
*
* */

import java.util.Scanner;

public class WhileEx04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of inputs: ");

        // if 문 미적용 // 합계를 두개로 나눠받기
        int makeThisMuch = sc.nextInt();
        int counter = makeThisMuch;

        int sum = 0;

        while (counter > 0) {



            counter--;
        }

        /* if 문 적용
        int makeThisMuch = sc.nextInt();
        int counter = makeThisMuch;
        int unitChanger = -1;
        int sum = 0;

        while (counter > 0) {
            if (counter % 2 == 0) {
                System.out.println("+" + counter + "^2");
                sum += (int) Math.pow(counter, 2);
            }else{
                System.out.println("-" + counter + "^2");
                sum -= (int) Math.pow(counter, 2);
            }
            counter--;
        }
        */

        System.out.println("총합:" + sum);


    }
}
