// See https://www.hackerearth.com/practice/algorithms/graphs/hamiltonian-path/tutorial/

boolean stringsRearrangement(String[] inputArray) {
    int len = inputArray.length;
    boolean[][] graph = new boolean[len][len];
    for(int i = 0; i < len; i++){
        for(int j = i; j < len; j++){
            int count = 0;
            for(int m = 0; m < inputArray[0].length(); m++){
                if(inputArray[i].charAt(m) != inputArray[j].charAt(m)){
                    count++;
                }
            }
            if(count == 1){
                graph[i][j] = true;
                graph[j][i] = true;
            }
        }
    }  
    return check(graph, len);
}  
boolean dfs(int vertex, boolean graph[][], int visited[], int inStack_Count, int n){
    if(inStack_Count == n){
        return true;
    }
    for(int i = 0; i < n; i++)
        if(graph[vertex][i] && visited[i] == 0){
            visited[i] = 1;
            if(dfs(i, graph, visited, inStack_Count + 1, n))
                return true;
            visited[i] = 0;
        }
    return false;
}
boolean check(boolean graph[][], int n){
    int[] visited = new int[n];
    for(int i = 0; i < n; i++)
        visited[i] = 0;
    for(int i = 0; i < n; i++){
        visited[i] = 1;
        if(dfs(i, graph, visited, 1, n))
            return true;
        visited[i] = 0;
    }
    return false;
}