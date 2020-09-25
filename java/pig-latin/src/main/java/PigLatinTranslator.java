import java.util.Arrays;
import java.util.List;

class PigLatinTranslator {

    String translate(String word) {
        String pigWord = word;

        String[] vowels = new String[] { "a", "e", "i", "o", "u", "yt", "xr" };
        String[] doubleConsonants = new String[] { "ch", "qu", "th", "rh" };
        String[] tripleConsonants = new String[] { "thr", "sch" };

        List<String> vowelsList = Arrays.asList(vowels);
        List<String> doubleConsonantsList = Arrays.asList(doubleConsonants);
        List<String> tripleConsonantsList = Arrays.asList(tripleConsonants);

        String firstLetter = String.valueOf(word.charAt(0));
        String secondLetter = "";
        String thirdLetter = "";

        if (word.length() > 1) {
            secondLetter = String.valueOf(word.charAt(1));
        }
        if (word.length() > 2) {
            thirdLetter = String.valueOf(word.charAt(2));
        }

        boolean isConstQu = secondLetter.equals("q") && thirdLetter.equals("u");

        if ( !vowelsList.contains(firstLetter) && isConstQu || tripleConsonantsList.contains(firstLetter + secondLetter + thirdLetter)) {
            pigWord = word.substring(3) + firstLetter + secondLetter + thirdLetter;
        }
        else if ( doubleConsonantsList.contains(firstLetter + secondLetter)) {
            pigWord = word.substring(2) + firstLetter + secondLetter;
        }
        else if( !vowelsList.contains(firstLetter) && !vowelsList.contains(firstLetter + secondLetter) ) {
            pigWord = word.substring(1) + firstLetter;
        }

        return pigWord + "ay";
    }

}