package _03_array_and_method.exercise;
import java.util.Scanner;
public class E7S_DiagonalTotalCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước ma trận vuông (n): ");
        int n = scanner.nextInt();

        double[][] matrix = new double[n][n];
        // Nhập giá trị cho ma trận
        System.out.println("Nhập các giá trị cho ma trận vuông:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhập giá trị tại vị trí [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Tính tổng của các số trên đường chéo chính
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Tổng của các số trên đường chéo chính là: " + sum);
    }
}
