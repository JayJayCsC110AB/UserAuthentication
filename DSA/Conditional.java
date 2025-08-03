package DSA;
import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // If Statement 1
        if (b > a) {
            System.out.println(a +" is greater than " + b);
        }
        // If-else statement
        System.out.println();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();

        if(num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num2 + " is greater than " + num1);
        }

        // Nested if-else statement
        System.out.println();
        System.out.println("Enter a number: ");
        int num = scnr.nextInt();
        if(num > 0) {
            System.out.println(num + " is a positive number.");
        } else if(num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println("The number is zero.");

    }
        // Switch statement
        System.out.println();
        System.out.println("Enter a number between 1 and 5: ");
        int choice = scnr.nextInt();;
        switch(choice) {
            case 1:
                System.out.println("You chose option 1.");
                break;
            case 2:
                System.out.println("You chose option 2.");
                break;
            case 3:
                System.out.println("You chose option 3.");
                break;
            case 4:
                System.out.println("You chose option 4.");
                break;
            case 5:
                System.out.println("You chose option 5.");
                break;
            default:
                System.out.println("Invalid choice. Please choose a number between 1 and 5.");
                break;
    
        }
        // Ternary operator
        System.out.println();
        System.out.println("Enter a number to check if it's even or odd: ");
        int number = scnr.nextInt();
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number " + number + " is " + result + ".");
    }
}