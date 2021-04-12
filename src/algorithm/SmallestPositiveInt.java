package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestPositiveInt {

    public  static int getSmallestPositiveInt(int[] A) {
        List<Integer> listOfNums = Arrays.stream(A).boxed()
                .collect(Collectors.toCollection(ArrayList:: new));

        int smallestPositiveNum = 0;
        for (int i = 1; i <= 1_000_000; i++) {

            if (listOfNums.contains(i)) {
                continue;
            }
            smallestPositiveNum = i;
            break;
        }

        return smallestPositiveNum;
    }

    public static void main(String[] args) {

        int[] sample1 = {1,5,7,4,1,2};
        int[] sample2 = {1,2,3};
        int[] sample3 = {-1, -3};
        System.out.println(getSmallestPositiveInt(sample1));
    }
}
