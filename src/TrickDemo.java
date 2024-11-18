public class TrickDemo {

	public static void main(String[] args) {
		String name = "india   is     my   cuntry";
		int sc = 0;
		char a[] = name.toCharArray();
		for(int k=0;k<a.length;k++) {
			if(Character.isSpace(a[k])) {
				sc++;
			}
		}
		String word="";
		String ch[]=new String[sc+1];
		int j=0;
		String res = "";
		for(int i=0;i<a.length;i++) {
			if(a[i]>='a' && a[i]<='z') {
				res = res+a[i];
			}
			else {
				if(a[i-1]>='a' && a[i-1]<='z')
				res = res+" ";
			}
		}
		System.out.println(res);
		
		char c[] = res.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]==' ') {
				ch[j++]=word;
			    word="";
			}
			else {
				word+= c[i];
			}ch[j++] = word;
		}
	}

}

//for(int i=0;i<ch.length;i++) {
//	if(ch[i]==' ') {
//		a[j++]=word;
//		word="";
//	}else {
//		word+= ch[i];
//	}
//}a[j++]=word;
//System.out.println(Arrays.toString(a));
