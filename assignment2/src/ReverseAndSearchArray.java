import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseAndSearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int search;

        System.out.println("How many integers do you want to introduce: ");
        size = sc.nextInt();
        int[] values = new int[size];
        ArrayList<Integer> posList = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) {
            System.out.println("Introduce an integer: ");
            values[i] = sc.nextInt();
        }

        System.out.println("Array successfully registered: ");
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(values[i]);
            if (i < (size - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int[] reversedValues = new int[size];
        for(int i = 0; i < size; i++) {
            reversedValues[size - i - 1] = values[i];
        }

        System.out.println("Array reversion: ");
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(reversedValues[i]);
            if (i < (size - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println("Introduce integer to search: ");
        search = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (values[i] == search) {
                posList.add(i);
            }
        }

        if(posList.size() > 0) {
            System.out.println("The integer appears " + posList.size() + " times in the array.");
            System.out.println("Positions of the integer: " + posList);
        } else {
            System.out.println("The integer doesn't exist in the array.");
        }
    }
}
