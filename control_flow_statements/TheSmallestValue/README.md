# The smallest value

## Description
A user inputs a `long` positive number **_m_**. You need to find out what is the **smallest** int number **_n_** such that **_n_**! > **_m_**.

**_n!_**, or factorial **_n_**, is a product of all natural numbers from 1 to **_n_** inclusive: for example, 5! = 1 * 2 * 3 * 4 * 5.

Just in case: [wiki on factorials](https://en.wikipedia.org/wiki/Factorial).

For example, the user enters 100. This means m = 100 and n = 5 because 5! = 120 (see the factorial formula) and this is the smallest number that satisfies the condition **_n! > m_**.

Pay attention that the user may input a huge number so choose an appropriate data type!

## Examples
**Sample Input 1:**
```console
6188989133
```

**Sample Output 1:**
```console
13
```

**Sample Input 2:**
```console
6
```

**Sample Output 2:**
```console
4
```

## Tags
- basics
- control flow statements
- the while and do-while loops

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)