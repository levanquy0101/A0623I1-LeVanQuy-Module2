package _13_search_algorithm.exercise.OE2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class StringSequenceMaxLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần kiểm tra: ");// Nhập thử mảng chuỗi: abcabcdgabmnsxy
        String input = scanner.nextLine();
        char[] charsArray = input.toCharArray();
        System.out.println("Mảng ký tự ban đầu: " + Arrays.toString(charsArray));
        LinkedList<Character> characterLinkedList = new LinkedList<>();
        characterLinkedList.add(charsArray[0]);
        LinkedList<Character> longestSequence = new LinkedList<>();
        longestSequence.add(charsArray[0]);
        for (int i = 1; i < charsArray.length; i++) {
            if (charsArray[i] >= characterLinkedList.getLast()) {
                characterLinkedList.add(charsArray[i]);
            } else {
                if (characterLinkedList.size() > longestSequence.size()) {
                    longestSequence.clear();
                    longestSequence.addAll(characterLinkedList);
                }
                characterLinkedList.clear();
                characterLinkedList.add(charsArray[i]);
            }
        }
        if (characterLinkedList.size() > longestSequence.size()) {
            longestSequence.clear();
            longestSequence.addAll(characterLinkedList);
        }
        System.out.println("Mảng chuỗi con liên tiếp dài nhất: " + longestSequence);
        for (Character ch: longestSequence) {
            System.out.print(ch);
        }
        System.out.println();
        System.out.println("Kích thước chuỗi con liên tiếp dài nhất: " + longestSequence.size());
    }
}
