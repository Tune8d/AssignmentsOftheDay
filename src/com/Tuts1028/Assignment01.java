package com.Tuts1028;

import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the matrix scope: ");
        int matrixScope = sc.nextInt();
        int count = matrixScope * matrixScope;

        for (int i = 0; i < matrixScope; i++) { // rows
            System.out.println(" ");
            for (int j = 0; j < matrixScope; j++) { // columns
                count--; // value
                if(count < 10){
                    System.out.print("0" + count + " ");
                }else{
                    System.out.print(count + " ");
                }
            }
        }
        sc.close();
    }
}
