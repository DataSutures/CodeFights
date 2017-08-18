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
14. [alternatingSums](#alternatingsums)
15. [addBorder](#addborder)
16. [areSimilar](#aresimilar)
17. [arrayChange](#arraychange)
18. [palindromeRearranging](#palindromerearranging)
19. [areEquallyStrong](#areequallystring)
20. [arrayMaximalAdjacentDifference](#arraymaximaladjacentdifference)
21. [isIPv4Address](#isip4vaddress)
22. [avoidObstacles](#avoidobstacles)
23. [boxBlur](#boxblur)
24. [minesweeper](#minesweeper)
25. [arrayReplace](#arrayreplace)
26. [evenDigitsOnly](#evendigitsonly)
27. [variableName](#variablename)
28. [alphabeticShift](#alphabeticshift)
29. [chessBoardCellColor](#chessboardcellcolor)
30. [circleOfNumbers](#circleofnumbers)
31. [depositProfit](#depositprofit)
32. [absoluteValuesSumMinimization](#absolutevaluessumminimization)
33. [stringsRearrangement](#stringsrearrangement)
34. [extractEachKth](#extracteachkth)  
35. [firstDigit](#firstdigit)  
36. [differentSymbolsNaive](#differentsymbolsnaive)
37. [arrayMaxConsecutiveSum](#arraymaxconsecutivesum)  
38. [growingPlant](#growingplant)  
39. [knapsackLight](#knapsacklight)  
40. [longestDigitsPrefix](#longestdigitsprefix)
41. [digitDegree](#digitdegree)
42. [bishopAndPawn](#bishopAndPawn)  



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
- **[input] integer param2**  

    *Guaranteed constraints:*
```Javascript
-100 ≤ param2 ≤ 1000
```
- **[output] integer**  
The sum of the two inputs.

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

- **[time limit] 3000ms (java)**  
- **[input] integer year**  

  A positive integer, designating the year.

  *Guaranteed constraints:*
```Javascript
1 ≤ year ≤ 2005.
```

- **[output] integer**  

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

- **[time limit] 3000ms (java)**  
- **[input] string inputString**  

  A non-empty string consisting of lowercase characters.

  *Guaranteed constraints:*
```Javascript
1 ≤ inputString.length ≤ 10^5
```

- **[output] boolean**  

  *true* if inputString is a palindrome, *false* otherwise.  

## adjacentElementsProduct
#### Description

Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.ding the year 100, the second - from the year 101 up to and including the year 200, etc.

#### Example

```Javascript
inputArray = [3, 6, -2, -5, 7, 3]
adjacentElementsProduct(inputArray) = 21
// 7 and 3 produce the largest product.
```

#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.integer inputArray**  

  An array of integers containing at least two elements.

  *Guaranteed constraints:*
```Javascript
2 ≤ inputArray.length ≤ 10
-1000 ≤ inputArray[i] ≤ 1000
```

- **[output] integer**  

  The largest product of adjacent elements.  

## shapeArea
#### Description
Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.

A 1-interesting polygon is just a square with a side of length 1. An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side. You can see the 1-, 2-, 3- and 4-interesting polygons in the picture below.
![alt text](https://codefightsuserpics.s3.amazonaws.com/tasks/shapeArea/img/area.png?_tm=1491302317375)
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

- **[time limit] 3000ms (java)**  
- **[input] integer n**  

    *Guaranteed constraints:*
```Javascript
1 ≤ n < 10^4
```

- **[output] integer**  
The area of the *n*-interesting polygon.  

## makeArrayConsecutive2
#### Description

Ratiorg got statues of *different* sizes as a present from CodeMaster for his birthday, each statue having an non-negative integer size. Since he likes to make things perfect, he wants to arrange them from smallest to largest so that each statue will be bigger than the previous one exactly by 1. He may need some additional statues to be able to accomplish that. Help him figure out the minimum number of additional statues needed.

#### Example

```Javascript
statues = [6, 2, 3, 8]
makeArrayConsecutive2(statues) = 3
```

#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.integer statues**  

  An array of distinct non-negative integers.

  *Guaranteed constraints:*
```Javascript
1 ≤ statues.length ≤ 10
0 ≤ statues[i] ≤ 20
```

- **[output] integer**  

  The minimal number of statues that need to be added to existing statues such that it contains every integer size from an interval [L, R] (for some L, R) and no other sizes.  

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

- **[time limit] 3000ms (java)**
- **[input] array.integer sequence**  

  *Guaranteed constraints:*
```Javascript
2 ≤ sequence.length ≤ 10^5
-105 ≤ sequence[i] ≤ 10^5
```

- **[output] boolean**  

  Return *true* if it is possible to remove one element from the array in order to get a strictly increasing sequence, otherwise return *false*.

## matrixElementsSum
#### Description
After becoming famous, CodeBots decided to move to a new building and live together. The building is represented by a rectangular matrix of rooms, each cell containing an integer - the price of the room. Some rooms are free (their cost is 0), but that's probably because they are haunted, so all the bots are afraid of them. That is why any room that is free or is located anywhere below a free room in the same column is not considered suitable for the bots.

Help the bots calculate the total price of all the rooms that are suitable for them.

#### Example

```Javascript
matrix = [[0, 1, 1, 2],
[0, 5, 0, 0],
[2, 0, 3, 3]]
matrixElementsSum(matrix) = 9
```
Here's the rooms matrix with unsuitable rooms marked with 'x':
```Javascript
[[x, 1, 1, 2],
[x, 5, x, x],
[x, x, x, x]]
```
Thus, the answer is: 1 + 5 + 1 + 2 = 9.
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input]  array.array.integer matrix**  
    2-dimensional array of integers representing a rectangular matrix of the building.

  *Guaranteed constraints:*
```Javascript
1 ≤ matrix.length ≤ 5
1 ≤ matrix[i].length ≤ 5
0 ≤ matrix[i][j] ≤ 10
```

- **[output] integer**  

## allLongestStrings
#### Description

Given an array of strings, return another array containing all of its longest strings.

#### Example
```Javascript
inputArray = ["aba", "aa", "ad", "vcd", "aba"]
allLongestStrings(inputArray) = ["aba", "vcd", "aba"]
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.string inputArray**  
    A non-empty array.

  *Guaranteed constraints:*
```Javascript
1 ≤ inputArray.length ≤ 10
1 ≤ inputArray[i].length ≤ 10
```

- **[output] array.string**  
  Array of the longest strings, stored in the same order as in the *inputArray*.

## commonCharacterCount
#### Description

Given two strings, find the number of common characters between them.

#### Example
```Javascript
s1 = "aabcc"
s2 = "adcaa"
commonCharacterCount(s1, s2) = 3
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] string s1**  
    A string consisting of lowercase latin letters a-z.  

  *Guaranteed constraints:*
```Javascript
1 ≤ s1.length ≤ 15
```
- **[input] string s1**  
A string consisting of lowercase latin letters a-z.  

  *Guaranteed constraints:*
```Javascript
1 ≤ s1.length ≤ 15
```

- **[output] integer**  

## isLucky
#### Description

Ticket numbers usually consist of an even number of digits. A ticket number is considered *lucky* if the sum of the first half of the digits is equal to the sum of the second half.

Given a ticket number *n*, determine if it's *lucky* or not.

#### Example
```Javascript
// Example 1
n = 1230
isLucky(n) = true
// Example 2
n = 239017
isLucky(n) = false
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] integer n**  
    A ticket number represented as a positive integer with an even number of digits.  

  *Guaranteed constraints:*
```Javascript
10 ≤ n < 10^6
```

- **[output] boolean**  
  *true* if *n* is a lucky ticket number, *false* otherwise.  

## sortByHeight
#### Description
Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees.
#### Example
```Javascript
a = [-1, 150, 190, 170, -1, -1, 160, 180]
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190]
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.integer a**  
    If a[i] = -1, then the *ith* position is occupied by a tree. Otherwise a[i] is the height of a person standing in the *ith* position.

  *Guaranteed constraints:*
```Javascript
5 ≤ a.length ≤ 15
-1 ≤ a[i] ≤ 200
```

- **[output]  array.integer**  
  Sorted array *a* with all the trees untouched.

## reverseParentheses
#### Description
You have a string *s* that consists of English letters, punctuation marks, whitespace characters, and brackets. It is guaranteed that the parentheses in *s* form a [regular bracket sequence](http://poj.org/problem?id=1141 "Parenthesis").

Your task is to reverse the strings contained in each pair of matching parentheses, starting from the innermost pair. The results string should not contain any parentheses.
#### Example
```Javascript
s = "a(bc)de"
reverseParentheses(s) = "acbde"
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] string s**  
    A string consisting of English letters, punctuation marks, whitespace characters and brackets. It is guaranteed that parentheses form a *regular bracket sequence*.

  *Guaranteed constraints:*
```Javascript
5 ≤ s.length ≤ 55
```

- **[output]  string**  

## alternatingSums
#### Description
Several people are standing in a row and need to be divided into two teams. The first person goes into *team 1*, the second goes into *team 2*, the third goes into *team 1* again, the fourth into *team 2*, and so on.

You are given an array of positive integers - the weights of the people. Return an array of two integers, where the first element is the total weight of *team 1*, and the second element is the total weight of *team 2* after the division is complete.
#### Example
```Javascript
a = [50, 60, 60, 45, 70]
alternatingSums(a) = [180, 105]
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.integer a**  

  *Guaranteed constraints:*
```Javascript
1 ≤ a.length ≤ 10
45 ≤ a[i] ≤ 100
```

- **[output]  array.integer**  

## addBorder
#### Description
Given a rectangular matrix of characters, add a border of asterisks(*) to it.
#### Example
```Javascript
picture = ["abc",
           "ded"]

addBorder(picture) = ["*****",
                      "*abc*",
                      "*ded*",
                      "*****"]
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.string picture**  
  A non-empty array of non-empty equal-length strings.
  *Guaranteed constraints:*
```Javascript
1 ≤ picture.length ≤ 5
1 ≤ picture[i].length ≤ 5
```

- **[output]  array.string**  
   The same matrix of characters, framed with a border of asterisks of width *1*.  

## areSimilar
#### Description
Two arrays are called *similar* if one can be obtained from another by swapping at most one pair of elements in one of the arrays.  
#### Example
```Javascript
// Example 1
a = [1, 2, 3]
b = [1, 2, 3]
areSimilar(a, b) = true
// The arrays are equal, no need to swap any elements.

// Example 2
a = [1, 2, 3]
b = [2, 1, 3]
areSimilar(a, b) = true
// We can obtain b from a by swapping 2 and 1 in b.

// Example 3
a = [1, 2, 2]
b = [2, 1, 1]
areSimilar(a, b) = false
//Any swap of any two elements either in a or in b won't make a and b equal.
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.integer a**  
  Array of integers.
  *Guaranteed constraints:*
```Javascript
3 ≤ a.length ≤ 10^5
1 ≤ a[i] ≤ 1000
```
- **[input] array.integer b**  
  Array of integers of the same length as *a*.
  *Guaranteed constraints:*
```Javascript
b.length = a.length
1 ≤ b[i] ≤ 1000
```

- **[output]  boolean**  
   *true* if *a* and *b* are similar, *false* otherwise.  

## arrayChange
#### Description
You are given an array of integers. On each move you are allowed to increase exactly one of its element by one. Find the minimal number of moves required to obtain a strictly increasing sequence from the input.
#### Example
```Javascript
inputArray = [1, 1, 1]
arrayChange(inputArray) = 3
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.integer inputArray**  

  *Guaranteed constraints:*
```Javascript
3 ≤ inputArray.length ≤ 10^5
-10^5 ≤ inputArray[i] ≤ 10^5
```

- **[output]  integer**  
   The minimal number of moves needed to obtain a strictly increasing sequence from *inputArray*.
It's guaranteed that for the given test cases the answer always fits signed *32*-bit integer type.  

## palindromeRearranging
#### Description
Given a string, find out if its characters can be rearranged to form a [palindrome](https://en.wikipedia.org/wiki/Palindrome "Palindrome").
#### Example
```Javascript
inputString = "aabb"
palindromeRearranging(inputString) = true
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] string inputString**  
  A string consisting of lowercase English letters.  

  *Guaranteed constraints:*
```Javascript
1 ≤ inputString.length ≤ 50
```

- **[output]  boolean**  
  *true* if the characters of the *inputString* can be rearranged to form a palindrome, *false* otherwise.  

## areEquallyStrong
#### Description
Call two arms *equally* strong if the heaviest weights they each are able to lift are equal.

Call two people *equally* strong if their strongest arms are equally strong (the strongest arm can be both the right and the left), and so are their weakest arms.

Given your and your friend's arms' lifting capabilities find out if you two are equally strong.


#### Example
```Javascript
// Example 1
yourLeft = 10
yourRight = 15
friendsLeft = 15
friendsRight = 10
areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight) = true

// Example 2
yourLeft = 15
yourRight = 10
friendsLeft = 15
friendsRight = 10
areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight) = true

// Example
yourLeft = 15
yourRight = 10
friendsLeft = 15
friendsRight = 9
areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight) = false

```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] integer yourLeft**  
  A non-negative integer representing the heaviest weight you can lift with your left arm.

  *Guaranteed constraints:*
```Javascript
0 ≤ yourLeft ≤ 20
```
- **[input] integer yourRight**  
  A non-negative integer representing the heaviest weight you can lift with your right arm.

  *Guaranteed constraints:*
```Javascript
0 ≤ yourRight ≤ 20
```
- **[input] integer friendsLeft**  
  A non-negative integer representing the heaviest weight your friend can lift with his or her left arm.

  *Guaranteed constraints:*
```Javascript
0 ≤ friendsLeft ≤ 20
```
- **[input] integer friendsRight**  
  A non-negative integer representing the heaviest weight your friend can lift with his or her right arm.

  *Guaranteed constraints:*
```Javascript
0 ≤ friendsRight ≤ 20
```
- **[output]  boolean**  
  *true* if you and your friend are equally strong, *false* otherwise.  

## arrayMaximalAdjacentDifference
#### Description
Given an array of integers, find the maximal absolute difference between any two of its adjacent elements.  
#### Example
```Javascript
inputArray = [2, 4, 1, 0]
arrayMaximalAdjacentDifference(inputArray) = 3
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.integer inputArray**  

  *Guaranteed constraints:*
```Javascript
3 ≤ inputArray.length ≤ 10,
-15 ≤ inputArray[i] ≤ 15
```

- **[output]  integer**  
  The maximal absolute difference.  

## isIPv4Address
#### Description
An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the *IPv4 address*.

IPv4 addresses are represented in dot-decimal notation, which consists of four decimal numbers, each ranging from *0* to *255*, separated by dots, e.g., 172.16.254.1.

Given a string, find out if it satisfies the IPv4 address naming rules.
#### Example
```Javascript
// Example 1
inputString = "172.16.254.1"
isIPv4Address(inputString) = true

// Example 2
inputString = "172.316.254.1"
isIPv4Address(inputString) = false
// 316 is not in range [0, 255]

// Example 3
inputString = ".254.255.0"
isIPv4Address(inputString) = false
// There is no first number.
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] string inputString**  
  A string consisting of digits, full stops and lowercase Latin letters.  

  *Guaranteed constraints:*
```Javascript
5 ≤ inputString.length ≤ 15
```

- **[output]  boolean**  
  *true* if *inputString* satisfies the IPv4 address naming rules, *false* otherwise.  

## avoidObstacles
#### Description
You are given an array of integers representing coordinates of obstacles situated on a straight line.

Assume that you are jumping from the point with coordinate 0 to the right. You are allowed only to make jumps of the same length represented by some integer.

Find the minimal length of the jump enough to avoid all the obstacles.
#### Example
```Javascript
inputArray = [5, 3, 6, 7, 9]
avoidObstacles(inputArray) = 4
```
Check out the image below for better understanding:

![allt text](https://codefightsuserpics.s3.amazonaws.com/tasks/avoidObstacles/img/example.png?_tm=1490625560816)
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.integer inputArray**  
  Non-empty array of positive integers.

  *Guaranteed constraints:*
```Javascript
2 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i] ≤ 40
```

- **[output]  integer**  
  The desired length.  

## boxBlur
#### Description
Last night you had to study, but decided to party instead. Now there is a black and white photo of you that is about to go viral. You cannot let this ruin your reputation, so you want to apply *box blur* algorithm to the photo to hide its content.

The algorithm works as follows: each pixel *x* in the resulting image has a value equal to the average value of the input image pixels' values from the *3 × 3* square with the center at *x*. All pixels at the edges are cropped.

As pixel's value is an integer, all fractions should be rounded down.  

#### Example
```Javascript
image = [[1, 1, 1],
         [1, 7, 1],
         [1, 1, 1]]

boxBlur(image) = [[1]]
```
In the given example all boundary pixels were cropped, and the value of the pixel in the middle was obtained as (1 + 1 + 1 + 1 + 7 + 1 + 1 + 1 + 1) / 9 = 15 / 9 = *~rounded down~* = 1.
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.array.integer image**  
  An image is stored as a rectangular matrix of non-negative integers.  

  *Guaranteed constraints:*
```Javascript
3 ≤ image.length ≤ 10,
3 ≤ image[0].length ≤ 10,
0 ≤ image[i][j] ≤ 255
```

- **[output]  array.array.integer**  
  A blurred image.  

## minesweeper
#### Description
In the popular **Minesweeper** game you have a board with some mines and those cells that don't contain a mine have a number in it that indicates the total number of mines in the neighboring cells. Starting off with some arrangement of mines we want to create a **Minesweeper** game setup.
#### Example
```Javascript
matrix = [[true, false, false],
          [false, true, false],
          [false, false, false]]

minesweeper(matrix) = [[1, 2, 1],
                       [2, 1, 1],
                       [1, 1, 1]]
```
Check out the image below for better understanding:

![minesweeper](https://codefightsuserpics.s3.amazonaws.com/tasks/minesweeper/img/example.png?_tm=1490636350838)
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.array.boolean matrix**  
  A non-empty rectangular matrix consisting of boolean values - *true* if the corresponding cell contains a mine, *false* otherwise.

  *Guaranteed constraints:*
```Javascript
2 ≤ matrix.length ≤ 5,
2 ≤ matrix[0].length ≤ 5
```

- **[output]  array.array.integer**  
  Rectangular *matrix* of the same size as matrix each cell of which contains an integer equal to the number of mines in the neighboring cells. Two cells are called neighboring if they share at least one corner.  

## arrayReplace
#### Description
Given an array of integers, replace all the occurrences of *elemToReplace* with *substitutionElem*.

#### Example
```Javascript
inputArray = [1, 2, 1]
elemToReplace = 1
substitutionElem = 3
arrayReplace(inputArray, elemToReplace, substitutionElem) = [3, 2, 3]
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.integer inputArray**  

  *Guaranteed constraints:*
```Javascript
2 ≤ inputArray.length ≤ 10,
0 ≤ inputArray[i] ≤ 10
```
- **[input] integer elemToReplace**  

  *Guaranteed constraints:*
```Javascript
0 ≤ elemToReplace ≤ 10
```
- **[input] integer substitutionElem**  

  *Guaranteed constraints:*
```Javascript
0 ≤ substitutionElem ≤ 10
```
- **[output]  array.integer**  


## evenDigitsOnly
#### Description
Check if all digits of the given integer are even.  
#### Example
```Javascript
// Example 1
n = 248622
evenDigitsOnly(n) = true

// Example 2
n = 642386
evenDigitsOnly(n) = false
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] integer n**  

  *Guaranteed constraints:*
```Javascript
1 ≤ n ≤ 10^9
```

- **[output]  boolean**  
  *true* if all digits of n** are even, *false* otherwise.

## variableName
#### Description
Correct variable names consist only of Latin letters, digits and underscores and they can't start with a digit.

Check if the given string is a correct variable name.  
#### Example
```Javascript
// Example 1
name = "var_1__Int"
variableName(name) = true

// Example 2
name = "qq-q"
variableName(name) = false

// Example 3
name = "2w2"
variableName(name) = false
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] string name**  

  *Guaranteed constraints:*
```Javascript
1 ≤ name.length ≤ 10
```

- **[output]  boolean**  
  *true* if *name* is a correct variable name, *false* otherwise.  

## alphabeticShift
#### Description
Given a string, replace each its character by the next one in the English alphabet (*z* would be replaced by *a*).
#### Example
```Javascript
// Example 1
inputString = "crazy"
alphabeticShift(inputString) = "dsbaz"
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] string inputString**  
  Non-empty string consisting of lowercase English characters.  

  *Guaranteed constraints:*
```Javascript
1 ≤ inputString.length ≤ 10
```

- **[output]  string**  
  The result string after replacing all of its characters.  

## chessBoardCellColor
#### Description
Given two cells on the standard chess board, determine whether they have the same color or not.
#### Example
```Javascript
// Example 1
cell1 = "A1"
cell2 = "C3"
chessBoardCellColor(cell1, cell2) = true
```
![chessExample1](https://codefightsuserpics.s3.amazonaws.com/tasks/chessBoardCellColor/img/example1.png?_tm=1494338560912)
```Javascript
// Example 2
cell1 = "A1"
cell2 = "H3"
chessBoardCellColor(cell1, cell2) = false
```
![alt text](https://codefightsuserpics.s3.amazonaws.com/tasks/chessBoardCellColor/img/example2.png?_tm=1494338561188)
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] string cell1**  
- **[input] string cell2**
- **[output]  boolean**  
  *true* if both cells have the same color, *false* otherwise.  


## circleOfNumbers
#### Description
Consider integer numbers from *0* to *n - 1* written down along the circle in such a way that the distance between any two neighbouring numbers is equal (note that (*0* and *n - 1* are neighbouring, too).

Given *n* and *firstNumber*, find the number which is written in the radially opposite position to *firstNumber*.
#### Example
```Javascript
// Example 1
n = 10
firstNumber = 2
circleOfNumbers(n, firstNumber) = 7
```
![alt text](https://codefightsuserpics.s3.amazonaws.com/tasks/circleOfNumbers/img/example.png?_tm=1490625697098)
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] integer n**  
  A positive **even** integer.  

  *Guaranteed constraints:*
```Javascript
4 ≤ n ≤ 20
```
- **[input] integer firstNumber**  

  *Guaranteed constraints:*
```Javascript
0 ≤ firstNumber ≤ n - 1
```
- **[output]  integer**  

## depositProfit
#### Description
You have deposited a specific amount of dollars into your bank account. Each year your balance increases at the same growth *rate*. Find out how long it would take for your balance to pass a specific *threshold* with the assumption that you don't make any additional deposits.
#### Example
```Javascript
deposit = 100
rate = 20
threshold = 170
depositProfit(deposit, rate, threshold) = 3
```
Each year the amount of money on your account increases by *20%*. It means that throughout the years your balance would be:
- year 0: 100;
- year 1: 120;
- year 2: 144;
- year 3: 172,8.  

Thus, it will take *3* years for your balance to pass the *threshold*, which is the answer.


#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] integer deposit**  
  The initial deposit as a positive integer.

  *Guaranteed constraints:*
```Javascript
41 ≤ deposit ≤ 100
```
- **[input] integer rate**  
    The rate of increase. Each year the balance increases by the rate percent of the current sum.  

  *Guaranteed constraints:*
```Javascript
1 ≤ rate ≤ 100.
```
- **[output]  integer**  
   The number of years it would take to hit the *threshold*.  


## absoluteValuesSumMinimization
#### Description
Given a sorted array of integers *a*, find an integer *x* from *a* such that the value of
```Javascript
abs(a[0] - x) + abs(a[1] - x) + ... + abs(a[a.length - 1] - x)
```
is the *smallest* possible (here *abs* denotes the absolute value).
If there are several possible answers, output the *smallest* one.
#### Example
```Javascript
a = [2, 4, 7]
absoluteValuesSumMinimization(a) = 4
```
Image:
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.integer a**  
  A non-empty array of integers, sorted in ascending order.

  *Guaranteed constraints:*
```Javascript
1 ≤ a.length ≤ 200,
-10^6 ≤ a[i] ≤ 10^6
```
- **[output]  integer**  

## stringsRearrangement
#### Description
Given an array of equal-length strings, check if it is possible to rearrange the strings in such a way that after the rearrangement the strings at consecutive positions would differ by exactly one character.
#### Example
```Javascript
// Example 1
inputArray = ["aba", "bbb", "bab"]
stringsRearrangement(inputArray) = false
// All rearrangements don't satisfy the description condition.

// Example 2
inputArray = ["ab", "bb", "aa"]
stringsRearrangement(inputArray) = true
// Strings can be rearranged in the following way: "aa", "ab", "bb".
```
Image:
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.string inputArray**  
  A non-empty array of strings of lowercase letters.

  *Guaranteed constraints:*
```Javascript
2 ≤ inputArray.length ≤ 10,
1 ≤ inputArray[i].length ≤ 15
```
- **[output]  boolean**  

## extractEachKth
#### Description
Given array of integers, remove each *kth* element from it.
#### Example
```Javascript
inputArray = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
k = 3
extractEachKth(inputArray, k) = [1, 2, 4, 5, 7, 8, 10]
```  
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.integer inputArray**  

  *Guaranteed constraints:*
```Javascript
5 ≤ inputArray.length ≤ 15
-20 ≤ inputArray[i] ≤ 20
```
- **[input] integer k**  
*Guaranteed constraints:*
```Javascript
1 ≤ k ≤ 10
```
- **[output]  array.integer**  
*inputArray* without elements k - 1, 2k - 1, 3k - 1 etc.  

## firstDigit
#### Description
Find the leftmost digit that occurs in a given string.
#### Example
```Javascript
// Example 1
inputString = "var_1__Int";
firstDigit(inputString) = '1';

// Example 2
inputString = "q2q-q";
firstDigit(inputString) = '2';

// Example 3
inputString = "0ss";
firstDigit(inputString) = '0';
```  
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] string inputString**  
A string containing at least one digit.  

  *Guaranteed constraints:*
```Javascript
3 ≤ inputString.length ≤ 10
```
- **[output]  char**  

## differentSymbolsNaive
#### Description
Given a string, find the number of different characters in it.
#### Example
```Javascript
s = "cabca";
differentSymbolsNaive(s) = 3;
```  
There are *3* different characters *a*, *b* and *c*.
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] string s**  
A string of lowercase latin letters.

  *Guaranteed constraints:*
```Javascript
3 ≤ s.length ≤ 15
```
- **[output]  integer**  

## arrayMaxConsecutiveSum
#### Description
Given array of integers, find the maximal possible sum of some of its *k* consecutive elements.
#### Example
```Javascript
inputArray = [2, 3, 5, 1, 6]
k = 2
arrayMaxConsecutiveSum(inputArray, k) = 8
```  
All possible sums of *2* consecutive elements are:
```Javascript
2 + 3 = 5;
3 + 5 = 8;
5 + 1 = 6;
1 + 6 = 7;
// Thus, the answer is 8.
```
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] array.integer inputArray**  
Array of positive integers.  

  *Guaranteed constraints:*
```Javascript
3 ≤ inputArray.length ≤ 10^5
1 ≤ inputArray[i] ≤ 1000
```
- **[input] integer k**  
An integer (not greater than the length of *inputArray*).  

  *Guaranteed constraints:*
```Javascript
1 ≤ k ≤ inputArray.length
```  
- **[output]  integer**  
The maximal possible sum.  

## growingPlant
#### Description
Each day a plant is growing by *upSpeed* meters. Each night that plant's height decreases by *downSpeed* meters due to the lack of sun heat. Initially, plant is 0 meters tall. We plant the seed at the beginning of a day. We want to know when the height of the plant will reach a certain level.
#### Example
```Javascript
upSpeed = 100
downSpeed = 10
desiredHeight = 910
growingPlant(upSpeed, downSpeed, desiredHeight) = 10
```  

#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] integer upSpeed**  
A positive integer representing the daily growth.  

  *Guaranteed constraints:*
```Javascript
5 ≤ upSpeed ≤ 100
```
- **[input] integer downSpeed**  
A positive integer representing the nightly growth.  

  *Guaranteed constraints:*
```Javascript
2 ≤ downSpeed ≤ upSpeed
```

- **[input]  integer desiredHeight**  

  *Guaranteed constraints:*
```Javascript
4 ≤ desiredHeight ≤ 1000
```  
- **[output] integer**  
The number of days that it will take for the plant to reach/pass *desiredHeight* (including the last day in the total count).  

## knapsackLight
#### Description
You found two items in a treasure chest! The first item weighs *weight1* and is worth *value1*, and the second item weighs *weight2* and is worth *value2*. What is the total maximum value of the items you can take with you, assuming that your max weight capacity is *maxW* and you can't come back for the items later?

**Note** that there are only two items and you can't bring more than one item of each type, i.e. you can't take two first items or two second items.
#### Example
```Javascript
// Example 1
value1 = 10
weight1 = 5
value2 = 6
weight2 = 4
maxW = 8
knapsackLight(value1, weight1, value2, weight2, maxW) = 10
// You're strong enough to take both of the items with you.  

// Example 2
value1 = 10
weight1 = 5
value2 = 6
weight2 = 4
maxW = 9
knapsackLight(value1, weight1, value2, weight2, maxW) = 16  
// You can only carry the first item.  

// Example 3
value1 = 5
weight1 = 3
value2 = 7
weight2 = 4
maxW = 6
knapsackLight(value1, weight1, value2, weight2, maxW) = 7  
// You can't take both items, but you can take any of them.
```  
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] integer value1**  

  *Guaranteed constraints:*
```Javascript
2 ≤ value1 ≤ 20
```
- **[input] integer weight1**  

  *Guaranteed constraints:*
```Javascript
2 ≤ weight1 ≤ 10
```  
- **[input] integer value2**  

  *Guaranteed constraints:*
```Javascript
2 ≤ value2 ≤ 20
```  
- **[input] integer weight2**  

  *Guaranteed constraints:*
```Javascript
2 ≤ weight2 ≤ 10
```
- **[input] integer maxW**  

  *Guaranteed constraints:*
```Javascript
1 ≤ maxW ≤ 20
```
- **[output]  integer**  

## longestDigitsPrefix
#### Description
Given a string, output its longest [prefix](keyword://string-prefix "prefix") which contains only digits.
#### Example
```Javascript
inputString="123aa1";
longestDigitsPrefix(inputString) = "123";
```  
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] string inputString**  

  *Guaranteed constraints:*
```Javascript
3 ≤ inputString.length ≤ 35
```
- **[output]  string**  

## digitDegree
#### Description
Let's define *digit degree* of some positive integer as the number of times we need to replace this number with the sum of its digits until we get to a one digit number.

Given an integer, find its digit degree.
#### Example
```Javascript
// Example 1
n = 5;
digitDegree(n) = 0;

// Example 2
n = 100;
digitDegree(n) = 1;
// 1 + 0 + 0 = 1

// Example 3
n = 91;
digitDegree(n) = 2;
// 9 + 1 = 10 -> 1 + 0 = 1  
```  
#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] integer n**  

  *Guaranteed constraints:*
```Javascript
5 ≤ n ≤ 10^9
```
- **[output]  integer**  

## bishopAndPawn
#### Description
Given the positions of a white *bishop* and a black *pawn* on the standard chess board, determine whether the bishop can capture the pawn in one move.

The bishop has no restrictions in distance for each move, but is limited to diagonal movement. Check out the example below to see how it can move:
![bishopPawn1](https://codefightsuserpics.s3.amazonaws.com/tasks/bishopAndPawn/img/bishop.jpg?_tm=1493360096740)

#### Example
```Javascript
// Example 1
bishop = "a1"
pawn = "c3"
bishopAndPawn(bishop, pawn) = true
```
![bishopPawn2](https://codefightsuserpics.s3.amazonaws.com/tasks/bishopAndPawn/img/ex1.jpg?_tm=1493360096945)
```Javascript
// Example 2
bishop = "h1"
pawn = "h3"
bishopAndPawn(bishop, pawn) = false
```
![bishopPawn3](https://codefightsuserpics.s3.amazonaws.com/tasks/bishopAndPawn/img/ex2.jpg?_tm=1493360097459)


#### Input/Output

- **[time limit] 3000ms (java)**  
- **[input] string bishop**  
Coordinates of the white bishop in the [chess notation](keyword://chess-notation "chess notation").
- **[input] string pawn**
Coordinates of the black pawn in the same notation.
- **[output]  boolean**  
