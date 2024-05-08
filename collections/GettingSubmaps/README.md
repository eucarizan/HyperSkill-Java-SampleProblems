# Getting submaps

## Description
Write a program that reads key-value pairs and outputs pairs whose keys belong to the specified range (inclusive) in the ascending order by the key.

**Input data format**

The first line contains two values that represent range borders. The second line contains the number of key-value pairs. Next lines contain pairs (an integer key and a string value separated by a space).

**Output data format**

All pairs whose keys belong to the range, each pair in a new line. The key and the value of a pair must be separated by a space.

## Examples
**Sample Input 1:**
```console
2 4
5
1 aa
5 ee
2 bb
4 dd
3 cc
```

**Sample Output 1:**
```console
2 bb
3 cc
4 dd
```

## Tags
- working with data
- collections
- collections framework

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)