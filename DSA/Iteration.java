package DSA;

public class Iteration {
    public static void main(String[] args) {
        // For loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // While loop
        System.out.println("\nWhile loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration " + j);
            j++;
        }

        // Do-while loop
        System.out.println("\nDo-while loop:");
        int k = 1;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k <= 5);
        //for-each loop
        System.out.println("\nFor-each loop:");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }   
        //Infinite loop
        System.out.println("\nInfinite loop (commented out to avoid execution):");
        // while (true) {
        //     System.out.println("This will run forever!");
    }
}
