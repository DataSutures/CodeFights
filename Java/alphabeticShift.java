String alphabeticShift(String inputString) {
    char[] tempCharArray  = inputString.toCharArray();
    for (int i = 0; i < tempCharArray.length; i++){
        if (tempCharArray[i] == 'z'){
            tempCharArray[i] = 'a';
        }
         else {
             tempCharArray[i]++;
        }      
    }
    return String.copyValueOf(tempCharArray);
}