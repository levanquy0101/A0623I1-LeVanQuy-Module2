package _17_BinaryFile_Serialization.exercise.OE2;

import java.io.*;

public class CopyBinary {
    public static void main(String[] args) {
        String sourceFile = "D:\\Codegym\\A0623I1-LeVanQuy-Module2\\src\\_17_BinaryFile_Serialization\\exercise\\OE2\\File1.txt";
        String targetFile = "D:\\Codegym\\A0623I1-LeVanQuy-Module2\\src\\_17_BinaryFile_Serialization\\exercise\\OE2\\File2.txt";

        try {
            File file = new File(sourceFile);
            if (!file.exists()) {
                System.out.println("File nguồn không tồn tại.");
                return;
            }

            File target = new File(targetFile);
            if (!target.exists()) {
                System.out.println("File đích đã tồn tại.");
                return;
            }

            InputStream inputStream = new FileInputStream(file);
            OutputStream outputStream = new FileOutputStream(target);

            byte[] buffer = new byte[1024];
            int length;
            int totalBytes = 0;

            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
                totalBytes += length;
            }

            inputStream.close();
            outputStream.close();

            System.out.println("Sao chép thành công. Số byte trong tệp: " + totalBytes);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}