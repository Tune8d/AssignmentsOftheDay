package com.Tuts1112;

    /*
      4. 예약은 한자리만 가능하고, 좌석타입, 예약자 이름, 좌석 번호를 순서대로 입력받아 예약한다.
      7. 없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소 등에 대해서 오류 메시지를 출력하고
      다시 입력 할 수있도록 한다.

      좌석구분 S(1), A(2), B(3) => 1
  S : --- --- --- --- --- --- --- --- --- ---  현재 S석 상태
       1   2   3   4   5   6   7   8   9   10
  이름 : 가길동
  번호 : 1

 --------------------------- 예약  ------------------------------------
     */

import java.util.Scanner;

class BookingConcert {
    private static final Scanner sc = new Scanner(System.in);
    // 공연은 하루에 한번 있다.
    // 예약은 한자리만 가능하고, 좌석타입, 예약자 이름, 좌석 번호를 순서대로 입력받아 예약한다.
    private final int noOfSeats = 1;
    private final int seatType;
    private final int seatNumber;
    private final String seatName;

    private BookingConcert(Builder builder) {
        // 필수 기입 정보
        this.seatType = builder.seatType;
        this.seatNumber = builder.seatNumber;
        this.seatName = builder.seatName;
    }

    // 예약정보 저장 배열에 예약자 정보를 입력하여 저장.
    // 공석은 null 혹은 0, 예약석은 1로 표시. 실제 조회 기능 출력은 이름으로 수행됨.
    void confirmBooking(String[][] reservedName, int[][] reservedSeatNumber) {
        // 각 정보값의 배열에 지정된 위치에 저장하기
        reservedSeatNumber[seatType][seatNumber] = 1;
        reservedName[seatType][seatNumber] = seatName;

        // Optional: Ask if the user wants to continue with this feature
        System.out.print("Press 'b' to go back to the menu or any other key to continue Feature 1: ");
        String input = sc.nextLine();

        if (input.equalsIgnoreCase("b")) {
            System.out.println("Returning to the main menu...");
            return; // Exit the feature and go back to the main menu
        }

        // Continue with the rest of Feature 1 logic
        System.out.println("Feature 1 logic continues here...");

    }

    static class Builder {
        private int seatType;
        private int seatNumber;
        private String seatName;

        Builder(int seatType, int seatNumber, String seatName) {
            this.seatType = seatType;
            this.seatNumber = seatNumber;
            this.seatName = seatName;
        }

        BookingConcert build() {
            return new BookingConcert(this);
        }

    }


}
