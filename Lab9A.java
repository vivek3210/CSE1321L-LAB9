import java.util.Scanner;
public class Lab9A {
    public static void main(String[] args) {
        int target = 0;
        int[] myArray = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 10 numbers: ");

        for(int i = 0; i < 10; i++)
        {
            System.out.print("Integer " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }
        System.out.println("What is the target number: ");
        target = input.nextInt();

        boolean isFound = false;
        for(int j = 0; j < myArray.length; j++)
        {
            if(myArray[j] == target)
            {
                isFound = true;
                break;
            }
        }
        if(isFound) {
            System.out.println("The target is in the set.");
        }
        else{
            System.out.println("The target is not in the set.");
        }
        }
    }

