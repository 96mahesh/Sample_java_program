package stringsExamples;

public class FristRepetedNumberAndFristNonRepeted {

	public static void main(String[] args) {
		
		String name = "java is easy";
		
		char fristrepeteschar = ' ';
		char fristnonrepetdchar = ' ';
		
		for(int i=0;i<name.length();i++) {
			char temp = name.charAt(i);
			
				if(name.indexOf(temp) == name.indexOf(temp)) {
					if(fristnonrepetdchar == ' ') 
						fristnonrepetdchar = temp;
					
					else if(fristrepeteschar == ' ') 
						fristrepeteschar = temp;	
				
				if(fristrepeteschar!=' ' && fristnonrepetdchar!=' ')
					break;
				}
			
			}
		
		System.out.println(fristrepeteschar);
		System.out.println(fristnonrepetdchar);
		assignment.main();	
		}
		
	}

class assignment {
	
	public static void main() {
		
		String name = "java is easy";
		char a[] = name.toCharArray();
		
		char reptchar = ' ';
		char nonreptchar = ' ';
		
		for(int i=0;i<a.length;i++) {
			char temp = a[i];
			if(temp!=' ') {
				for(int j=0;j<a.length;j++) {
					if(a[i]==a[j]) {
						if(reptchar==' ')
							reptchar = temp;
						else if(nonreptchar==' ')
							nonreptchar = temp;
						
						if(reptchar!=' '&&nonreptchar!=' ')
							break;
					}
				}
			}
			
		}
		System.out.println(reptchar);
		System.out.println(nonreptchar);
	}
	
}

