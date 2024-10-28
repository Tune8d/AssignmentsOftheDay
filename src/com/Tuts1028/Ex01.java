package com.Tuts1028;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/* 두 정수를 입력받아 그사이의 숫자의 합을 구하는 프로그램을 작성하시오
* 입력값: 3
* 입력값: 5
* 출력: 3 + 4 + 5 = 12
* */
public class Ex01 {


    public static void main(String[] args) {
        imperativeExpressionRefined();
    }

    public static void imperativeExpression(){
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

        // print out all the numbers gathered for information along with the sum
        int sum = 0;

        System.out.print("Output: ");

        for(Integer i : setInputs){
            sum += i;
            if(i == setInputs.last()){
                System.out.print(i + "=");
                break;
            }
            System.out.print(i + "+");
        }

        System.out.println(sum);
        sc.close();
    }

    public static void imperativeExpressionRefined(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number1 : ");
        int a = sc.nextInt();

        System.out.println("Enter the number2 : ");
        int b = sc.nextInt();

        // gather all of the number within range
        int start = Math.min(a,b);
        int end = Math.max(a,b);

        // Calculate the sum and construct the output String
        StringBuilder output = new StringBuilder();
        int sum = 0;

        for(int i = start; i <= end; i++){
            sum += i;
            output.append(i);
            if(i < end){
                output.append("+");
            }else{
                output.append(" = ");
            }
        }

        output.append(sum);
        System.out.println(output);
        sc.close();
    }
}
