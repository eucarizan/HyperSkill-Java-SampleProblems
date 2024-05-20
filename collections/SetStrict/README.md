# Strict superset
## Description
In this problem, you need to implement a math operation that checks whether the second set is a **strict superset** of the first set.

It means, the second set should contain all elements of the first set, but the sets must not be equal.

## Examples
**Sample Input 1:**
```console
1 2 3
4 1 2 3
```

**Sample Output 1:**
```console
true
```

**Sample Input 2:**
```console
b a c
e c d b
```

**Sample Output 2:**
```console
false
```

**Sample Input 3:**
```console
a b c
c b a
```

**Sample Output 3:**
```console
false
```

## Tags
- the set interface
- collections framework
- working with data

## Code
- [solution class](./src/main/java/dev/nj/solutions/SetStrict.java)
- [unit tests](./src/test/java/SetStrictTest.java)