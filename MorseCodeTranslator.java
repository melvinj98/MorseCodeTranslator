import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MorseCodeTranslator {
    static String input, output;
    static List<String> wordList = new ArrayList<>(); //contains a word converted to morse code
    static List<List> morseCodes = new ArrayList<>(); //contains morseCode arrayLists
    static List<String> translatedMorseCodes = new ArrayList<>(); //morse to english

    //contains menu
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String option = "";

        System.out.println("Enter text to be translated");
        String input = keyboard.nextLine();

        if (input.charAt(0) != '-' && input.charAt(0) != '.') {
            letterToMorse(input);
            for (int i = 0; i < wordList.size(); i++) {
                System.out.print("Translated text(morse to text): " + wordList.get(i));
            }
        } else {
            morseToLetter(input);

        }

        /*
        StringBuilder word = new StringBuilder();
        for (String s : translatedMorseCodes) {
            word.append(s);//forms word from converted letter
        }

         */

        //System.out.print("Translated text(text to morse): " + word);


    }

    public static String letterToMorse(String input) {
        String inputWord = input.toLowerCase();

        List<Character> aLetter = new ArrayList<>();
        for (int i = 0; i < inputWord.length(); i++) {
            aLetter.add(inputWord.charAt(i));
        }

        for (int i = 0; i < aLetter.size(); ) {
            String output = "";

            switch (aLetter.get(i)) {
                case 'a' -> output = ".- ";
                case 'b' -> output = "-... ";
                case 'c' -> output = "-.-. ";
                case 'd' -> output = "-.. ";
                case 'e' -> output = ". ";
                case 'f' -> output = "..-. ";
                case 'g' -> output = "--. ";
                case 'h' -> output = ".... ";
                case 'i' -> output = ".. ";
                case 'j' -> output = ".--- ";
                case 'k' -> output = "-.- ";
                case 'l' -> output = ".-.. ";
                case 'm' -> output = "-- ";
                case 'n' -> output = "-. ";
                case 'o' -> output = "--- ";
                case 'p' -> output = ".--.";
                case 'q' -> output = "--.- ";
                case 'r' -> output = ".-. ";
                case 's' -> output = "... ";
                case 't' -> output = "- ";
                case 'u' -> output = "..- ";
                case 'v' -> output = "...- ";
                case 'w' -> output = ".-- ";
                case 'x' -> output = "-..- ";
                case 'y' -> output = "-.-- ";
                case 'z' -> output = "--.. ";
                case ' ' -> output = " ";
                //case "  " -> output = " ";
                default -> System.out.println("Default Text");
            }
            i++;
            wordList.add(output);
        }

        StringBuilder word = new StringBuilder(); //this will be the word that will be output
        for (String s : wordList) {
            word.append(s);//forms word from converted letter
        }

        return word.toString();
    }

    /*
    //parses a word
    public static List<String> getTokens(String input) {
        StringTokenizer tokenizer = new StringTokenizer(input, "  ");
        while (tokenizer.hasMoreElements()) {
            morseCodes.add(tokenizer.nextToken());
        }
        return morseCodes;
    }

     */

    public static List<String> morseToLetter(String input) {
/*
                getTokens(input);
*/

        List<String> morseCode = new ArrayList<>();

        StringTokenizer tokenizer = new StringTokenizer(input, "  ");
        while (tokenizer.hasMoreElements()) {
            morseCode.add(tokenizer.nextToken());
            morseCodes.add(morseCode);
        }


        for (int i = 0; i < morseCodes.size(); i++) {
            for (i = 0; i < morseCode.size(); i++) {
                String output = "";

                switch (morseCode.get(i)) {
                    case ".-" -> output = "a";
                    case "-..." -> output = "b";
                    case "-.-." -> output = "c";
                    case "-.." -> output = "d";
                    case "." -> output = "e";
                    case "..-." -> output = "f";
                    case "--." -> output = "g";
                    case "...." -> output = "h";
                    case ".." -> output = "i";
                    case ".---" -> output = "j";
                    case "-.-" -> output = "k";
                    case ".-.." -> output = "l";
                    case "--" -> output = "m";
                    case "-." -> output = "n";
                    case "---" -> output = "o";
                    case ".--." -> output = "p";
                    case "--.-" -> output = "q";
                    case ".-." -> output = "r";
                    case "..." -> output = "s";
                    case "-" -> output = "t";
                    case "..-" -> output = "u";
                    case "...-" -> output = "v";
                    case ".--" -> output = "w";
                    case "-..-" -> output = "x";
                    case "-.--" -> output = "y";
                    case "--.." -> output = "z";
                    case " " -> output = "  ";
                    default -> System.out.println("Default Text");
                }
                translatedMorseCodes.add(output);
            }
        }
            return translatedMorseCodes;
    }
}
