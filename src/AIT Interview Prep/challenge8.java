import java.util.Scanner;

public class challenge8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = scanner.nextLine();

        for(int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i) + ",");
        }

        System.out.print(input);

    }
}