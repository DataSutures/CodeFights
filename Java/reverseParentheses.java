String reverseParentheses(String s) {
    if(!s.contains("(")){
        return s;
    }
  
    ArrayList<Character> list = new ArrayList<>();
    for(int i = 0; i < s.length(); i++){
            list.add(s.charAt(i));
    }

    while(list.contains('(')){
        int lastOfLeft = list.lastIndexOf('(');
        int firstFollowingRight = - 1;
        for(int i = lastOfLeft;  i < list.size() && firstFollowingRight < 0; i++){
            char temp = list.get(i);
            if(temp == ')'){
                firstFollowingRight = i;
            }
        }
        int front = lastOfLeft;
        int end = firstFollowingRight;
        while(front < end){
            char t = list.get(front);
            list.set(front, list.get(end));
            list.set(end, t);
            front++;
            end--;
        }
        list.remove(lastOfLeft);
        list.remove(firstFollowingRight-1);
    }   
    String result =  "";
    for(int k = 0; k < list.size(); k++){
        result += list.get(k);
    }
    return result;
}