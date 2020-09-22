class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase();
        if (phrase == "") {
            return true;
        }

        if (phrase.substring(1).contains(String.valueOf(phrase.charAt(0)))) {
            return false;
        }
        return true;
    }

}
