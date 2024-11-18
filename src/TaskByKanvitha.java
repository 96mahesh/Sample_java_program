import java.util.Arrays;

public class TaskByKanvitha {

	public static void main(String[] args) {
		String s="India is my country";
		char ch[]=s.toCharArray();
		int sc=0;
		for(int k=0;k<ch.length;k++) {
			if(Character.isSpace(ch[k])) {
				sc++;
			}
		}
		String word="";
		String a[]=new String[sc+1];
		int j=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				a[j++]=word;
				word="";
			}else {
				word+= ch[i];
			}
		}a[j++]=word;
		System.out.println(Arrays.toString(a));
	}
}
