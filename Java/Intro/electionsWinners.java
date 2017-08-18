int electionsWinners(int[] votes, int k) {
    int max = 0;
    int count = 0;
    for (int i = 0; i < votes.length; i++){
        max = Math.max(max, votes[i]);
    }
    int lead = 0;
    for (int candidate: votes){
        if (candidate == max)  lead++;
        if (candidate + k > max)
            count++;
    }
    if (lead == 1 && count == 0){
        return 1;
    }
    return count;
}
