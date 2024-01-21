import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            int[] numbers = {10, 20, 30, 40, 50};
            System.out.println("Enter an index to retrieve the element:");
            int index = scanner.nextInt();
            int result = getElementAtIndex(numbers, index);
            System.out.println("Element at index: " + index + " is: " + result);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error. Array index out of bound: " + e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Error. please enter a valid integer for the index: " + e.getMessage());
        }
        catch (Exception e){
            System.out.println("An unexpected error: " + e.getMessage());
        }
        finally {
            System.out.println("this code always run!");
            scanner.close();
        }

    }

    private static int getElementAtIndex(int[] numbers, int index) {
        return numbers[index];

    }
}