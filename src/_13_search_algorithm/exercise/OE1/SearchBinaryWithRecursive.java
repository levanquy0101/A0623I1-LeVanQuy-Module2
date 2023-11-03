package _13_search_algorithm.exercise.OE1;

import java.util.Arrays;

public class SearchBinaryWithRecursive {
    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left <= right) {
            int middle = left + (right - left) / 2;
            if (array[middle] == value) {
                return middle;
            } else if (value > array[middle]) {
                return binarySearch(array, middle + 1, right, value);
            } else {
                return binarySearch(array, left, middle - 1, value);
            }
        }
        return -1; // Giá trị không tồn tại trong mảng
    }

    public static void main(String[] args) {
        int[] number = {40, 24, 57, 95, 12, 39, 67, 32, 34};
        Arrays.sort(number);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(number));
        int test = binarySearch(number, 0, number.length - 1, 132);
        if (test >= 0) {
            System.out.println("Đã tìm thấy, nó ở vị trí index: " + test);
        } else {
            System.out.println("Giá trị không tồn tại trong mảng!");
        }
    }
}
