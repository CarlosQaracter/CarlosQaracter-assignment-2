import java.util.Scanner;

public class StringBuilderManipulation {

    public static void main(String[] args) {
        repeater();
    }
    private static void repeater() {
        Scanner sc = new Scanner(System.in);
        int size;
        int times;

        System.out.println("How many words do you want to introduce: ");
        size = sc.nextInt();
        sc.nextLine();

        String[] words = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Introduce a word: ");
            words[i] = sc.nextLine();
        }

        System.out.println("How many times do you want to repeat the words: ");
        times = sc.nextInt();
        sc.nextLine();

        StringBuilder sb = new StringBuilder();

        if(size < 1 || times < 1) {
            System.out.println("Invalid input.");
        } else {
            for (int i = 0; i < size; i++) {
                for(int j = 0; j < times; j++) {
                    sb.append(words[i]);
                    if (!((i == size - 1 ) && (j == times - 1))) {
                        sb.append(" ");
                    }
                }
            }

            System.out.println("StringBuilder output:");
            System.out.println(sb);
        }
    }
}
