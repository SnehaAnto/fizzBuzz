package org.example;

/**
 * Hello world!
 *
 */
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    public static String fizzBuzz(int num) {

        if (num == 1 || num == 2) {
            return String.valueOf(num);
        }
        if (num % 3 == 0) {
            return "Fizz";
        }
        if (num % 5 == 0) {
            return "Buzz";
        }
        return "FizzBuzz";
    }
}
