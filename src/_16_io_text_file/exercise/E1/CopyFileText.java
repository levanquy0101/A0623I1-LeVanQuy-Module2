package _16_io_text_file.exercise.E1;

import java.io.*;

public class CopyFileText {
    public static void copyFile(String sourcePath, String destinationPath) {
        try {
            File sourceFile = new File(sourcePath);
            if (!sourceFile.exists()) {
                throw new FileNotFoundException("File nguồn không tồn tại.");
            }

            BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationPath));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();
            System.out.println("Sao chép file thành công.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String sourcePath = "src/_16_io_text_file/exercise/E1/fileone.txt";
        String destinationPath = "src/_16_io_text_file/exercise/E1/filetwo.txt";
        copyFile(sourcePath, destinationPath);
    }
}