# Spell checker
## Description
The simplest spell checker is the one based on a list of known words. Every word in the text is being searched for in this list and, if such word was not found, it is marked as erroneous.

Write such a spell checker.

The first line of the input contains *d* – number of records in the list of known words. Next go *d* lines containing one known word per line, next — the number *l* of lines of the text, after which — *l* lines of the text.

Write a program that outputs those words from the text that are not found in the dictionary (i.e. erroneous). Your spell checker should be case-insensitive. The words are entered in an arbitrary order. Words, which are not found in the dictionary, should not be duplicated in the output.

## Examples
**Sample Input 1:**
```console
3
a
bb
cCc
2
a bb aab aba ccc
c bb aaa
```

**Sample Output 1:**
```console
aab
aba
c
aaa
```

## Tags
- the set interface
- working with data
- collection framework

## Code
- [solution class](./src/main/java/dev/nj/solutions/SetSpellCheck.java)
- [unit tests](./src/test/java/SetSpellCheckTest.java)