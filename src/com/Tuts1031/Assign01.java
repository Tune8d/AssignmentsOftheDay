package com.Tuts1031;

/*입력받은 수만큼 학생수를 입력받고
해당 내용을 출력받을 수 있는 로직
*
-----------------------
  전체 학생 수: N
-----------------------
  이름   전화번호
  000   000-0000-0000
  000   000-0000-0000

*/

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Assign01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력받을 학생 수");
        int noOfStudents = sc.nextInt();

        String[] student = new String[noOfStudents];
        String[] phoneNumber = new String[noOfStudents];

        for(int i = 0; i < noOfStudents; i++) {
            System.out.println("학생명을 입력하세요.");
            student[i] = sc.nextLine();
            System.out.println("학생의 전화번호를 입력하세요.");
            phoneNumber[i] = sc.nextLine();
        }

        System.out.println("-----------------------");
        System.out.println("     전체 학생 수: " + noOfStudents + "명");
        System.out.println("-----------------------");
        System.out.println("    이름\t\t전화번호");

        for(int i = 0; i < noOfStudents; i++) {
            System.out.println(student[i] + "\t\t" + phoneNumber[i]);
        }



    }
}
