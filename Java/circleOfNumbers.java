int circleOfNumbers(int n, int firstNumber) {
    int mid = n / 2;
    if (firstNumber >= mid) {
        return Math.abs(mid - firstNumber);
    }
    return mid + firstNumber;
}