package _10_dsa_list.exercise.E1;

import _10_dsa_list.exercise.E1.E1_MyList;

public class E1_MyListTest {
    public static void main(String[] args) {
        E1_MyList<Integer> myList = new E1_MyList<>();

        // Thêm các phần tử vào danh sách
        myList.add(0, 10);
        myList.add(1, 20);
        myList.add(2, 30);
        myList.add(3, 40);

        // In ra số lượng phần tử trong danh sách
        System.out.println("Size: " + myList.size());

        // In ra danh sách các phần tử
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at index " + i + ": " + myList.get(i));
        }

        // Kiểm tra xem danh sách có chứa phần tử 30 hay không
        System.out.println("Contains 30: " + myList.contains(30));

        // Lấy vị trí đầu tiên của phần tử 30 trong danh sách
        System.out.println("Index of 30: " + myList.indexOf(30));

        // Xóa phần tử tại vị trí 1
        myList.remove(1);

        // In ra danh sách sau khi xóa
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at index " + i + ": " + myList.get(i));
        }

        // Xóa tất cả các phần tử trong danh sách
        myList.clear();

        // In ra số lượng phần tử sau khi xóa
        System.out.println("Size after clear: " + myList.size());
    }
}
