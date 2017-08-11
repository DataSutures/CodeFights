int centuryFromYear(int year) {
    int century = year / 100;
    if ((year % 100) > 0)
        century++;
    return century;
}
