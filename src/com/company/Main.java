package com.company;

public class Main {
    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0) {
            int n = number;
            int m = number;
            if(n >= 10) {
                while (n != 0) {
                    n = n / 10;
                    if (n < 10) {
                        break;
                    }
                }
            }
            if (m >= 10)
            m = m % 10;

            return m+n;
        }
        else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
}
