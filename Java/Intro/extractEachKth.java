int[] extractEachKth(int[] inputArray, int k) {
    if( k == 1) { return new int[0]; }
    int len = inputArray.length;
    int[] result  = new int[len - (len/k)];
    int resultPointer = 0;
    int reject = k-1;
    for (int i = 0; i < len ; i++){
        if(!(i == reject)){
            result[resultPointer++] = inputArray[i];
        }
        else{
            reject += k;
        }
    }   
    return  result;
}