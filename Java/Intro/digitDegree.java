int digitDegree(int n) {
    if (n < 10) return 0;
    else{
        int i;
        for (i = 0; n >= 10; i++){
            int sum = 0;
            String temp = String.valueOf(n);
            for (int j = 0; j < temp.length(); j++){
                sum += Integer.parseInt(String.valueOf(temp.charAt(j)));
            }
            n = sum;
        }
        return i; 
    }
}
