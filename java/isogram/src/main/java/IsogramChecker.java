class IsogramChecker {

    boolean isIsogram(String phrase) {
        if (phrase == "") {
            return true;
        }

        if (phrase.substring(1).contains(String.valueOf(phrase.charAt(0)))) {
            return false;
        }
        return true;
    }

}
