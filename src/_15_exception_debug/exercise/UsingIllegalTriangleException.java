package _15_exception_debug.exercise;
import java.util.Scanner;

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String s) {
        super(s);
    }
}

public class UsingIllegalTriangleException{

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập cạnh thứ nhất: ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập cạnh thứ hai: ");
            int b = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập cạnh thứ ba: ");
            int c = Integer.parseInt(scanner.nextLine());
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalTriangleException("Cạnh không được âm");
            }
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalTriangleException("Không phải tam giác");
            }
            System.out.println("Đây là tam giác hợp lệ");

        }catch (NumberFormatException ex){
            System.out.println("Lỗi định dạng số");
        }
        catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }
}