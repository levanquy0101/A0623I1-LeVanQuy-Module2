package Test;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            // Nhập tên tệp nguồn và tệp đích từ người dùng
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Nhập đường dẫn tệp nguồn: ");
            String sourceFilePath = userInput.readLine();

            System.out.print("Nhập đường dẫn tệp đích: ");
            String targetFilePath = userInput.readLine();

            // Kiểm tra xem tệp nguồn có tồn tại không
            File sourceFile = new File(sourceFilePath);
            if (!sourceFile.exists()) {
                System.out.println("Tệp nguồn không tồn tại.");
                return;
            }

            // Kiểm tra xem tệp đích đã tồn tại chưa
            File targetFile = new File(targetFilePath);
//            if (!targetFile.exists()) {
//                System.out.println("Tệp đích đã tồn tại. Hãy chọn một tên tệp đích khác.");
//                return;
//            }

            // Tạo luồng đọc từ tệp nguồn
            reader = new BufferedReader(new FileReader(sourceFile));

            // Tạo luồng ghi đến tệp đích
            writer = new BufferedWriter(new FileWriter(targetFile));

            int character;
            int characterCount = 0;

            // Đọc từng ký tự từ tệp nguồn và ghi vào tệp đích
            while ((character = reader.read()) != -1) {
                writer.write(character);
                characterCount++;
            }

            System.out.println("Sao chép thành công. Số ký tự trong tệp: " + characterCount);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
