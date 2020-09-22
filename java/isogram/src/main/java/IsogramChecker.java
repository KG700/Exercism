class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase();
        if (phrase == "") {
            return true;
        }

        for (int i = 0; i < phrase.length() - 1; i++) {
            boolean isHyphen = phrase.charAt(i) == '-';
            boolean isMultiple = phrase.substring(i + 1).contains(String.valueOf(phrase.charAt(i)));
            if (!isHyphen && isMultiple) {
                return false;
            }
        }
        return true;
    }

}
