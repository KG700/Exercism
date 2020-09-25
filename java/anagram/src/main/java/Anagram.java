import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Anagram {
    private String word;

    Anagram(String word) {
        this.word = word;
    }

    String sortLetters(String word) {
        char[] letterArray = word.toCharArray();
        Arrays.sort(letterArray);
        String sorted = new String(letterArray);
        return sorted.toLowerCase();

    }

    List<String> match(List<String> words) {
        List<String> matchingWords = new ArrayList<String>();

        String sortedWord = sortLetters(this.word);

        for (String word : words) {
            String sortedWordToMatch = sortLetters(word);
            if (sortedWord.equals(sortedWordToMatch)) {
                matchingWords.add(word);
            }
        }


        return matchingWords;
    }
}
