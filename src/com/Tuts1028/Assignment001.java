package com.Tuts1028;

/*
* 1 2 3 4 5
* 10 9 8 7 6
* 11 ...
* */

public class Assignment001 {
    public static void main(String[] args) {


        // 배열 없이 for 문으로만 접근할 것.
        int[] baseLoad = {1, 2, 3, 4, 5};
        int[] interimAdder = {9, 7, 5, 3, 1};
        int[] sectorAdder = {1, 3, 5, 7, 9};

        for (int i = 0; i < 5; i++) { // rows
            System.out.println(" ");
            if(i == 0){
                for(int k = 0; k < 5; k++){
                    System.out.print(baseLoad[k] + " ");
                }
            }else if (i % 2 == 0) {
                for(int k = 0; k < 5; k++){
                    System.out.print(baseLoad[k] + sectorAdder[k] + " ");
                    baseLoad[k] += sectorAdder[k];
                }
            }else{
                for(int k = 0; k < 5; k++){
                    System.out.print(baseLoad[k] + interimAdder[k] +" ");
                    baseLoad[k] += interimAdder[k];
                }
            }
        }
    }
}
