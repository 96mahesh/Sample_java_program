package ArraysExample;

import java.util.Arrays;

public class SecoundWayMergArray {

	public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        int length = array1.length + array2.length;
        int[] result = new int[length];
		int p=0;
        
        for (int element : array1) {
            result[p++] = element;
        }

        for (int element : array2) {
            result[p++] = element;
        }

        System.out.println(Arrays.toString(result));
        
        StringArrayMerge.main();
    }

}

class StringArrayMerge{
	public static void main() {
		
		String a[] = {"chai","coffe"} ; 
		String b[] = {"milk","water","cock"};
		
		int x = a.length+b.length;
		
		String[] res = new String[x];
		int p =0;
		for (String ele : a) {
			res[p++] = ele;	
		}
		for (String ele : b) {
			res[p++] = ele;	
		}
		
		 System.out.println(Arrays.toString(res));
		 for (String y : res) {
			System.out.println(y);
		}
	}
}
