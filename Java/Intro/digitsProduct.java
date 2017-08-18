int digitsProduct(int product) {
    if (product < 9 && product > 0) return product;
    if (product == 0) return 10;
    String s =  "";
    for (int i = 9; i > 1; i--){
        if (product % i == 0){
            s += String.valueOf(i);
            product /= i;
            if (product % i == 0){
                i++;
            }
        }
    } 
    if (product < 2) return Integer.valueOf(new StringBuilder(s).reverse().toString());
    else return -1;
}