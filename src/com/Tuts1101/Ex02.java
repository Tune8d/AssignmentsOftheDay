package com.Tuts1101;

/*
* 1 2 3 4 5
* 10 9 8 7 6
* 11 12 13 14 15
* 20 19 18 17 16
* 21 22 23 24 25
* */

public class Ex02 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int counter = 0;
        int liner = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i % 2 == 0){
                    counter++;
                    arr[i][j] = counter + liner;
                    System.out.print(arr[i][j] + " ");
                }else{
                    arr[i][j] = counter + liner;
                    System.out.print(arr[i][j] + " ");
                    counter--;
                }
            }
            liner += 5;
        System.out.print("\n");
        }
    }
}
