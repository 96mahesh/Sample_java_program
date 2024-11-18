package demo;

public class Dictionary_Order {

	public static void main(String[] args) {
		
		String name = "welcometojava"; //ava wel 
		String min = name.substring(0,3);
		System.out.println(min);
		String max = name.substring(0,3);
		System.out.println(max);
		for(int i=0;i<name.length()-3+1;i++) {
				String sub = name.substring(i,i+3);
				//System.out.println(sub);
				
				if(sub.compareTo(min)>0) {
					min=sub;
				}
				if(sub.compareTo(min)<0) {
					min=sub;
				}
			}
		System.out.println(min+" "+max);
		}

	}

