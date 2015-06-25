package com.gmail.miv.sum;


public class Summer implements Runnable {

    private int array[];
    private int number;

    public Summer(int[] array, int number) {
        this.array = array;
        this.number = number;
        new Thread(this).start();
    }

    @Override
    public void run() {

        int sum = 0;

        if (number != 0) {
            for (int i = 0; i < array.length; i++) {

                if (i % number == 0) {
                    sum += array[i];
                }

            }
        }

        System.out.println(" number = " + number + " sum = " + sum);
    }
}
