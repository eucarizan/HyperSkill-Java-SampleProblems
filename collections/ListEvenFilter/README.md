# Filtering the list
## Description
Write a program that reads a list of integer numbers separated by spaces from the standard input and then removes all numbers with even _indexes_ (0, 2, 4, and so on).

After that, the program should output the resulting sequence in _reverse order_.

## Examples
**Sample Input 1:**
```console
1 2 3 4 5 6 7
```

**Sample Output 1:**
```console
6 4 2
```

**Sample Input 2:**
```console
1 2
```

**Sample Output 2:**
```console
2
```

**Sample Input 3:**
```console
7 6 -5 -4 -3 2 1
```

**Sample Output 3:**
```console
2 -4 6
```

## Tags
- the list interface
- working with data
- collections framework

## Code
- [solution class](./src/main/java/dev/nj/solutions/ListEvenFilter.java)
- [unit tests](./src/test/java/ListEvenFilterTest.java)