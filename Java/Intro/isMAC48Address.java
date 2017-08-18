boolean isMAC48Address(String inputString) {
    if (inputString.charAt(0) == '-' || inputString.charAt(inputString.length()-1) == '-'){
        return false;
    }
    String[] inputStrings = inputString.split("-");
    try { 
        Arrays.stream(inputStrings).forEach(group -> Integer.parseInt(group, 16));
        return inputStrings.length == 6 && Arrays.stream(inputStrings)
                                            .allMatch(group -> group.length() == 2);
        }
    catch (NumberFormatException e){
            return false;
        }
}
