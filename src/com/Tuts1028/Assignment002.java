package com.Tuts1028;

/* [Wanted Output]
* 1 2 3 4 5  // +1 -> 1 1 1 1
* 10 9 8 7 6  // +9 -> -1 -1 -1 -1
* 11 12 13 14 15 // +1 -> 1 1 1 1
* 20 19 18 17 16 // +9 -> -1 -1 -1 -1
* 21 22 23 24 25 // +1 -> 1 1 1 1
 */

public class Assignment002 {
    public static void main(String[] args) {

        //System.out.println( 0 % 2); // 0

        // 배열 없이 for 문으로만 접근할 것.
        // k = 1 에서 시작해서, 짝수행은 첫값 +1 및 이를 기준으로 ++, 홀수행은 첫값 +9 및 이를 기준으로 --.
        // 첫 값은 루프에서 누적된다.

        int k = 1;

        for (int i = 0; i < 5; i++) {
            System.out.println(" ");

            if (i % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(k + " ");
                    k++;
                }
            } else {
                int headerNum = k + 4;
                for (int j = 0; j < 5; j++) {
                    System.out.print(headerNum + " ");
                    headerNum--;
                }
                k += 5;
            }
        }
    }
}