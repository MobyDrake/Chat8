package SolutionLesson6;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int[] mass = new int[]{ 1, 2, 4, 4, 2, 3, 4, 1, 7 };
        int[] m = massFor4(mass);
        System.out.println(Arrays.toString(m));
    }

    public static int[] massFor4(int[] mass) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : mass) {
            list.add(i);
        }
        if (list.contains(4)) {
            int number = Collections.frequency(list, 4);
            list.clear();
            for (int n : mass) {
                if (number > 0) {
                    if (n == 4) {
                        number--;
                    }
                } else {
                    list.add(n);
                }
            }

            int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }

            return result;
        } else {
            throw new RuntimeException();
        }
    }

}
