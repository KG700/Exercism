import java.util.Arrays;
import java.util.List;

class PigLatinTranslator {

    String translate(String word) {
        String pigWord = word;

        String[] vowels = new String[] { "a", "e", "i", "o", "u" };
        String[] doubleConsonants = new String[] { "ch", "qu" };
        List<String> vowelsList = Arrays.asList(vowels);
        List<String> doubleConsonantsList = Arrays.asList(doubleConsonants);

        String firstLetter = String.valueOf(word.charAt(0));
        String secondLetter = String.valueOf(word.charAt(1));

        if ( doubleConsonantsList.contains(firstLetter + secondLetter)) {
            pigWord = word.substring(2) + firstLetter + secondLetter;
        }
        else if( !vowelsList.contains(firstLetter) ) {
            pigWord = word.substring(1) + firstLetter;
        }

        return pigWord + "ay";
    }

}