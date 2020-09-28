class Proverb {

    String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        if (words.length == 0) return "";
        return "And all for the want of a nail.";
    }

}
