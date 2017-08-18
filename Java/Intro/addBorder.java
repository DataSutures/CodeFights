String[] addBorder(String[] picture) {
    
    String[] result = new String[picture.length+2];
    result[0] = result[result.length-1] = "";
    
    for (int i = 0; i < result.length; i++) {
        if (i == 0 || i == result.length-1) {
            for (int j = 0; j < picture[0].length() + 2; j++){
                result[i]  += "*" ;  
            }
        }
        else {
            result[i] = "*" + picture[i-1] + "*";
        }
    }
    return result;
}