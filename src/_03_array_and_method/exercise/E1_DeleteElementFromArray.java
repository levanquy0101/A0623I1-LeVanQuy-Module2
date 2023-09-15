package _03_array_and_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E1_DeleteElementFromArray {
    public static void main(String[] args) {
        int[] Array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Mảng ban đầu: " + Arrays.toString(Array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa: ");
        int X = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == X) {
                index = i;
            }
        }
        if (index >= 0) {
            for (int j = index; j < Array.length - 1; j++) {
                Array[j] = Array[j + 1];
            }
            System.out.println("Mảng sau khi xóa: " + Arrays.toString(Array));
        }else {
            System.out.println("Không tìm thấy giá trị phù hợp cần xóa trong mảng");
        }
    }
}
