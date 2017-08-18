String buildPalindrome(String st) {
    String palindrome = "";
    String leftString = "";
    int i;
    for (i = 0; i < st.length(); i++){
        String potentialPalindrome = st.substring(i, st.length());
        if(isPalindrome(potentialPalindrome)){
            palindrome = potentialPalindrome;
            if (st.length() == palindrome.length()) return palindrome;
            break;
        }
    }
    return st + new StringBuilder(st.substring(0, i)).reverse();
}
public static boolean isPalindrome(String s){
    return s.equals(new StringBuilder(s).reverse().toString());
}