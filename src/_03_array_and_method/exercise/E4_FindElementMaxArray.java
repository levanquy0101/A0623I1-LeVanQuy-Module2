package _03_array_and_method.exercise;

import java.util.Arrays;

public class E4_FindElementMaxArray {
    public static void main(String[] args) {
        float[][] arrayA = new float[3][4];
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                arrayA[i][j] = (float) (Math.random() * 100); // Tạo số thực ngẫu nhiên từ 0 đến 100
            }
        }
        float max =0;
        int x=0,y=0;
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayA[i].length; j++) {
                if(arrayA[i][j]>max){
                    max = arrayA[i][j];
                    x= i;
                    y=j;
                }
            }
        }
        System.out.println("Mảng hai chiều được tạo ngẫu nhiên: " + Arrays.deepToString(arrayA));
        System.out.println("Tọa độ x,y của giá trị lớn nhất là: "+x+" và "+y);
        System.out.println("Giá trị lớn nhất trong mảng hai chiều là: "+max);
    }
}
