int sumUpNumbers(String inputString) {
    try {
        return Arrays
               .stream(inputString
                       .replaceAll("\\D+", " ")
                       .trim()
                       .split(" ")
                      )
               .flatMapToInt(n-> IntStream.of(Integer.parseInt(n)))
               .sum();
    }
    catch (NumberFormatException e){
        return 0;
    }
}
