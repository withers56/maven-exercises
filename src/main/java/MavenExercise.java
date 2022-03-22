import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input: ");
        String userInput = scanner.nextLine();
        boolean isNumber = StringUtils.isNumeric(userInput);
        String inputFlipped = StringUtils.swapCase(userInput);
        String inputReversed = StringUtils.reverse(userInput);

        System.out.println("User input is a number: " + isNumber);
        System.out.println("User input cases flipped: " + inputFlipped);
        System.out.println("User input reversed: " + inputReversed);
    }
}
