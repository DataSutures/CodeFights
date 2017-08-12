// This was a really lazy solution but it works
// Will improve on it later
int[][] minesweeper(boolean[][] matrix) {
        int[][] mineSweeperMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
               try {
                    if (matrix[i-1][j-1] == true) { mineSweeperMatrix[i][j]++; }
               }
               catch (IndexOutOfBoundsException e) {}
               try {
                    if (matrix[i-1][j]   == true) { mineSweeperMatrix[i][j]++; }
               }
               catch (IndexOutOfBoundsException e) {}
               try {
                   if (matrix[i-1][j+1] == true) { mineSweeperMatrix[i][j]++; } 
               }
               catch (IndexOutOfBoundsException e) {}
               try {
                   if (matrix[i][j-1]   == true) { mineSweeperMatrix[i][j]++; }
               }
               catch (IndexOutOfBoundsException e) {}
               try { 
                   if (matrix[i][j+1]   == true) { mineSweeperMatrix[i][j]++; }
               }
               catch (IndexOutOfBoundsException e) {}
               try { 
                   if (matrix[i+1][j-1] == true) { mineSweeperMatrix[i][j]++; }
               }
               catch (IndexOutOfBoundsException e) {}
               try { 
                    if (matrix[i+1][j]   == true) { mineSweeperMatrix[i][j]++; } 
               }
              catch (IndexOutOfBoundsException e) {}
               try { 
                   if (matrix[i+1][j+1] == true) { mineSweeperMatrix[i][j]++; } 
               }
               catch (IndexOutOfBoundsException e) {}
            }
        }
        return mineSweeperMatrix;
    }