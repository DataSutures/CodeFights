String[] fileNaming(String[] names) {
    Map<String, Integer> dictionary = new LinkedHashMap<>();
    dictionary.put(names[0], 1);
    for (int i = 1; i < names.length; i++){
        String temp = names[i];
        if (dictionary.containsKey(temp) == false){
            dictionary.put(temp, 1);    
        }
        else{
            int value = dictionary.replace(temp, dictionary.get(temp)+1);
            String newUnique = temp + "(" + value + ")";
            while (dictionary.containsKey(newUnique)){
                value++;
                newUnique = temp + "(" + value + ")";
            }
            dictionary.put(newUnique, value);
        }
    }  
    Set<String> set = dictionary.keySet();
    return set.toArray(new String[set.size()]);
}