int chessKnight(String cell) {
    int[][] passCells = {{ 1, 2},{ 2, 1},
                         {-1, 2},{ 1,-2},
                         {-2, 1},{ 2,-1},
                         {-1,-2},{-2,-1}};
    int count = 0;
    for (int i = 0; i < passCells.length; i++){
        int distanceColumn = cell.charAt(0) + passCells[i][0];
        int distanceRow = cell.charAt(1) + passCells[i][1];
        if (distanceColumn > 96 && distanceColumn < 105 &&
            distanceRow > 48 && distanceRow < 57){
            count++;
        }
    }
    return count;
}
