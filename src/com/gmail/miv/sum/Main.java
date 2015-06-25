package com.gmail.miv.sum;


import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[400];

        Random r = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = r.nextInt(10);

        }

        for (int i = 0; i < 10; i++) {
            new Summer(array, i);
        }

    }

}
