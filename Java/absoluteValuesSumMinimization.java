int absoluteValuesSumMinimization(int[] a) {
    int absMin = -1;
    int absSum = (int)Math.pow(10, 7);
    for (int i = 0; i < a.length; i++){
        int sum = 0;
        for (int j = 0; j < a.length; j++){
            sum += Math.abs(a[j] - a[i]);
        }
        if (sum < absSum) {
            absMin = a[i];
            absSum = sum;
        }
    }
    return absMin;
}