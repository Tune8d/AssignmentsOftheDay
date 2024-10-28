package com.Tuts1028;

import java.util.Scanner;
import java.util.TreeSet;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> setInputs = new TreeSet<>();

        System.out.println("Enter the number1 : ");
        int a = sc.nextInt();

        System.out.println("Enter the number2 : ");
        int b = sc.nextInt();

        // gather all of the number within range
        if(a < b){
            for (int i = a; i <= b; i++) {
                setInputs.add(i);
            }
        }else if(b < a){
            for (int i = b; i <= a; i++) {
                setInputs.add(i);
            }
        }else{
            setInputs.add(a);
        }

        // print out all the numbers gathered for information along with the products
        int prod = 1;

        System.out.print("Output: ");

        for(Integer i : setInputs){
            prod *= i;
            if(i == setInputs.last()){
                System.out.print(i + "=");
                break;
            }
            System.out.print(i + "x");
        }

        System.out.println(prod);


    }
}
