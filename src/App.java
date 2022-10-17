import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class App {
    public static void main(String args[]) {
        System.out.println("Enter the number of temperatures to analyze");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse

        int output = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a temparature to analyze");

            int temperature = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526

            // Initialize output with the first input when n is more than 0
            if (i == 0) {
                output = temperature;
            }

            if (Math.abs(output) == Math.abs(temperature)) {
                output = Math.max(output, temperature);
            } else if (Math.abs(output) > Math.abs(temperature)) {
                output = temperature;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.out.println(output);
    }
}