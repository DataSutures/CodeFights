## Description

Given a string, check if it is a [palindrome](https://en.wikipedia.org/wiki/Palindrome "Palindrome").

## Example

```Javascript
// Example 1
inputString = "aabaa"
checkPalindrome(inputString) = true;
// Example 2
inputString = "abac"
checkPalindrome(inputString) = false;
// Example 3
inputString = "a"
checkPalindrome(inputString) = true;
```

## Input/Output

- **[time limit] 3000ms (java)** <br>
- **[input] string inputString** <br>

	A non-empty string consisting of lowercase characters.

	*Guaranteed constraints:* <br>
	```Javascript
	1 ≤ inputString.length ≤ 105
	```

- **[output] boolean** <br>

	```Javascript
	if(isPalindrome(inputString)){
		return true;
		}
	else{
		return false;
		}
	```

## Solutions
### My Solution
#### Java
    true if inputString is a palindrome, false otherwise.
