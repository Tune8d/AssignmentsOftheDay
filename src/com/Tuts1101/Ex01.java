package com.Tuts1101;

public class Ex01 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int counter = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                counter++;
                arr[i][j] = counter;
                if(counter < 10){
                    System.out.print("0" + arr[i][j] + " ");
                }else{
                    System.out.print(arr[i][j] + " ");
                }
            }
        System.out.print("\n");
        }
    }
}
