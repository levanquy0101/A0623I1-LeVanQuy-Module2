package _03_array_and_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class E3_MergeArrays {
    public static void main(String[] args) {
        Scanner element = new Scanner(System.in);
        int[] arrayA = new int[4];
        int[] arrayB =new int[7];
        for(int i=0;i<arrayA.length;i++){
            System.out.println("Nhập giá trị lần lượt của mảng A: ");
            arrayA[i]= element.nextInt();
        }
        for(int j=0;j<arrayB.length;j++){
            System.out.println("Nhập giá trị lần lượt của mảng B: ");
            arrayB[j]= element.nextInt();
        }
        System.out.println("Mảng A ban đầu: " + Arrays.toString(arrayA));
        System.out.println("Mảng B ban đầu: " + Arrays.toString(arrayB));
        int[] arrayC =new int[arrayA.length+arrayB.length];
        for(int z=0;z<arrayC.length;z++){
        if(z<arrayA.length) {
            arrayC[z]=arrayA[z];
        }
        else {
            arrayC[z]=arrayB[z-arrayA.length];
        }
        }
        System.out.println("Mảng C khi gộp từ mảng A và B: " + Arrays.toString(arrayC));
    }
}
