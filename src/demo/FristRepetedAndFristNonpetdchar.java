package demo;

public class FristRepetedAndFristNonpetdchar {

	public static void main(String[] args) {

		String name = "python is super";
		char a[] = name.toCharArray();

		char fristrept = ' ';
		char fristnonrept = ' ';
		for (int i = 0; i < a.length; i++) {
			char temp = a[i];
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (fristrept == ' ')
						fristrept = temp;
					else {
					 if (fristnonrept == ' ')
						fristnonrept = temp;
				}
				}
			}
		}

		System.out.println(fristnonrept);
		System.out.println(fristrept);
		repetedchar.main();
		fristRepetedAndNonRepetedChar.repeted();

	}
}

class repetedchar {

	public static void main() {
		String name = "java is super";
		char a[] = name.toCharArray();

		char fristrept = ' ';
		char fristnonrept = ' ';
		for (int i = 0; i < a.length; i++) {
			char temp = a[i];
			if (temp != ' ') {
				for (int j = 0; j < a.length; j++) {
					if (a[i] == a[j]) {
						if (fristrept == ' ')
							fristrept = temp;
						else if (fristnonrept == ' ')
							fristnonrept = temp;
							break;
					}
				}
			}
		}

		System.out.println(fristnonrept);
		System.out.println(fristrept);
	}
}

class fristRepetedAndNonRepetedChar {

	public static void repeted() {
		String name = "python is super";
        //System.out.println(name.length());
		char fristrepeteschar = ' ';
		char fristnonrepetdchar = ' ';

		for (int i = 0; i < name.length(); i++) {
			char temp = name.charAt(i);
			if (temp != ' ') {
				if (name.indexOf(temp) == name.indexOf(temp)) {
					if (fristnonrepetdchar == ' ')
						fristnonrepetdchar = temp;

					else if (fristrepeteschar == ' ')
						fristrepeteschar = temp;

					if (fristrepeteschar != ' ' && fristnonrepetdchar != ' ')
						break;
				}
			}
		}

		System.out.println(fristrepeteschar);
		System.out.println(fristnonrepetdchar);
		// assignment.main();
	}
}


class fristRepetedAndNonRepetedC {

	public static void repeted() {
		String name = "python is super";
        //System.out.println(name.length());
		char fristrepeteschar = ' ';
		char fristnonrepetdchar = ' ';

		for (int i = 0; i < name.length(); i++) {
			char temp = name.charAt(i);
			if (temp != ' ') {
				if (name.indexOf(temp) == name.indexOf(temp)) {
					if (fristnonrepetdchar == ' ')
						fristnonrepetdchar = temp;

					else if (fristrepeteschar == ' ')
						fristrepeteschar = temp;

					if (fristrepeteschar != ' ' && fristnonrepetdchar != ' ')
						break;
				}
			}
		}

		System.out.println(fristrepeteschar);
		System.out.println(fristnonrepetdchar);
		// assignment.main();
	}
}

