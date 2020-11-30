import java.util.*;

public class MorseCodeManny {
    static Scanner keyboard;
    static String input = "";
    static final String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
            "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            ".", "?", " ","!", "-","_", "'" };
    static final String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
            ".-..", "--", "-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
            ".-.-.-", "..--..", "/", "..--.", "-....-", "..--.-", ".----."};

    public static void main(String[] args) {
        System.out.println("Enter English sentence to be converted.");
        System.out.print("Sentence: ");
        keyboard = new Scanner(System.in).useDelimiter("\n");
        input = keyboard.next().toLowerCase();
        System.out.println(convert(input));
    }

    public static String convert(String input) {
        String[] split = input.split("", 0);
        StringBuilder sentenceAnswer = new StringBuilder();
        for (String s : split) {
            for (int j = 0; j < english.length; j++) {
                if (split.length == 1) {
                    if (s.equals(english[j])) {
                        sentenceAnswer.append(morse[j]);
                    }
                } else {
                    if (s.equals(english[j])) {
                        if (j == split.length - 1) {
                            sentenceAnswer.append(morse[j]);
                        } else {
                            sentenceAnswer.append(morse[j]).append(" ");
                        }

                    }
                }
            }
        }
        return sentenceAnswer.toString();
    }
}