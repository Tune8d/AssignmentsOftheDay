package com.Tuts1030;

public class QueryEditor {
    public static void main(String[] args) {

        for(int i = 1; i <= 20; i++){
            if(i <= 12){
                System.out.printf("('mo%d','gaga',true, false, -1, -1, -1.0, %d), ", i, i);
            }else{
                System.out.printf("('mo%d','gaga',true, false, -1, -1, -1.0, %d), ", i, i-12);
            }

        }

    }
}
