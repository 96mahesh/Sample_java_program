package demo;

public class StringOddEven {

	public static void main(String[] args) {
		
		String name = "i am mahesh i am from automatioz";//THIS si A  tset STRING!!
		String a[] = name.split(" ");
		String inputvalue = "";
		for(int i=0;i<a.length;i++) {
			String word = a[i];
			if(i%2==0) {
				inputvalue+= word.toUpperCase()+" ";
			}
			else {
//					StringBuffer sb = new StringBuffer(word);
//					word=String.valueOf(sb.reverse());
//					System.out.println(word);
				
				for(int j=word.length()-1; j>=0; j--)
				{
					char ch= word.charAt(j);
					inputvalue = inputvalue+ch;
				}
				inputvalue += " ";
								
			}
		}
		System.out.println(inputvalue);
	}
}
