# Collatz conjecture

## Description
Given natural number **n** not exceeding 1_000_000, generate a sequence of integers, described in the Collatz conjecture:

If n is an even number, divide it in half; if it is odd, multiply it by **3** and add **1**. Repeat this operation until we get the number **1** as a result.

For example, if the number **n = 17**, then the sequence looks as the following:

```
17 52 26 13 40 20 10 5 16 8 4 2 1
```

It was proved that such a sequence will stop at number **1** for any initial natural number n up to 2<sup>68</sup>.

**Output format:**
Sequence of integers in a single line, separated by spaces.

## Examples
**Sample Input 1:**
```console
17
```

**Sample Output 1:**
```console
17 52 26 13 40 20 10 5 16 8 4 2 1
```

**Sample Input 2:**
```console
1
```

**Sample Output 2:**
```console
1
```

## Tags
- basics
- control flow statements
- the while and do-while loops

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)