package com.Tuts1104;

/*
* 배열 사용하지 말것
* 입력예시1)

  행입력: 4 (만약 입력값 5이면 2x1~5x9 일괄출력 후 다음 단계에서 6x1~9x9 출력)
  결과값 (2x1부터 9x9까지 전부) :

* 2 x 1 = 2   3 x 1 = 3   4 x 1 = 4  5 x 1 = 5
* 2 x 2 = 4   3 x 2 = 6   4 x 2 = 8  ....
* 2 x 3 = 6   ....
* ...
* 2 x 9 = 18  ....        4 x 9 = 36 5 x 9 = 45
*
* 6 x 1 = 6   7 x 1 = 7   ....       9 x 1 = 9
* 6 x 2 = 12  7 x 2 = 14  ....       9 x 2 = 18
* 6 x 3 = 18  ....        ....       ....
* ...         ....        ....       ....
* 6 x 9 = 54  ....        ....       9 x 9 = 81
*
*
*
* 입력한 값에 대한 구구단이 한번 출력되고,
* 다음 구구단도 마찬가지로 같은 길이로 출력되어야 한다.
* 총 8개다 (2 ~ 9)
* */

import java.util.Scanner;

public class NineByNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("행입력: ");
        int inputRow = scanner.nextInt();
        int startMultiplier = 2;

        while (startMultiplier <= 9) {
            printMultiplicationTable(startMultiplier, inputRow);
            startMultiplier += inputRow;
        }
    }

    public static void printMultiplicationTable(int startMultiplier, int rows) {
        int endMultiplier = Math.min(startMultiplier + rows - 1, 9);
        for (int i = 1; i <= 9; i++) {
            for (int j = startMultiplier; j <= endMultiplier; j++) {
                System.out.printf("%d x %d = %d\t", j, i, j * i);
            }
            System.out.println();
        }
        System.out.println();
    }
}

