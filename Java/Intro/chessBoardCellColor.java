boolean chessBoardCellColor(String cell1, String cell2) {
    boolean firstCharIsEven = cell1.charAt(0) % 2 == 0;
    boolean firstNumIsEven = cell1.charAt(1) % 2 == 0;
    boolean secondCharIsEven = cell2.charAt(0) % 2 == 0;
    boolean secondNumIsEven = cell2.charAt(1) % 2 == 0;
        
    return ((firstCharIsEven == firstNumIsEven) && (secondCharIsEven == secondNumIsEven)) 
            || ((firstCharIsEven == secondNumIsEven) && (firstNumIsEven == secondCharIsEven))
            || cell1.compareTo(cell2) == 0;
}