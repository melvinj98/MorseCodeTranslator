import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MorseCodeTest {
    @Test
    void letterToMorse(){
        //TODO Take a word and output morse code equivalent
        MorseCodeTranslator translate = new MorseCodeTranslator();
        String inputWord = "hello hello";
        String output = MorseCodeTranslator.letterToMorse(inputWord);
        Assertions.assertEquals(".... . .-.. .-.. ---  .... . .-.. .-.. ---", output);
    }

    @Test
    void morseToLetter(){
        //TODO Take a morse code and output letter equivalent
        MorseCodeTranslator translate = new MorseCodeTranslator();
        String inputMorse = "..  .- --  - .- .-.. .-.. ";
        String output = MorseCodeTranslator.morseToLetter(inputMorse);
        Assertions.assertEquals("i am tall",output);
    }
}


