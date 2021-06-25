package com.company;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample ca = new CalculationExample();
        ca.calculate(x, y);

    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            System.out.println("Tổng x + y = " + a);
            int b = x - y;
            System.out.println("Hiệu x - y = " + b);
            int c = x * y;
            System.out.println("Tích x * y = " + c);
            int d = x / y;
            System.out.println("Thương x / y = " + d);
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}
