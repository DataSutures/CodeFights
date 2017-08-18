int commonCharacterCount(String s1, String s2) {
    int sum = 0;
    int[] s1Count = new int[26];
    int[] s2Count = new int[26];
    for(int i = 0; i < s1.length(); i++){
        s1Count[s1.charAt(i) - 'a']++;
    }
    for(int j = 0; j < s2.length(); j++){
        s2Count[s2.charAt(j) - 'a']++;
    }
    for(int k = 0; k < s1Count.length; k++){
            sum += Math.min(s1Count[k], s2Count[k]);
    }
    return sum;
}