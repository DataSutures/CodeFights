int arrayChange(int[] inputArray) {
    int sum = 0;
    for(int i = 0; i < inputArray.length - 1; i++){
        if(inputArray[i + 1] <= inputArray[i]){
            int temp = inputArray[i] - inputArray[i + 1]  + 1;
            sum += temp;
            inputArray[i + 1] = temp + inputArray[i + 1];
        }
    } 
    return sum;
}