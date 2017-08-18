String longestDigitsPrefix(String inputString) {

    String s = "";
    String temp = "";
    for (int i = 0; i < inputString.length(); i++){
        char c = inputString.charAt(i);
        if (Character.isWhitespace(c)) { return "";}
        if (Character.isDigit(c)){
            temp += String.valueOf(c);
        } 
        else{
            if (temp.length() > s.length()) { s = temp;}
            temp = "";
        }
    }
    if (temp.equals(inputString)) {return temp;}
    else return s;
}
