package _16_io_text_file.exercise.E2;

import java.io.File;
import java.io.FileNotFoundException;

public class ReadFileCSV {
    public static void readCSV(String filePath){
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }

        }catch (Exception e){
            System.err.println("File không tồn tại hoặc bị lỗi! ");
        }


    }
    public static void main(String[] args) {

    }
}
