package _13_search_algorithm.practice;

import java.util.Arrays;

public class BubbleSort {

    public static void BubbleSort(int[] arr){
        for (int k = 1;k<arr.length;k++){
            for(int i =0;i<arr.length-k;i++){
                if(arr[i]>arr[i+1]){
                int c = 0;
                arr[c] = arr[i];
                arr[i]=arr[i+1];
                arr[i+1] = arr[c];

            }
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
        BubbleSort(list);
        System.out.println(Arrays.toString(list));
    }
}
