package _13_search_algorithm.practice;

import java.util.Arrays;

public class SelectionSort {
    public static void SelectionSort(int[] arr){
        int count =1;
        for (int i = 0;i<arr.length;i++) {
            int min = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                    System.out.println("Mảng sắp xếp lần : "+count+Arrays.toString(arr));
                    count++;
                }
            }

        }
    }
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        SelectionSort(list);
        System.out.println(Arrays.toString(list));
    }
}
