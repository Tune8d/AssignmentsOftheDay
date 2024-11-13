package com.Tuts1112.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 각 클래스를 구분하고, 예외처리 기능을 추가하자.
 *
 * */

enum SeatInfo {
    S, A, B
}

class ConcertController {
    private final BookingConcert bookingConcert;
    private final CheckingConcert checkingConcert;
    private final CancelConcert cancelConcert;

    public ConcertController() {
        bookingConcert = new BookingConcert();
        checkingConcert = new CheckingConcert(bookingConcert);
        cancelConcert = new CancelConcert(bookingConcert);
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n글로벌 인 콘서트 예약 프로그램");
            System.out.println("예약:1, 조회:2, 취소:3, 종료:4");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> bookingConcert.bookSeat();
                case 2 -> checkingConcert.checkSeats();
                case 3 -> cancelConcert.cancelSeat();
                case 4 -> System.out.println("프로그램을 종료합니다.");
                default -> System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        } while (choice != 4);
    }
}

class BookingConcert {
    private final Map<SeatInfo, String[]> seats;

    public BookingConcert() {
        seats = new HashMap<>();
        for (SeatInfo seatInfo : SeatInfo.values()) {
            seats.put(seatInfo, new String[10]);
        }
    }

    public void bookSeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("좌석구분 S(1), A(2), B(3)");
        int seatType = scanner.nextInt();
        SeatInfo seatInfo = getSeatInfo(seatType);
        if (seatInfo == null) {
            System.out.println("잘못된 좌석 구분입니다. 다시 시도하세요.");
            return;
        }

        displaySeats(seatInfo);

        System.out.print("이름: ");
        String name = scanner.next();
        System.out.print("번호 (1-10): ");
        int seatNumber = scanner.nextInt() - 1;

        if (seatNumber < 0 || seatNumber >= 10 || seats.get(seatInfo)[seatNumber] != null) {
            System.out.println("잘못된 번호이거나 이미 예약된 좌석입니다. 다시 시도하세요.");
            return;
        }

        seats.get(seatInfo)[seatNumber] = name;
        System.out.println("예약이 완료되었습니다.");
    }

    SeatInfo getSeatInfo(int seatType) {
        return switch (seatType) {
            case 1 -> SeatInfo.S;
            case 2 -> SeatInfo.A;
            case 3 -> SeatInfo.B;
            default -> null;
        };
    }

    void displaySeats(SeatInfo seatInfo) {
        String[] seatArray = seats.get(seatInfo);
        System.out.print(seatInfo + " : ");
        for (String seat : seatArray) {
            System.out.print((seat == null ? "---" : seat) + " ");
        }
        System.out.println();
    }

    public Map<SeatInfo, String[]> getSeats() {
        return seats;
    }
}

class CheckingConcert {
    private final BookingConcert bookingConcert;

    public CheckingConcert(BookingConcert bookingConcert) {
        this.bookingConcert = bookingConcert;
    }

    public void checkSeats() {
        for (SeatInfo seatInfo : SeatInfo.values()) {
            bookingConcert.displaySeats(seatInfo);
        }
        System.out.println("조회가 완료되었습니다.");
    }
}

class CancelConcert {
    private final BookingConcert bookingConcert;

    public CancelConcert(BookingConcert bookingConcert) {
        this.bookingConcert = bookingConcert;
    }

    public void cancelSeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("좌석구분 S(1), A(2), B(3)");
        int seatType = scanner.nextInt();
        SeatInfo seatInfo = bookingConcert.getSeatInfo(seatType);
        if (seatInfo == null) {
            System.out.println("잘못된 좌석 구분입니다. 다시 시도하세요.");
            return;
        }

        bookingConcert.displaySeats(seatInfo);
        System.out.print("이름: ");
        String name = scanner.next();

        String[] seatArray = bookingConcert.getSeats().get(seatInfo);
        boolean found = false;
        for (int i = 0; i < seatArray.length; i++) {
            if (name.equals(seatArray[i])) {
                seatArray[i] = null;
                System.out.println("취소가 완료되었습니다.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("예약자 이름을 찾을 수 없습니다. 다시 시도하세요.");
        }
    }
}

public class TestingController {
    public static void main(String[] args) {
        ConcertController concertController = new ConcertController();
        concertController.start();
    }
}

