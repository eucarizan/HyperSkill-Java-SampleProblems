# Removing duplicate names from a comma-separated list
## Description
Write a Java program that reads a single string as input, representing a list of names separated by commas (with no spaces). Your program should discard all duplicate names and print all unique names in the same order they appear in the input. Note that names are case-sensitive i.e., 'John' and 'john' are considered two different names. For example, if you input 'John,Tim,John,Casey,Tim,Casey', the output should be 'John,Tim,Casey'.

## Examples
**Sample Input 1:**
```console
John,Tim,John,Casey,Tim,Casey
```

**Sample Output 1:**
```console
John,Tim,Casey
```

**Sample Input 2:**
```console
Robert,Julia,Martin,Julia,Robert
```

**Sample Output 2:**
```console
Robert,Julia,Martin
```

## Tags
- the set interface
- working with data
- collections framework

## Code
- [solution class](./src/main/java/dev/nj/solutions/SetNameList.java)
- [unit tests](./src/test/java/SetNameListTest.java)