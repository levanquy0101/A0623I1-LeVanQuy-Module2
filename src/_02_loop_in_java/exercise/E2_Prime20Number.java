package _02_loop_in_java.exercise;
import java.util.Scanner;

public class E2_Prime20Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập N số nguyên tố cần in ra: ");
        int n = scanner.nextInt();
        int count = 0;
        int num = 0;
        while (count<n){
            if(CheckPrime(num)){
                System.out.print(num+"\t");
                count++;
            }
            num++;
        }
    }

    public static boolean CheckPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}

