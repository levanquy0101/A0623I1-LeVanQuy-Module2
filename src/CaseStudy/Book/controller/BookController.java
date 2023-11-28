package CaseStudy.Book.controller;

import java.util.Scanner;

public class BookController {
    public static void main(String[] args) {

    }
    public void displayMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----------------MENU BOOK-----------------");
        System.out.println("1. Hiển thị danh sách");
        System.out.println("2. Thêm mới sách");
        System.out.println(".3 Xóa sách ra khỏi danh sách");
        System.out.println("4. Tìm kiếm theo tên sách");

    }
}
