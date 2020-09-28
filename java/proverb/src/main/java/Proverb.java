class Proverb {

    String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if (words.length == 0) return "";
        String proverbStr = "";
        if (words.length > 1) {
            for (int i = 1; i < words.length; i++) {
                proverbStr += "For want of a " + words[i-1] + " the " + words[i] + " was lost.\n";
            }
        }
        return proverbStr + "And all for the want of a " + words[0] + ".";
    }

}
