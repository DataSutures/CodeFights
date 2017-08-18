int differentSymbolsNaive(String s) {
    String distinct = String.valueOf(s.charAt(0));
    for(int i = 1; i < s.length(); i++){
        if(distinct.indexOf(s.charAt(i)) == -1){
            distinct += s.charAt(i);
        }
    }
    return distinct.length();
}