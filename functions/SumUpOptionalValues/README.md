# Sum up optional values

## Description
The method `getValues` of the `ValueProvider` class returns a `List<Optional<Integer>>` result.

```java
class ValueProvider {
    public List<Optional<Integer>> getValues() {
        // hidden code
    }
}
```

Write a code in the `Main` class that sums up all values and prints the result. If `Optional` object is empty, just skip it.

## Examples
**Sample Input 1:**
```console
3
1
2
3
```

**Sample Output 1:**
```console
6
```

**Sample Input 2:**
```console
5
1
2
null
4
5
```

**Sample Output 2:**
```console
12
```

## Tags
- code organization
- functional programming
- functions
- optional

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)