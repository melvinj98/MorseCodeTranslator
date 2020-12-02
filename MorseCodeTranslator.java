import java.util.Scanner;

public class MorseCodeTranslator {
    static String input, output, finalAnswer;
    static final String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"," ", "  "};
    static final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
            ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
            "--..", "", " "};

    //contains menu
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String option = "";

        System.out.print("Enter text to be translated: ");
        String input = keyboard.nextLine();

        if (input.charAt(0) != '-' && input.charAt(0) != '.')
            finalAnswer = letterToMorse(input.toLowerCase());
        else
            finalAnswer =  morseToLetter(input);

        System.out.println("Translated text: " + finalAnswer);
    }

    public static String letterToMorse(String input) {
        String[] split = input.split("", 0);

        StringBuilder output = new StringBuilder();
        for (String s : split) {
            int x = 0;
            for (int i = 0; i < english.length; i++) {
                    if (s.equals(english[i])) {
                        if (s.equals("")) {
                            output.append(morse[i]).append("  ");
                        } else {
                            output.append(morse[i]).append(" ");
                        }

                    }

                }

        }
        return output.toString();
    }

    public static String morseToLetter(String input) {
        String[] split = input.split(" ", 0);

        StringBuilder output = new StringBuilder();
        for (String s : split) {
            for(int i = 0; i < morse.length; i++)
                if (s.equals(morse[i]))
                    output.append(english[i]);
        }
        return output.toString();
    }
}

