package _03_array_and_method.exercise;

import java.util.Arrays;

public class E5_MinArray {
    public static void main(String[] args) {
        int[] arrayA = {17,2,3,9,78,5,4};
        int min =arrayA[0];
        for(int i=0;i<arrayA.length;i++){
            if(arrayA[i]<min){
                min =arrayA[i];
            }
        }
        System.out.println("Mảng ban đầu:"+ Arrays.toString(arrayA));
        System.out.println("Giá trị nhỏ nhất trong mảng là: "+min);
    }
}
