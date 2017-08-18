int[][] spiralNumbers(int n) {
    int[][] moves = {{0,1},{1,0},{0,-1},{-1,0}};
    int[][] matrix = new int[n][n];
    Stack<Integer> s = getNumberToMove(n);
    int acc = 1;
    int x = 0;
    int y = 0;
    int movesIndexFinder = 0;
    while (s.isEmpty() == false){
        int numToMove = s.pop();
        int[] dirToMove = {0,0};
        for (int i = 0; i < numToMove; i++){
            dirToMove =  moves[movesIndexFinder%4];
            matrix[x][y] = acc++; 
            x += dirToMove[0];
            y += dirToMove[1];
        }
        movesIndexFinder++;
        x -= dirToMove[0];
        y -= dirToMove[1];
        dirToMove =  moves[movesIndexFinder%4];
        x += dirToMove[0];
        y += dirToMove[1];  
    }
    return matrix;
}
Stack getNumberToMove(int n){
    Stack<Integer> s = new Stack<>();
    for (int i = 1; i < n; i++){
        s.push(i);
        s.push(i);
    } 
    s.push(n);
    return s;
}

