package com.Tuts1112;


import java.util.Scanner;

public class ConcertController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 예약정보 저장 변수
        // 2. 좌석은 S석, A석, B석으로 나뉘며, 각각 10개의 좌석이 있다.
        // 4. 예약은 한자리만 가능하고, 좌석타입, 예약자 이름, 좌석 번호를 순서대로 입력받아 예약한다.

        String[][] reservedName = new String[3][10];
        int[][] reservedSeatNumber = new int[3][10];

        System.out.println("글로벌 인 콘서트 예약프로그램");
        System.out.println("예약:1, 조회:2, 취소:3, 종료:4");

        int menuInput = 0;
        boolean isWorking = false;
        boolean exit = false;

        while (!isWorking) {
            try {
                String choice = sc.nextLine();
                menuInput = Integer.parseInt(choice);
                isWorking = true;
            } catch (NumberFormatException e) {
                System.out.println("올바른 메뉴를 고르세요.");
                //isWorking = false;
            }
        }

        while (!exit) {
            switch (menuInput) {
                case 1:
                    System.out.println("예약기능");
                    sc.nextLine();
                    // pseudo-code:


                    BookingConcert bc = new BookingConcert.Builder(1, 2, "aaa").build();
                    bc.confirmBooking(reservedName, reservedSeatNumber);


                    break;
                case 2:
                    System.out.println("조회기능");
                    sc.nextLine();

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print(reservedName[i][j] + " ");
                            System.out.print(reservedSeatNumber[i][j] + " ");
                        }
                    }
                    break;
                case 3:
                    System.out.println("취소기능");
                    sc.nextLine();

                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    sc.nextLine();
                    exit = true;
                    break;
                default:
                    break;
            }

        }


        sc.close();
    }
}
