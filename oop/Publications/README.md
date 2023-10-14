# Publications

## Description
Below you can see four classes: `Publication`, `Newspaper`, `Article` and `Announcement`.

You need to override the method `getDetails()` in the classes inherited from the class `Publication`. These classes should use `getDetails()` from `Publication` to get information about the title and append their own additional data.

Examples are shown below.

## Examples
**Sample Input 1:**
```console
Publication; The new era
```

**Sample Output 1:**
```console
title="The new era"
```

**Sample Input 2:**
```console
Newspaper; Football results; Sport news
```

**Sample Output 2:**
```console
title="Football results", source="Sport news"
```

**Sample Input 3:**
```console
Article; Why the Sun is hot; Dr James Smith
```

**Sample Output 3:**
```console
title="Why the Sun is hot", author="Dr James Smith"
```

**Sample Input 4:**
```console
Announcement; Will sell a house; 30
```

**Sample Output 4:**
```console
title="Will sell a house", daysToExpire=30
```

## Tags
- code organization
- object-oriented programming
- class hierarchies
- overriding methods
- hiding and overriding

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)