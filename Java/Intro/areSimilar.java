boolean areSimilar(int[] a, int[] b) {
    int firstNonmatchIndex = - 1;
    int nonMatchCount = 0;
    for (int i = 0; i < a.length; i++){
        if(a[i] != b[i]){
            nonMatchCount++;
            if (firstNonmatchIndex < 0){
                firstNonmatchIndex = i; 
            }
            else if (a[firstNonmatchIndex] != b[i] || a[i] != b[firstNonmatchIndex] || nonMatchCount > 2){
                return false;
            }      
        }
    } 
    return true;
}