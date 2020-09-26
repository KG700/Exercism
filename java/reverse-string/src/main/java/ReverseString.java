class ReverseString {

    String reverse(String inputString) {
        if (inputString.equals("")) return inputString;
        return new StringBuilder(inputString).reverse().toString();
    }
  
}
