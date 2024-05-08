# The integer barrier

## Description
Write a program that inputs a sequence of integer numbers in a loop and calculates their sum under the following conditions:

1. if a new number is 0, the program must stop the loop and output the accumulated sum;
2. if the sum is equal to or exceeds the limit of 1000, the program must also stop reading the numbers and output the value equal to the sum minus 1000.

## Examples
**Sample Input 1:**
```console
800
101
102
300
0
```

**Sample Output 1:**
```console
3
```

**Sample Input 2:**
```console
103
105
109
0
1000
```

**Sample Output 2:**
```console
317
```

## Tags
- basics
- control flow statements
- branching statements

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)