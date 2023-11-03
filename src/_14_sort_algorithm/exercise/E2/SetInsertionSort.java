package _14_sort_algorithm.exercise.E2;

import java.util.Arrays;

public class SetInsertionSort {
    public static void SortNumber(int[] array){
        System.out.println("Mảng số nguyên ban đầu chưa được sắp xếp: "+Arrays.toString(array));
        int pos, x;
        for(int i = 1; i < array.length; i++){
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
        for(Integer num: array){
            System.out.print(num+", ");
        }
        //System.out.println("Mảng sau khi được sắp xếp: "+Arrays.toString(array));
    }
    public static void main(String[] args) {
        int[] numbers = {2,5,9,1,90,34,78,45,46,89,23,21,67};
        SortNumber(numbers);
    }
}
