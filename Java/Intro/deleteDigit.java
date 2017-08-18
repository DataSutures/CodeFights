int deleteDigit(int n) {
    String nums = String.valueOf(n);
    int max = Integer.valueOf(nums.substring(1, nums.length()));
    for (int i = 1; i < nums.length() ; i++){
        int newNum;
        if (i != nums.length()){
            String numLessI = nums.substring(0,i) + nums.substring(i + 1, nums.length());
            newNum = Integer.valueOf(numLessI);
            }
        else{
            newNum = Integer.valueOf(nums.substring(0, nums.length() - 1));
            }
        if (newNum > max){
                max =newNum;
            }
    }
    return max;
}
