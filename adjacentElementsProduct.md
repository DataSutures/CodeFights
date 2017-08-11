## Description

Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.ding the year 100, the second - from the year 101 up to and including the year 200, etc.

## Example

```Javascript
inputArray = [3, 6, -2, -5, 7, 3]
adjacentElementsProduct(inputArray) = 21
```
7 and 3 produce the largest product.

## Input/Output

- **[time limit] 3000ms (java)** <br>
- **[input] array.integer inputArray** <br>

	An array of integers containing at least two elements.

	*Guaranteed constraints:* <br>
	```Javascript
	2 ≤ inputArray.length ≤ 10
	-1000 ≤ inputArray[i] ≤ 1000
	```

- **[output] integer** <br>

	The largest product of adjacent elements.

## Solutions
### My Solution
#### Java
```Javascript
int adjacentElementsProduct(int[] inputArray) {
    int max = inputArray[0] * inputArray[1];
    for(int i =1; i <= inputArray.length - 2; i++){
        int product = inputArray[i] * inputArray[i+1];
        if(product > max){
            max = product;
        }
    }
    return max;
}
```
