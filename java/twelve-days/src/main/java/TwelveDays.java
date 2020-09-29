import java.util.Hashtable;

class TwelveDays {
    String verse(int verseNumber) {
        Hashtable<Integer, String[]> gifts = new Hashtable<>();
        gifts.put(1, new String[]{"first", "a Partridge in a Pear Tree"});
        gifts.put(2, new String[]{"second", "two Turtle Doves"});
        gifts.put(3, new String[]{"third", "three French Hens"});
        gifts.put(4, new String[]{"fourth", "four Calling Birds"});
        gifts.put(5, new String[]{"fifth", "five Gold Rings"});
        gifts.put(6, new String[]{"sixth", "six Geese-a-Laying"});
        gifts.put(7, new String[]{"seventh", "seven Swans-a-Swimming"});
        gifts.put(8, new String[]{"eighth", "eight Maids-a-Milking"});
        gifts.put(9, new String[]{"ninth", "nine Ladies Dancing"});
        gifts.put(10, new String[]{"tenth", "ten Lords-a-Leaping"});
        gifts.put(11, new String[]{"eleventh", "eleven Pipers Piping"});
        gifts.put(12, new String[]{"twelfth", "twelve Drummers Drumming"});

        String verse = "On the " + gifts.get(verseNumber)[0] + " day of Christmas my true love gave to me: ";
        for (int i = verseNumber; i > 0; i--) {
            verse += gifts.get(i)[1];
            if (i > 1) verse += ", ";
            if (i == 2) verse += "and ";
        }

        return verse + ".\n";
    }

    String verses(int startVerse, int endVerse) {
        String verses = "";
        for (int i = startVerse; i <= endVerse; i++) {
            verses += verse(i);
            if (i < endVerse) verses += "\n";
        }
        return verses;
    }
    
    String sing() {
        return verses(1, 12);
    }
}
