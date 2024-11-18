package demo;

public class PattrenRecursive {

	public static void printTriangle(int n) {
        printLine(n, 1);
    }

    // Recursive method to print each line
    private static void printLine(int totalLines, int currentLine) {
        if (currentLine > totalLines) {
            return;
        }
        printStars(currentLine); // Print stars for the current line
        System.out.println(); // Move to the next line
        printLine(totalLines, currentLine + 1); // Recursive call for the next line
    }

    // Recursive method to print stars in a line
    private static void printStars(int numberOfStars) {
        if (numberOfStars == 0) {
            return;
        }
        System.out.print("* ");
        printStars(numberOfStars - 1); // Recursive call for the next star
    }

    public static void main(String[] args) {
        int n = 7; // Number of lines
        printTriangle(n);
    }

}
