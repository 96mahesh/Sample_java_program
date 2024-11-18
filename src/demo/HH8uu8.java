package demo;

public class HH8uu8 {

	public static void main(String[] args) {
		String a = "HH8gj87654bbvghuu8"; // 16
		
		char ch[] = a.toCharArray();
	     int sum = 0;
		for(int i=0;i<a.length();i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				char x = ch[i];
				String y =  String.valueOf(x);
				sum = sum+Integer.parseInt(y);
			}
			
		}
		System.out.println(sum);		
	}
}
