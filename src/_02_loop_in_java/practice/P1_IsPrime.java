package _02_loop_in_java.practice;
import java.util.Scanner;

public class P1_IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int number = scanner.nextInt();
        boolean isPrime = isPrime(number);
        System.out.println("Kết quả kiểm tra số nguyên tố: " + isPrime);
    }

    public static boolean isPrime(int number) {
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
