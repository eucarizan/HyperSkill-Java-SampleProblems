# Adding values

## Description
Write a method named `addValueByIndex`.

The method should take an array of longs and add a value to the specified element by its index.

Here is a description of the parameters:
1. an array of longs;
2. the index of an element (`int`);
3. a value for adding (`long`).

The method must return nothing.

The following invocation should work correctly:
```java
addValueByIndex(array, index, value);
```

Where `array` is an array of longs, `index` is an integer variable, `value` is a long value for adding.

## Examples
**Sample Input 1:**
```console
1 1 1 1 1
2 100
```

**Sample Output 1:**
```console
1 1 101 1 1
```

## Tags
- code organization
- methods
- arrays as parameters

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)