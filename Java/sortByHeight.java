int[] sortByHeight(int[] a) {
    
    int i = 0;
    List<Integer> result = new ArrayList<>();
    
    for(int j = 0; j < a.length; j++){  
        if(a[j] != -1){
            result.add(a[j]);
        }
    }
    result.sort(null);
   
    for(int k = 0; k < a.length; k++){
        if(a[k] != -1){
            a[k] = result.get(i++);
        }
    }
    return a;
}