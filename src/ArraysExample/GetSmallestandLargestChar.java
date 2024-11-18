package ArraysExample;

public class GetSmallestandLargestChar {

	//input = welcometojava  3  //output ava wel
	public static void main(String[] args) {
		
	String s = "welcometojava";
	int k = 3;
	String min = s.substring(0, k);
	String max = s.substring(0, k);
	for(int i=0;i<s.length()-k+1;i++) {
		String sub = s.substring(i,i+k);
		if(sub.compareTo(min)<0)
			min = sub;
		if(sub.compareTo(max)>0)
			max = sub;
	}
	System.out.println(min+" "+max);
	}
}
