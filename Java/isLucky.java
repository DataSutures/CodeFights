boolean isLucky(int n) {
    
    char[] digits = String.valueOf(n).toCharArray();
    int sumLeft = 0;
    int sumRight = 0;
    int i = 0;
    int j = digits.length - 1;
    
    while(i < j){
        sumLeft += digits[i] - '0';
        sumRight += digits[j] - '0';
        i++;
        j--;
    }
     return sumLeft == sumRight;
}