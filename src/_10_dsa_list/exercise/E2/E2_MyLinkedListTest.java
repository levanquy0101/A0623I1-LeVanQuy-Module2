package _10_dsa_list.exercise.E2;

public class E2_MyLinkedListTest {
    public static void main(String[] args) {
        E2_MyLinkedList<Integer> list = new E2_MyLinkedList<>();

        // Thêm phần tử vào danh sách
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Danh sách sau khi thêm phần tử: \n" + list);

        // Xóa phần tử khỏi danh sách
        list.remove(1);
        System.out.println("Danh sách sau khi xóa phần tử: \n" + list);

        // Truy cập phần tử trong danh sách
        System.out.println("Phần tử thứ 2 trong danh sách: " + list.get(0));

        // Kiểm tra kích thước danh sách
        System.out.println("Kích thước danh sách: " + list.size());
    }
}
