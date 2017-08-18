int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
    if (upSpeed > desiredHeight) { return 1;}
    int height = 0;
    int i;
    for (i = 0; i < Integer.MAX_VALUE && height < desiredHeight; i++){
        height += upSpeed;
        height -= downSpeed;
    }
    return i-1;
}
