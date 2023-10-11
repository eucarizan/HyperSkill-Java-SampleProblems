# Forex Broker

## Description
Suppose you are building a **Forex Broker** application. Forex broker has two commands which are `buy` and `sell`. The user gives an input sequence which is the amount of money (`Option`) to be bought and sold. If the user gives a positive number it is to be bought. If the user gives a negative number, that amount must be sold.

Use the following guidelines:
- Don't change the provided code.
- If the user amount is X>0, the X amount must be bought. The `buy` command must print `X was bought`.
- If the user amount is X<0, the X amount must be sold. The `sell` command must print `X was sold`.
- The user will give only three inputs.

## Examples
**Sample Input 1:**
```console
5 -8 10
```

**Sample Output 1:**
```console
5 was bought
-8 was sold
10 was bought
```

## Tags
- code organization
- design patterns
- behavioral patterns
- command

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)