package idk;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MathMagic {

    public static void play() {
        char input;
        boolean isRunning = true;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Welcome to the Math Magic Trick Program...");
            System.out.println("Think of a number from 1 to 30, then I am going to show you random sets of numbers.");
            System.out.println("Please tell me if your number is within the set I provide.");
            System.out.print("Please enter any alphanumeric character to proceed...");
            input = scanner.next().charAt(0);

            if (Character.isLetterOrDigit(input)) {
                System.out.println("\nI am going to show you random sets of numbers, please tell me if your number is within the set I provide.");

                generateRandomNumbers();
                int number = getUsersNumber();

                if (number == 0) {
                    System.out.println("You are trying to fool me.");
                } else {
                    System.out.println("Okay. Let me guess, your number is " + number + ".");
                }

                System.out.print("Do you want to try again? Enter 'Y' or 'N': ");
                input = scanner.next().charAt(0);
                isRunning = (input == 'Y' || input == 'y');
            } else {
                System.out.println("You have entered an invalid input.");
            }
        } while (isRunning);
    }

    public static final int SET_COUNT = 15;
    public static int[][] numberSet = {
            // Set A
            {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29},
            // Set B
            {2, 3, 6, 7, 10, 11, 14, 15, 18, 19, 22, 23, 26, 27, 30},
            // Set C
            {4, 5, 6, 7, 12, 13, 14, 15, 20, 21, 22, 23, 28, 29, 30},
            // Set D
            {8, 9, 10, 11, 12, 13, 14, 15, 24, 25, 26, 27, 28, 29, 30},
            // Set E
            {16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30}
    };

    public static int[] arrangement = new int[5];

    public static boolean isWithinSet(int[] set, int number) {
        for (int j : set) {
            if (j == number) {
                return true;
            }
        }
        return false;
    }

    public static void generateRandomNumbers() {
        int count = 0;
        Arrays.fill(arrangement, 0);

        Random random = new Random();
        while (count < 5) {
            int randomNumber = 1 + random.nextInt(5);
            if (isWithinSet(arrangement, randomNumber)) {
                continue;
            }
            arrangement[count] = randomNumber;
            count++;
        }
    }

    public static boolean isNumberInSet(int setIndex) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        for (int i = 0; i < SET_COUNT; i++) {
            System.out.print(numberSet[setIndex][i]);

            if (i == SET_COUNT - 1) {
                continue;
            }

            System.out.print(", ");

            if ((i + 1) % 3 == 0) {
                System.out.println();
            }
        }

        System.out.print("\nIs your number within this set of numbers? Enter 'Y' or 'N': ");
        choice = scanner.next().charAt(0);

        return (choice == 'Y' || choice == 'y');
    }

    public static int getUsersNumber() {
        int total = 0;
        int count = 0;
        char[] sets = {'A', 'B', 'C', 'D', 'E'};

        for (int n : arrangement) {
            System.out.println("Set " + sets[count++]);

            if (isNumberInSet(n - 1)) {
                total += numberSet[n - 1][0];
            }
        }

        return total;
    }


}
