package com.Tuts1101;

/*
* 학생 국어 수학 영어 총점 평균
* ===================
*
* 입력값은 학생의 숫자 및 점수?
* */

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        int sum = 0;
        String[] studentName = new String[numOfStudents];
        double average = 0;

        int[][] studentGrades = new int[numOfStudents][3];
        for (int i = 0; i < numOfStudents; i++) {
            System.out.printf("Enter student %d name: ", i+1);
            sc.nextLine(); // 이걸로 스캐너 구분점을 지정해준다
            studentName[i] = sc.nextLine();

            System.out.printf("Enter student %d's grade for 국어, 수학, 영어: ", i+1);
            for (int j = 0; j < 3; j++) {
                studentGrades[i][j] = sc.nextInt();
            }
        }

        System.out.println("\t이름\t국어\t수학\t영어\t총점\t평균");
        System.out.println("=============================");

        for (int i = 0; i < numOfStudents; i++) {
            System.out.printf("학생: %s\t", studentName[i]);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d점\t", studentGrades[i][j]);
                sum += studentGrades[i][j];
                average = (double)sum / numOfStudents;
            }
            System.out.printf("%d점\t%.1f점\t", sum, average);
            System.out.println("\n");
            sum = 0;
            average = 0;
        }

        sc.close();
    }
}
