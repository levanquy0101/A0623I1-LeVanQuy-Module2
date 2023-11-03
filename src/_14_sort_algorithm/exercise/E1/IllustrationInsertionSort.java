package _14_sort_algorithm.exercise.E1;

import java.util.Arrays;

public class IllustrationInsertionSort {
    public static void SortNumber(int[] arr){
        for(int i = 1;i<arr.length;i++){
           int key = arr[i];
           int j = i-1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
            System.out.println(Arrays.toString(arr));
        }

    }
    public static void display(){

    }
    public static void main(String[] args) {
        int[] numbers = {2,5,9,1,90,34,78,45,46,89,23,21,67};
        SortNumber(numbers);
    }
}
