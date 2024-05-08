# Difference of times

## Description
Find _how many seconds_ passed between the two moments of time on the same day.

You are given the integer values representing these moments: hours, minutes and seconds for each of them. It is guaranteed that the earlier moment goes first in the input.

**Input data format**

The program gets the input of six integers: three defining the first moment of time in hours, minutes, seconds, and the other three defining the second one.

For example, six numbers 1, 2, 30, 15, 21, 1 will represent two moments of time: _1:02:30 am_ and _3:21:01 pm_ (or just _15:21:01_).

**Output data format**

Just one number: **seconds** between these two moments of time. It's 51511 (14 hours, 18 minutes and 31 seconds) in our example.

## Examples
**Sample Input 1:**
```console
1
1
1
2
2
2
```

**Sample Output 1:**
```console
3661
```

**Sample Input 2:**
```console
1
2
30
1
3
20
```

**Sample Output 2:**
```console
50
```

## Tags
- basics
- operations on primitive types
- integer types and operations

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)