class TwelveDays {
    String verse(int verseNumber) {
        String verse = "";

        switch(verseNumber) {
            case 1:
                verse = "On the first day of Christmas my true love gave to me: " +
                        "a Partridge in a Pear Tree.\n";
                break;
            case 2:
                verse = "On the second day of Christmas my true love gave to me: two Turtle Doves, " +
                        "and a Partridge in a Pear Tree.\n";
                break;
        }
        return verse;
    }

    String verses(int startVerse, int endVerse) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
    
    String sing() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
