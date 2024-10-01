import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

             System.out.print("Please enter a string: ");
        String str = scanner.nextLine();

                System.out.print("Please enter a character to count: ");
        char ch = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }

              System.out.println("The character '" + ch + "' appears " + count + " times in the string.");
        scanner.close();
    }
}
