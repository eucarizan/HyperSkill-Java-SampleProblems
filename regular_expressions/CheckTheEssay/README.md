# Check the essay

## Description
Write a program that extracts and outputs all "keys" from a string.

The key is a set of characters surrounded by spaces. The key can be of two types:

- containing digits and/or upper- and lowercase English consonants in any combination;
- containing special symbols `?!#` and/or upper- and lowercase English vowels in any combinations. Note that `y` is considered to be a consonant in this task.

The key always follows the phrase `the key is` , which can be written in upper- and/or lowercase letters. Each word can be separated by any number of whitespace, including the key-word itself.

Output all keys found in the string, each key on a new line.

Be careful, the key is always surrounded by spaces or the input string ends with the key (see the second input).
For example, the string "The key is d123." won't contain any keys.

Try to use `Matcher` and `Pattern` to solve it. All the needed modules are already imported.

## Examples
**Sample Input 1:**
```console
The    keY    is     ggYYY3564   THE    key IS ffFF23c!
```

**Sample Output 1:**
```console
ggYYY3564
```

**Sample Input 2:**
```console
The    key    IS     ggYiYY3564   The    KEY  is     AAAAAaaaa!!!!
```

**Sample Output 2:**
```console
AAAAAaaaa!!!!
```

## Tags
- additional instruments
- regular expressions
- match results

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)