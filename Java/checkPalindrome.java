boolean checkPalindrome(String inputString) {
	StringBuilder sBuilder = new StringBuilder(inputString);
	return inputString.equals(sBuilder.reverse().toString());
}