int matrixElementsSum(int[][] matrix) {
    int sum = 0;
    for(int i = 0; i < matrix.length; i++){
         for(int j = 0; j < matrix[i].length; j++){
             if(matrix[i][j] == 0 && i + 1 < matrix.length){
                matrix[i+1][j] = 0;
             }
             if(matrix[i][j] > 0)
                 sum += matrix[i][j];
         }
    }
    return sum;
}