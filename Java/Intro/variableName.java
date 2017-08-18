boolean variableName(String name) {
    char temp = name.charAt(0);
    if (Character.isDigit(temp)){
        return false;
    }
    for (int i = 0; i < name.length(); i++){
        if (!Character.isLetterOrDigit(name.charAt(i)) && name.charAt(i) != '_'){
            return false;
        }
    }
    return true;
}