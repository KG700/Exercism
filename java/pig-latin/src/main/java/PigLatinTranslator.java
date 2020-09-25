import java.util.Arrays;
import java.util.List;

class PigLatinTranslator {

    String translate(String word) {
        String pigWord = word;

        String[] vowels = new String[] { "a", "e", "i", "o", "u" };
        List<String> vowelsList = Arrays.asList(vowels);

        String firstLetter = String.valueOf(word.charAt(0));
        String secondLetter = String.valueOf(word.charAt(1));

        if ( (firstLetter.equals("c")) && (secondLetter.equals("h"))) {
            pigWord = word.substring(2) + firstLetter + secondLetter;
        }
        else if( !vowelsList.contains(firstLetter) ) {
            pigWord = word.substring(1) + firstLetter;
        }

        return pigWord + "ay";
    }

}