String messageFromBinaryCode(String code) {
    String result = "";
    int current = 8;
    int previous = 0;
    while (current <= code.length()){
        String eightBits = code.substring(previous, current);
        char c = (char)Integer.parseInt(eightBits, 2);
        result += c;
        previous = current;
        current += 8;
    }
    return result;
}