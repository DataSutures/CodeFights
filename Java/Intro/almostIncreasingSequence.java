boolean almostIncreasingSequence(int[] sequence) {

    if(LongestIncreasingSubsequenceLength(sequence,sequence.length) == sequence.length - 1){
        return true;
    }
    return false;
}

int CeilIndex(int A[], int l, int r, int key){

    while (r - l > 1){
        int m = l + (r - l)/2;
        if (A[m]>=key)
            r = m;
        else
            l = m;
    }
    return r;
}

int LongestIncreasingSubsequenceLength(int A[], int size){

    int[] tailTable   = new int[size];
    int len; 
    tailTable[0] = A[0];
    len = 1;
        
    for (int i = 1; i < size; i++){
        if (A[i] < tailTable[0])
            tailTable[0] = A[i];
        else if (A[i] > tailTable[len-1])
            tailTable[len++] = A[i];
        else
            tailTable[CeilIndex(tailTable, -1, len-1, A[i])] = A[i];
    }
    return len;
}