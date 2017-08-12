# CodeFights
Solutions for challenges proposed on CodeFights.com/arcade

## Challenges

1. [add](#add)
2. [centuryFromYear](#centuryfromyear)
3. [checkPalindrome](#checkpalindrome)
4. [adjacentElementsProduct](#adjacentelementsproduct)
5. [shapeArea](#shapearea)
6. [makeArrayConsecutive2](#makearrayconsec)
7. [almostIncreasingSequence](#almostincreasingsequence)
8. [matrixElementsSum](#matrixelementssum)
9. [allLongestStrings](#alllongeststrings)
10. [commonCharacterCount](#commoncharactercount)
11. [isLucky](#islucky)
12. [sortByHeight](#sortbyheight)
13. [reverseParentheses](#reverseparentheses)
14. [alternatingSums](alternatingsums)
15. [addBorder](addborder)
16. [areSimilar](aresimilar)
17. [arrayChange](arraychange)
18. [palindromeRearranging](palindromerearranging)
19. [areEquallyStrong](areequallystring)
20. [arrayMaximalAdjacentDifference](arraymaximaladjacentdifference)
21. [isIPv4Address](isip4vaddress)
22. [avoidObstacles](avoidobstacles)
23. [boxBlur](boxblur)
24. [minesweeper](minesweeper)
25. [arrayReplace](arrayreplace)
26. [evenDigitsOnly](evendigitsonly)
27. [variableName](variablename)
28. [alphabeticShift](alphabeticshift)
29. [chessBoardCellColor](chessboardcellcolor)
30. [circleOfNumbers](circleofnumbers)
31. [depositProfit](depositprofit)
32. [absoluteValuesSumMinimization](absolutevaluessumminimization)
33. [stringsRearrangement](stringsrearrangement)

## absoluteValuesSumMinimization

## add
#### Description

Write a function that returns the sum of two numbers.

#### Example:

```Javascript
param1 = 1
param2 = 2
add(param1, param2) = 3.
```

#### Input/Output

- **[time limit] 3000ms (java)**
- **[input] integer param1**

    *Guaranteed constraints:* 
```Javascript
-100 ≤ param1 ≤ 1000
```
- **[input] integer param2** <br>

    *Guaranteed constraints:* 
```Javascript
-100 ≤ param2 ≤ 1000
```
- **[output] integer** <br>
The sum of the two inputs.

## addBorder
## adjacentElementsProduct
#### Description

Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.ding the year 100, the second - from the year 101 up to and including the year 200, etc.

#### Example

```Javascript
inputArray = [3, 6, -2, -5, 7, 3]
adjacentElementsProduct(inputArray) = 21
```
7 and 3 produce the largest product.

#### Input/Output

- **[time limit] 3000ms (java)** <br>
- **[input] array.integer inputArray** <br>

An array of integers containing at least two elements.

*Guaranteed constraints:*
```Javascript
2 ≤ inputArray.length ≤ 10
-1000 ≤ inputArray[i] ≤ 1000
```

- **[output] integer** <br>

The largest product of adjacent elements.

## allLongestStrings
## almostIncreasingSequence
#### Description

Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence by removing no more than one element from the array.

#### Example

```Javascript
// Example 1
sequence = [1, 3, 2, 1]
almostIncreasingSequence(sequence) = false
// There is no one element in this array that can be removed in order to get a strictly increasing
// sequence.

// Example 2
sequence = [1, 3, 2]
almostIncreasingSequence(sequence) = true
// You can remove 3 from the array to get the strictly increasing sequence [1, 2]. Alternately, you
// can remove 2 to get the strictly increasing sequence [1, 3].
```


#### Input/Output

- **[time limit] 3000ms (java)** <br>
- **[input] array.integer sequence** <br>

*Guaranteed constraints:*
```Javascript
2 ≤ sequence.length ≤ 105
-105 ≤ sequence[i] ≤ 105
```

- **[output] boolean** <br>

Return *true* if it is possible to remove one element from the array in order to get a strictly increasing sequence, otherwise return *false*.

## alphabeticShift
## alternatingSums
## areEquallyStrong
## areSimilar
## arrayChange
## arrayMaximalAdjacentDifference
## arrayReplace
## avoidObstacles
## boxBlur

## centuryFromYear
#### Description

Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100, the second - from the year 101 up to and including the year 200, etc.

#### Example

```Javascript
//Example 1
year = 1905
centuryFromYear(year) = 20

//Example 2
year = 1700
centuryFromYear(year) = 17
```

#### Input/Output

- **[time limit] 3000ms (java)** <br>
- **[input] integer year** <br>

A positive integer, designating the year.

*Guaranteed constraints:*
```Javascript
1 ≤ year ≤ 2005.
```

- **[output] integer** <br>

The number of the century the year is in.

## checkPalindrome
#### Description

Given a string, check if it is a [palindrome](https://en.wikipedia.org/wiki/Palindrome "Palindrome").

#### Example

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

#### Input/Output

- **[time limit] 3000ms (java)** <br>
- **[input] string inputString** <br>

A non-empty string consisting of lowercase characters.

*Guaranteed constraints:*
```Javascript
1 ≤ inputString.length ≤ 105
```

- **[output] boolean** <br>

*true* if inputString is a palindrome, *false* otherwise.

## chessBoardCellColor
## circleOfNumbers
## commonCharacterCount
## depositProfit
## evenDigitsOnly
## isIPv4Address
## isLucky
## makeArrayConsecutive2
#### Description

Ratiorg got statues of *different* sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.

#### Example

```Javascript
statues = [6, 2, 3, 8]
makeArrayConsecutive2(statues) = 3
```

#### Input/Output

- **[time limit] 3000ms (java)** <br>
- **[input] array.integer statues** <br>

An array of distinct non-negative integers.

*Guaranteed constraints:* 

```Javascript
1 ≤ statues.length ≤ 10
0 ≤ statues[i] ≤ 20
```

- **[output] integer** <br>

The minimal number of statues that need to be added to existing statues such that it contains every integer size from an interval [L, R] (for some L, R) and no other sizes.

## matrixElementsSum
## minesweeper
## palindromeRearranging
## reverseParentheses
## shapeArea
### Description
Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
#### Example

```Javascript
// Example 1
n = 2
shapeArea(n) = 5
// Example 2
n = 3
shapeArea(n) = 13
```
#### Input/Output

- **[time limit] 3000ms (java)** <br>
- **[input] integer n** <br>

    *Guaranteed constraints:*
```Javascript
1 ≤ n < 104
```

- **[output] integer** <br>
The area of the n-interesting polygon.


## sortByHeight
## stringsRearrangement
## variableName










