String[] allLongestStrings(String[] inputArray) {
    int maxLength = 0;
    ArrayList<String> longest = new ArrayList<>();
    for(String s: inputArray){
        if(s.length() == maxLength){
            longest.add(s);
        }
        if(s.length() > maxLength){
            maxLength = s.length();
            longest.clear();
            longest.add(s);
        }
    }
    String [] result = longest.toArray(new String[longest.size()]);
    return result;
}