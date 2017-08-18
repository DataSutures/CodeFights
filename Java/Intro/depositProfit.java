int depositProfit(int deposit, int rate, int threshold) {
    int year = 0;
    double dDeposit = (double) deposit;
    while (dDeposit < threshold){
        dDeposit *= 1 + (double)rate/100;
        year++;
    }
    return year;
}