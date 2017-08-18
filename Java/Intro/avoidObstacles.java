public static int avoidObstacles(int[] inputArray) {
    int[]  temp = new int[40];
        
    for (int i = 0; i < inputArray.length; i++){
        temp[inputArray[i]] = 1;
    }
    int j;
    for (j = 2; j < temp.length ; j++){   
        int k;
        for (k = 1; k * j < 40; k++){
            if (temp[k*j] == 1){
                break;
            }
        }
        if ( k * j >= temp.length){
            break;
        }
    }
    return j;
}