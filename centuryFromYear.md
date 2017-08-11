## Description

Given a year, return the century it is in. The first century spans from the year 1 up to and including the year 100, the second - from the year 101 up to and including the year 200, etc.

## Example

```Javascript
//Example 1
year = 1905
centuryFromYear(year) = 20

//Example 2
year = 1700
centuryFromYear(year) = 17
```

## Input/Output

- **[time limit] 3000ms (java)** <br>
- **[input] integer year** <br>

	A positive integer, designating the year.

	*Guaranteed constraints:* <br>
	```Javascript
	1 ≤ year ≤ 2005.
	```

- **[output] integer** <br>

	The number of the century the year is in.

## Solutions
### My Solution
#### Java
```Javascript
int centuryFromYear(int year) {
    int century = year / 100;
    if ((year % 100) > 0)
        century++;
    return century;
}
```
