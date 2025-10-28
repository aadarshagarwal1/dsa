import java.io.*;
import java.util.*;

public class square {
    public static void main(String[] args) throws IOException {
        // Redirect input and output to files when running locally
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");

        if (inputFile.exists()) {
            System.setIn(new FileInputStream(inputFile));
            System.setOut(new PrintStream(outputFile));
        }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
            if (a == b && b == c && c == d)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}
