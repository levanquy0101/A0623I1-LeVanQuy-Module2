package _13_search_algorithm.exercise.E1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class FindStringLengthMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter to string: ");
        String input = scanner.nextLine();
        char[] charArray = input.toCharArray();
        LinkedList<Character> list = new LinkedList<>();
        list.add(charArray[0]);
        for(int i = 1;i<charArray.length;i++){
            if(charArray[i]>list.getLast()){
                    list.add(charArray[i]);
                }
        }

        System.out.println(Arrays.toString(charArray));
        for(Character s : list){
            System.out.print(s);
        }

    }
}
