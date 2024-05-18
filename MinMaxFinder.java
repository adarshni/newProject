import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Find minimum and maximum
            int min = Math.min(x, y);
            int max = Math.max(x, y);

            // Output the results
            System.out.println(min + " " + max);
        }

        scanner.close();
    }
} 
