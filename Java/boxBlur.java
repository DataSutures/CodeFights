int[][] boxBlur(int[][] image) {
    int blurredImage[][] = new int[image.length - 2][image[0].length-2];

    for (int i = blurredImage.length; i > 0; i--){
        for (int j = blurredImage[0].length; j > 0; j--){
            blurredImage[i-1][j-1] = (image[i-1][j-1] 
                                      + image[i-1][j]
                                      + image[i-1][j+1] 
                                      + image[i][j-1]
                                      + image[i][j]
                                      + image[i][j+1]
                                      + image[i+1][j-1] 
                                      + image[i+1][j]
                                      + image[i+1][j+1]
                                     )/9;
        }
    }
    return blurredImage; 
}