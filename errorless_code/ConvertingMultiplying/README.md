# Converting and multiplying

## Description
Your task is to write a program that reads a sequence of strings and converts them to integer numbers, multiplying by 10. Some input strings may have an invalid format, for instance: "abc". The sequence length may be different. Its ending is indicated by “0”. Zero serves as a stop character and should not be included in the sequence.

If a string can be converted to an integer number, output the number multiplied by 10. Otherwise, output the string "**Invalid user input: X**" where X is the input string. To better understand the scenario, see the examples below.

To implement this logic, use the exception handling mechanism.

**Input data format:**

A sequence of integer numbers and other strings, each on a new line.

**Output data format:**

A sequence of integer numbers and warnings, each on a new line.

## Examples
**Sample Input 1:**
```console
11
12
13
0
```

**Sample Output 1:**
```console
110
120
130
```

**Sample Input 2:**
```console
11
abc
13
0
```

**Sample Output 2:**
```console
110
Invalid user input: abc
130
```

## Tags
- errorless code
- exception handling

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)