boolean isBeautifulString(String inputString) {
    int[] alphabet= new int[26];
    for (int i = 0; i < inputString.length(); i++){
        alphabet[inputString.charAt(i) - 97]++;
    }
    for (int j = 1; j < alphabet.length; j++){
        if (alphabet[j] > alphabet[j-1]){
            return false;
        }
    }
    return true;
}
