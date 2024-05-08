# Start or end of a word

## Description
The first line of the input contains a sequence of letters.

The second line of the input contains some text.

Your task is to determine if any of the words of this text start or end with the sequence specified in the first line of the input. If there is, you should output "YES", otherwise output "NO". A word can only contain symbols of the English alphabet. You should ignore the case while searching for matches.

## Examples
**Sample Input 1:**
```console
ing
Java is the most popular programming language
```

**Sample Output 1:**
```console
YES
```

**Sample Input 2:**
```console
press
Regular expressions is hard to read, isn't it?
```

**Sample Output 2:**
```console
NO
```

**Sample Input 3:**
```console
ho
Wow! How awesome is that!
```

**Sample Output 3:**
```console
YES
```

**Sample Input 4:**
```console
ONE
ponep,onep!
```

**Sample Output 4:**
```console
YES
```

## Tags
- additional instruments
- regular expressions
- patterns and matcher

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)