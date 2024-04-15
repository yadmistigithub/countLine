package Tasks7.day7;
public class CountLine {
    public static void main(String[] args) {
        // Original string with multiple lines
        String str = "The quick brown fox\njumps over the lazy dog\nAnd another line here";

        // Splitting the string into lines
        String[] lines = str.split("\n");

        // Counting the number of lines
        int lineCount = lines.length;

        // Displaying the line count
        System.out.println("Line Count: " + lineCount);
    }
}

