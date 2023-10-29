package _11_dsa_stack_queue.exercise.E2;

import java.util.Arrays;
import java.util.Objects;
import java.util.TreeMap;

public class E2_CountWord {
    public static void main(String[] args) {
        String str = "Xin Chao Cac Ban";
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        String[] arrStr = str.toLowerCase().split("");

        for (String string : arrStr) {
            int count = 0;
            for (String s : arrStr) {
                if (Objects.equals(string, s)) {
                    count++;
                }
            }
            treeMap.put(string, count);
        }
        System.out.println(Arrays.toString(arrStr));
        for (String a: treeMap.keySet()){
            System.out.println(a+":"+treeMap.get(a));
        }
    }
}
