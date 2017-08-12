int shapeArea(int n) {
    if(n==1) return 1;
    else return shapeArea(n-1) + 4 * (n-1);
}