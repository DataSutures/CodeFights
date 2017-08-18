boolean validTime(String time) {
    int hour = Integer.valueOf(time.substring(0, 2)); 
    int min = Integer.valueOf(time.substring(3, 5)) ;
    return hour >= 0 && hour < 24 && min >= 0 && min < 60;
}
