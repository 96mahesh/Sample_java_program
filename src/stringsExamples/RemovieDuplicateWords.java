package stringsExamples;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;


public class RemovieDuplicateWords {

	public static void main(String[] args) {
		
//		Goodbye bye bye world world world
//		Sam went went to to to his business
//		Reya is is the the best player in eye eye game
//		in inthe
//		Hello hello Ab aB
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String Size");
		String name[] = new String[scan.nextInt()];
		//scan.nextLine();  
		System.out.println("Enter String value");
		
		for(int i=0;i<name.length;i++) {
			name[i] = scan.nextLine();
		}
		String b = Arrays.toString(name);
		String a[] = b.split(" ");
		System.out.println("=============");
		
		String uni[] = new String[a.length];
		int u = 0;
		
		for(int i=0;i<a.length;i++) {
			if(u==0) {
				uni[u++]=a[i];
			}
			else {
				int find = 0;
				for(int k=0;k<u;k++) 
					if(uni[k].equals(a[i])) 
						find++;
				if(find==0) {
					uni[u++]=a[i];
				}
			}
		}
		for(int i=0;i<u;i++) {
			System.out.print(uni[i]+" ");
		}
		
	}
}


class removie{
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String Value");
		String line = scan.nextLine();
		String a[] = line.split(" ");
		System.out.println(Arrays.toString(a));

		String uni[] = new String[a.length];
		int u = 0;
		for(int i=0;i<a.length;i++) {
			if(u == 0) {
				uni[u++] = a[i];
			}
			else {
				int find = 0;
				for(int j=0;j<u;j++)
					if(uni[j].equals(a[i]))
						find++;
					if(find == 0) {
						uni[u++] = a[i];
					}
			}
		}
		for(int i=0;i<u;i++) {
			System.out.print(uni[i]+" ");
		}
		removie.main(args);
	}
}


