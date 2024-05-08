# Value or min

## Description
Map interface has a standard method `getOrDefault`. It returns the value to which the specified key is mapped, or `defaultValue` if this map contains no mapping for the key.

Let's Implement a similar method `getOrMin`. It behaves in the same way if specified key is presented in a map, but returns the minimum among all values otherwise.

For instance, there is a map with entries `A: 1`, `B: 2`, `C: 3`

If we pass `B`, then `2` is expected
If we pass `D`, then `1` is expected

## Examples
**Sample Input 1:**
```console
3
A 1
B 2
C 3
B
```

**Sample Output 1:**
```console
2
```

## Tags
- working with data
- collections
- collections framework
- the map interface

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)