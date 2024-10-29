package com.Tuts1031;

/* [Wanted Output]
 * 1 2 3 4 5  // +1 -> 1 1 1 1
 * 10 9 8 7 6  // +9 -> -1 -1 -1 -1
 * 11 12 13 14 15 // +1 -> 1 1 1 1
 * 20 19 18 17 16 // +9 -> -1 -1 -1 -1
 * 21 22 23 24 25 // +1 -> 1 1 1 1
 */

public class Assign02 {
    public static void main(String[] args) {
        int[] arr = new int[25];
        int counter = 0;
        int header = 0;

        for (int i = 0; i < arr.length; i++) {

            if(i % 2 == 0){
                arr[i] = counter;
                System.out.print(arr[i] + 1 + " ");
                counter++;
            }else {
                arr[i] = counter;
                System.out.print(arr[i] + 1 + " ");
                counter++;
            }
            header = arr[i];
        }



    }
}
