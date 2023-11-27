//package CaseStudy.Phone.controller;
//
//import CaseStudy.Phone.model.PhoneModel;
//import CaseStudy.Phone.seveices.PhoneService;
//import CaseStudy.Phone.seveices.PhoneServiceImpl;
//
//import java.util.Scanner;
//
//public class PhoneController {
//    static Scanner scanner = new Scanner(System.in);
//    private static PhoneService serviceP = new PhoneServiceImpl();
//    public static void displayMenu() {
//        do {
//            System.out.println("-----------MENU PHONE------------");
//            System.out.println("1. Thêm mới điện thoại");
//            System.out.println("2. Hiển thị danh sách điện thoại");
//            System.out.println("3. Xóa điện thoại");
//            System.out.println("4. Tìm kiếm điện thoại");
//            System.out.println("Vui lòng nhập lựa chọn!");
//            int choice = Integer.parseInt(scanner.nextLine());
//            switch (choice){
//                case 1:
//            }
//        } while (true);
//    }
//
//    public static void main(String[] args) {
//        displayMenu();
//    }
//    public void addPhone(){
//        System.out.println("--------THÊM MỚI ĐIỆN THOẠI---------");
//        System.out.println("Nhập loại điện thoại");
//        System.out.println("1. Điện thoại chính hãng");
//        System.out.println("2. Điện thoại xách tay");
//        System.out.println("3. Trở về danh sách MENU PHONE");
//        int select = Integer.parseInt(scanner.nextLine());
//        switch (select){
//            case 1:
//                System.out.println("-----Thêm điện thoại chính hãng------");
////                int idPhone1 = serviceP.getID();
//                System.out.println("Nhập tên điện thoại thêm vào: ");
//                String name1 = scanner.nextLine();
//                System.out.println("Nhập giá sản phẩm: ");
//                int price1 = Integer.parseInt(scanner.nextLine());
//                System.out.println("Nhập nhà sản xuất: ");
//                String producer1 = scanner.nextLine();
//                System.out.println("Nhập thời gian bảo hành: ");
//                String warrantPeriod1 = scanner.nextLine();
//                System.out.println("Nhập mã số bảo hành: ");
//                int warrantyCode1 = Integer.parseInt(scanner.nextLine());
//                PhoneModel pM = new PhoneModel(idPhone1,name1,price1,producer1,warrantPeriod1,warrantyCode1);
//                serviceP.addNewPhone(pM);
//                break;
//            case 2:
//                System.out.println("-----Thêm điện thoại xách tay------");
//                // int idPhone1 = serviceG.getID();
//                System.out.println("Nhập tên điện thoại thêm vào: ");
//                String name2 = scanner.nextLine();
//                System.out.println("Nhập giá sản phẩm: ");
//                int price2 = Integer.parseInt(scanner.nextLine());
//                System.out.println("Nhập nhà sản xuất: ");
//                String producer2 = scanner.nextLine();
//                System.out.println("Nhập tên quốc gia: ");
//                String country2 = scanner.nextLine();
//                System.out.println("Nhập tình trạng máy: ");
//                int status2 = Integer.parseInt(scanner.nextLine());
//                break;
//            case 3:
//                break;
//        }
//    }
//}
