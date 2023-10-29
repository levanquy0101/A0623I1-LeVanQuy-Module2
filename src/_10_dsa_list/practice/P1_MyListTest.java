package _10_dsa_list.practice;

public class P1_MyListTest {
    public static void main(String[] args) {
        P1_MyList<Integer> listInteger = new P1_MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
    }
}
