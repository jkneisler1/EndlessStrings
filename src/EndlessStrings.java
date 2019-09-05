import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String userInput = "";

        System.out.println("Enter some text.");
        userInput = keyboard.nextLine();

        while ( ! userInput.isEmpty() ) {
            System.out.println(userInput);

            System.out.println();
            System.out.println("Enter some text.");
            userInput = keyboard.nextLine();
        }

        System.out.println();
        System.out.println("Thanks for entering some text, goodbye.");
    }
}
