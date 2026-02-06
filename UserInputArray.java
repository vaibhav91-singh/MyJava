import java.util.Scanner;

public class UserInputArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element : ");
            array[i] = scanner.nextInt();
        }
        System.out.println("The array is : "); 
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}

