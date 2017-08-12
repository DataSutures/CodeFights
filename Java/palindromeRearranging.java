boolean palindromeRearranging(String inputString){
    
    int[] alphaCount = new int[26];
    
    for (int i = 0; i < inputString.length(); i++){
        alphaCount[(int) inputString.charAt(i) - 97]++;
    }
    
    int oddCount = 0;
    for (int j = 0; j < alphaCount.length && oddCount <= 1; j ++){
        if (alphaCount[j] % 2 == 1){
            oddCount++;
        }
    }
    return oddCount <= 1;
}