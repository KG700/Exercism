class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase();
        if (phrase == "") {
            return true;
        }

        for (int i = 0; i < phrase.length() - 1; i++) {
            if (phrase.substring(i + 1).contains(String.valueOf(phrase.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

}
