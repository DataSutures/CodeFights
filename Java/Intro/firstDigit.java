char firstDigit(String inputString) {
    char c = inputString.charAt(0);
    for (int i = 0; i < inputString.length(); i++){
        c = inputString.charAt(i);
        if (Character.isDigit(c)){
            break;
        }
    }
    return c;
}