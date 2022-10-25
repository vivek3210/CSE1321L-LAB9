import java.util.Scanner;
import static java.util.Arrays.binarySearch;
public class Lab9B {
    static void bubbleSort(int myArray[]){
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = 0; j < myArray.length - i - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    int temp = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = temp;
                }
            }
        }
    }
    static int binarySearch(int myArray[], int l, int n, int x) {
        if (n >= l) {
            System.out.println("\nLow is "+l);
            System.out.println("High is "+(n));
            int mid = l + (n - l) / 2;
            System.out.println("mid is "+mid);
            System.out.println("Searching");

            if (myArray[mid] == x)
                return mid;

            if (myArray[mid] > x)
                return binarySearch(myArray, l, mid - 1, x);

            return binarySearch(myArray, mid + 1, n, x);
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] myArray = new int[11];

        System.out.println("Please enter 11 numbers:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            myArray[i] = scan.nextInt();
        }

        System.out.print("What is the target number: ");
        int targetNumber = scan.nextInt();

        System.out.print("The sorted set is: ");
        bubbleSort(myArray);
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " ");
        }

        int result = binarySearch(myArray, 0, myArray.length - 1, targetNumber);

        if (result == -1) {
            System.out.println("The target is not in the set. ");
        }
        else {
            System.out.println("The target is in the set. ");
        }
    }
}