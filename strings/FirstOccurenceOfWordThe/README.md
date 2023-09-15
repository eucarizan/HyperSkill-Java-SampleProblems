# Find the first occurrence of the word "the"

## Description
Write a program that takes a sentence as input and returns the index of the first occurrence of the word "**the**" (can be part of a word), regardless of the capitalization. If there is no occurrence of it, it must output -1.

For instance, if the sentence is “**The apple is red.**” the output should be 0, if the sentence is “**I ate the red apple.**” the output should be 6, and if the sentence is “**I love apples.**” the output should be -1.

Note, the and The are equal.

## Examples
**Sample Input 1:**
```console
The apple is red.
```

**Sample Output 1:**
```console
0
```

**Sample Input 2:**
```console
I ate the red apple.
```

**Sample Output 2:**
```console
6
```

## Tags
- basics
- strings
- processing strings

## Code
- [solution class](./src/main/java/WordThe.java)
- [unit tests](./src/test/java/SomeParamTest.java)