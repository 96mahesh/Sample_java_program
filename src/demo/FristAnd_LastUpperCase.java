package demo;

public class FristAnd_LastUpperCase {

	public static void main(String[] args) {
		
		//input = mahesh babu rampatruni
		//output = MahesH BabU RampatrunI
		String name = "power star pawan kalyan";
		String a[] = name.split(" ");
		String n =" ";		
		for (String x : a) {
			//System.out.println(x);
			String frist = x.substring(0, 1);
			String secound = x.substring(1, x.length()-1);
			String throad  = x.substring(x.length()-1);
			n+=frist.toUpperCase()+secound+throad.toUpperCase()+" ";	
		}
		System.out.print(n);
			}
	}

