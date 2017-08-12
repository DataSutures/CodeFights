boolean evenDigitsOnly(int n) {
    String temp = String.valueOf(n);
    for  (int i = 0; i < temp.length(); i++){
        if (Integer.valueOf(String.valueOf(temp.charAt(i))) % 2 != 0)         { 
            return false;
        }
    }
    return true;
}