# Modifying a map

## Description
You need to implement the `mapShare` method that should modify the given map as follows:

if the key `"a"` has a value, set the key `"b"` to have that same value. In all cases remove the key `"c"`, leaving the rest of the map unmodified.

```
{"a":"abstraction","b":"boolean","c":"xyz"} -> {"a":"abstraction","b":"abstraction"}
```

## Examples
**Sample Input 1:**
```console
a:Abstraction
b:Boolean
c:xyz
```

**Sample Output 1:**
```console
a:Abstraction
b:Abstraction
```

## Tags
- working with data
- collections
- collections framework
- the map interface

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)