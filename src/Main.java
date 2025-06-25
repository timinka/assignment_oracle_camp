/**
 * @brief Assignment for Oracle Summer Camp 2025.
 *
 * Assignment: Write a program in Java/JavaScript that  prints out the numbers 0 to 100 (without boundaries).
 *  - If the number is even, print "Baz" instead of the number.
 *  - If it's divisible by 5,  print "inga!".
 *  - If both conditions are met, write both strings concatenated.
 */

public class Main {
    /**
     * @brief Print numbers separated by commas.
     */
    public void print_in_line(int begin, int end) {
        for (int num = begin; num < end; num++) {
            boolean printed = false;

            if(num % 2 == 0) {
                printed = true;
                System.out.print("Baz");
            }
            if(num % 5 == 0) {
                printed = true;
                System.out.print("inga!");
            }
            if(!printed) {
                System.out.print(num);
            }

            if(num != end - 1) {
                System.out.print(", ");
            }
        }
    }

    /**
     * @brief Print each number on one line.
     */
    public void print_numbers(int begin, int end) {
        for(int num = begin; num < end; num++) {
            if(num % 2 == 0 && num % 5 == 0) {
                System.out.println("Bazinga!");
            } else if(num % 2 == 0) {
                System.out.println("Baz");
            } else if(num % 5 == 0) {
                System.out.println("inga!");
            } else {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        Main printer = new Main();
        printer.print_numbers(1, 100);
    }
}