int addTwoDigits(int n) {
    return Character.getNumericValue(String.valueOf(n).charAt(0)) + 
           Character.getNumericValue(String.valueOf(n).charAt(1));
}
