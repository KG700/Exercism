import java.util.Arrays;
import java.util.List;

class PigLatinTranslator {

    String translate(String word) {
        String pigWord = word;

        String[] vowels = new String[] { "a", "e", "i", "o", "u" };
        List<String> vowelsList = Arrays.asList(vowels);

        String firstLetter = String.valueOf(word.charAt(0));

        if( !vowelsList.contains(firstLetter) ) {
            pigWord = word.substring(1) + firstLetter;
        }

        return pigWord + "ay";
    }
}