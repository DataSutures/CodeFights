int maxMultiple(int divisor, int bound) {
    int max = 0;
    for (int i = 1; i<=bound; i++){
        if (i%divisor == 0 && i > max){
            max = i;
        }
    }
    return max;
}