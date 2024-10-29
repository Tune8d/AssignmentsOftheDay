package com.Tuts1031;

/* 학생수 입력받고, 각 학생의 점수도 입력받은 다음
 * 각 학생의 총점, 평균점수, 편차를 구하시오
 * 학생수 입력: 3
 * 학생 점수: 00
 * 학생 점수: 10
 * 학생 점수: 20
 *
 * 총점: 30
 * 평균: 10
 * 편차: xx.x
 */

import java.util.Arrays;
import java.util.Scanner;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Assign03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DescriptiveStatistics stat = new DescriptiveStatistics();

        System.out.println("학생수를 입력하시오.");
        int noOfStudents = sc.nextInt();
        int[] grade = new int[noOfStudents];

        for (int i = 0; i < noOfStudents; i++) {
            System.out.printf("학생 %d 점수: ", i+1);
            grade[i] = sc.nextInt();
        }

        for(double g : grade){
            stat.addValue(g);
        }

        System.out.printf("총점: %d점 ", Arrays.stream(grade).sum());
        System.out.printf("평균점: %.1f점 ", Arrays.stream(grade).average().getAsDouble());
        System.out.printf("편차: %.1f점", stat.getStandardDeviation());

    }
}
