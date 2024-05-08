#  Merging date-time instances

## Description
Implement a method that takes two instances of `LocalDateTime` class and merges them into one object by choosing the largest value of each component for the target object. Consider the following components: years, months, days of months, hours, minutes and seconds.

Output the resulting `LocalDateTime` object.

## Examples
**Sample Input 1:**
```console
2018-10-20T22:30
2017-12-30T22:31:45
```

**Sample Output 1:**
```console
2018-12-30T22:31:45
```

## Tags
- additional instruments
- essential standard classes
- date and time
- localdatetime