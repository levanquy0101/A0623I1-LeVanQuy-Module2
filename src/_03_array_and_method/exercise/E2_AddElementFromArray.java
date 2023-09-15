package _03_array_and_method.exercise;
import java.util.Arrays;
import java.util.Scanner;

public class E2_AddElementFromArray {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 7, 8, 2, 0, 0, 0, 0};
        System.out.println("Mảng ban đầu: " + Arrays.toString(array));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần thêm: ");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí cần thêm vào mảng: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < array.length) {
            for (int j = array.length - 1; j > index; j--) {
                array[j] = array[j - 1];
            }
            array[index] = x;
            System.out.println("Mảng sau khi thêm: " + Arrays.toString(array));
        } else {
            System.out.println("Vị trí không hợp lệ. Không thể thêm phần tử vào mảng.");
        }
    }
}
