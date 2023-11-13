package _16_io_text_file.practice.P2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MaxValue {
    public void readFile(String namefile) {
        try {
            File newfile = new File(namefile);
            Scanner scanner = new Scanner(newfile);
            int maxValue = Integer.MIN_VALUE;

            while (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value > maxValue) {
                    maxValue = value;
                }
            }

            scanner.close();

            System.out.println("Giá trị lớn nhất trong tệp tin là: " + maxValue);
            writeFile(namefile, maxValue);
        } catch (Exception e) {
            System.out.println("File không tồn tại hoặc có vấn đề");
        }
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("\nGiá trị lớn nhất là: " + max);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file của bạn: ");
        String dc = sc.nextLine();
        MaxValue test = new MaxValue();
        test.readFile(dc);
    }
}