# Illegal identifiers

## Description
Suppose, you want to create a new programming language that supports variables.

There is a set of rules for identifiers (names) of variables:

- It can include lower and upper letters, digits and the underscore character `_`;
- It can only start with a letter or an underscore;
- If an identifier starts with an underscore, the second character should be either a letter or a digit, but not an underscore;

Note that a single `_` is not a valid identifier.

Using the provided template, write a program that reads `n` identifiers and then outputs all invalid ones in the same order as they appear in the input data. We hope that you will use regexes to solve the problem.

## Examples
**Sample Input 1:**
```console
6
ident
i
__
1a
b33
_n1
```

**Sample Output 1:**
```console
__
1a
```

## Tags
- tags

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)