import java.util.Arrays;
import java.util.List;

class PigLatinTranslator {

    String translate(String word) {
        String pigWord = word;

        String[] vowels = new String[] { "a", "e", "i", "o", "u" };
        String[] doubleConsonants = new String[] { "ch", "qu", "th" };
        String[] tripleConsonants = new String[] { "thr", "sch" };

        List<String> vowelsList = Arrays.asList(vowels);
        List<String> doubleConsonantsList = Arrays.asList(doubleConsonants);
        List<String> tripleConsonantsList = Arrays.asList(tripleConsonants);

        String firstLetter = String.valueOf(word.charAt(0));
        String secondLetter = String.valueOf(word.charAt(1));
        String thirdLetter = String.valueOf(word.charAt(2));

        boolean isConstQu = secondLetter.equals("q") && thirdLetter.equals("u");

        if ( !vowelsList.contains(firstLetter) && isConstQu || tripleConsonantsList.contains(firstLetter + secondLetter + thirdLetter)) {
            pigWord = word.substring(3) + firstLetter + secondLetter + thirdLetter;
        }
        else if ( doubleConsonantsList.contains(firstLetter + secondLetter)) {
            pigWord = word.substring(2) + firstLetter + secondLetter;
        }
        else if( !vowelsList.contains(firstLetter) ) {
            pigWord = word.substring(1) + firstLetter;
        }

        return pigWord + "ay";
    }

}