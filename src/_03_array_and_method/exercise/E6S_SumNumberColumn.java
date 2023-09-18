package _03_array_and_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E6S_SumNumberColumn {
    public static void main(String[] args) {
        float[][] ArrayA = new float[3][4];
        float Sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ArrayA.length; i++) {
            for (int j = 0; j < ArrayA[i].length; j++) {
                ArrayA[i][j] = (float) (Math.random() * 100);
            }
        }

        System.out.println("Mảng hai chiều: " + Arrays.deepToString(ArrayA) + "\nMảng có 4 cột từ 0->3");

        int n;
        do {
            System.out.println("Nhập n là số thứ tự của một cột (từ 0 đến 3): ");
            n = scanner.nextInt();
            if (n < 0 || n >= ArrayA[0].length) {
                System.out.println("Số cột không hợp lệ, vui lòng nhập lại.");
            }
        } while (n < 0 || n >= ArrayA[0].length);

        for (int i = 0; i < ArrayA.length; i++) {
            Sum = Sum + ArrayA[i][n];
        }
        System.out.println("Tổng các số ở cột " + n + " là: " + Sum);
    }
}
