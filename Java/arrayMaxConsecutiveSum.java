int arrayMaxConsecutiveSum(int[] inputArray, int k) {
    int max = 0;
    for (int i = 0; i < inputArray.length-k+1; i++){
        int sum = 0;
        for(int j = 0; j < k; j++){
            sum += inputArray[i+j];
        }
        max = Math.max(max, sum);
    }
    return max;
}