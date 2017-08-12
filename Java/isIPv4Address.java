boolean isIPv4Address(String inputString) {
         
    String[] pieces = inputString.split("\\.");
    for (int i = 0; i < pieces.length; i++){
        try{
            int num = Integer.parseInt(pieces[i]);
            if (pieces.length != 4 || num > 255) return false;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
        return true;
}