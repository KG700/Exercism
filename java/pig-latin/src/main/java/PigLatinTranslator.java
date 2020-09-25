import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PigLatinTranslator {

    String translate(String english) {
        String pigWord;

        final String[] vowels = new String[]{"a", "e", "i", "o", "u", "yt", "xr"};
        final String[] doubleConsonants = new String[]{"ch", "qu", "th", "rh"};
        final String[] tripleConsonants = new String[]{"thr", "sch"};

        final List<String> vowelsList = Arrays.asList(vowels);
        final List<String> doubleConsonantsList = Arrays.asList(doubleConsonants);
        final List<String> tripleConsonantsList = Arrays.asList(tripleConsonants);

        ArrayList<String> pigWords = new ArrayList<String>();
        String[] words = english.split("\\s+");

        for (String word : words) {

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

            if (!vowelsList.contains(firstLetter) && isConstQu || tripleConsonantsList.contains(firstLetter + secondLetter + thirdLetter)) {
                pigWord = word.substring(3) + firstLetter + secondLetter + thirdLetter;
            } else if (doubleConsonantsList.contains(firstLetter + secondLetter)) {
                pigWord = word.substring(2) + firstLetter + secondLetter;
            } else if (!vowelsList.contains(firstLetter) && !vowelsList.contains(firstLetter + secondLetter)) {
                pigWord = word.substring(1) + firstLetter;
            } else {
                pigWord = word;
            }

            pigWords.add(pigWord + "ay");
        }

        return String.join(" ", pigWords);

    }

}