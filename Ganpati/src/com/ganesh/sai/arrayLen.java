package com.ganesh.sai;

public class arrayLen {

    public static void main(String[] args) {
        int[] num = { 9, 8, 7, 6 };
        /// num.length = 7;


        for (int c = 0; c < num.length; c++) {

            System.out.println(num[c]);

        }


        for (int i : num) {

            System.out.println(i);
        }

    }
}
