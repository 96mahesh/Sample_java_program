package ArraysExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Consecutive_number {
	public static void main(String[] args) {
        int testList[] = {2, 6, 6, 6, 6, 5, 4, 6, 6, 8, 4, 6, 6, 6, 2, 6};
        System.out.println(Arrays.toString(testList));
        int K = 6;
        int N = 3;

        
        List<int[]> res = new ArrayList<>();
        int a = 0, end = 0;
        int prev = 1;

        for (int idx = 0; idx < testList.length; idx++) {
            int ele = testList[idx];
            if (ele == K) {
                end = idx;
                if (prev != K) {
                    a = idx;
                }
            } else {
                if (prev == K && end - a + 1 >= N) {
                    res.add(new int[]{a, end});
                }
            }
            prev = ele;
        }

     
        for (int[] range : res) {
            System.out.print(Arrays.toString(range) + " ");
        }
	}
}
