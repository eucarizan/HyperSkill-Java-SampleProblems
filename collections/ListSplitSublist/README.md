# Split a list into a sublists
## Description
Implement a method for splitting (partitioning) a generic list into sublists. The method takes two arguments: a generic list and a size of sublists. The specified size of sublists can be greater than the size of the given list.

Each sublist except the last one must have the specified size. The last sublist can have a smaller number of elements.

## Examples
**Sample Input 1:**
```console
the input list: [1, 2, 3, 4, 5, 6, 7]
the specified size of sublists: 4
```

**Sample Output 1:**
```console
the expected result: [[1, 2, 3, 4], [5, 6, 7]]
```

**Sample Input 2:**
```console
the input list: [7, 4, 3, 2, 8, 1]
the specified size of sublists: 8
```

**Sample Output 2:**
```console
the expected result: [[7, 4, 3, 2, 8, 1]]
```

**Sample Input 3:**
```console
the input list: [10, 12, 12, 13, 13, 45, 12, 19, 34, 12, 588, 12, 34, 12]
the specified size of sublists: 5
```

**Sample Output 3:**
```console
the expected result: [[10, 12, 12, 13, 13], [45, 12, 19, 34, 12], [588, 12, 34, 12]]
```

**Sample Input 4:**
```console
the input list: [10, 12, 12, 13]
the specified size of sublists: 1
```

**Sample Output 4:**
```console
the expected result: [[10], [12], [12], [13]]
```

## Tags
- the list interface
- working with data
- collections framework

## Code
- [solution class](./src/main/java/dev/nj/solutions/ListSplitSublist.java)
- [unit tests](./src/test/java/ListSplitSublistTest.java)