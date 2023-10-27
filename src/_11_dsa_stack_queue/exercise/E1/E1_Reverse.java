package _11_dsa_stack_queue.exercise.E1;

import java.util.Stack;

public class E1_Reverse {
    public static void reverse(int[] numberArray) {
        Stack<Integer> stack = new Stack<>();
        for (int i : numberArray) {
            stack.push(i);
        }
        for (int j = 0; j < numberArray.length; j++) {
            numberArray[j] = stack.pop();
        }
    }

    public static String reverse(String string) {
        Stack<String> stack = new Stack<>();
        String[] words = string.split(" ");
        for (String word : words) {
            stack.push(word);
        }
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop()).append(" ");
        }
        return reversedString.toString().trim();
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        System.out.println("Mảng số nguyên ban đầu: ");
        for (int s : array) {
            System.out.println(s);
        }
        reverse(array);
        System.out.println("Mảng số nguyên sau khi đảo ngược: ");
        for (int s : array) {
            System.out.println(s);
        }

        String str = "Xin chào mọi người";
        System.out.println("Chuỗi ban đầu: " + str);
        String reversedStr = reverse(str);
        System.out.println("Chuỗi sau khi đảo ngược: " + reversedStr);
    }
}