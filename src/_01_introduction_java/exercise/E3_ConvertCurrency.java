package _01_introduction_java.exercise;
import java.util.Scanner;
public class E3_ConvertCurrency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD:");
        float usd = sc.nextFloat();
        System.out.print("Số tiền USD sang VND là: "+ usd*23000+"VND");
    }
}
