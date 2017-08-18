String lineEncoding(String s) {
    String result = "";
    char current = s.charAt(0);
    int count = 1;
    for (int i = 1; i < s.length(); i++){
        if (s.charAt(i) == current) count++;
        else{
            if (count == 1)
                result += String.valueOf(current);
            else result += String.valueOf(count) + String.valueOf(current);
            count = 1;
            current = s.charAt(i);
            }
        }
    if (s.substring(s.length() - 2, s.length()) != String.valueOf(count) + current)
        if (count == 1) return result + String.valueOf(current);
        else return result + String.valueOf(count) + String.valueOf(current);
    else return result;