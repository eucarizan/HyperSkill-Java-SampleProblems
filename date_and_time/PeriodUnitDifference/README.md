# The difference between Period units
## Description
Find and subtract the smallest `Period` unit from the sum of all units using the `minus()` method. Note that you need to implement the `getSumMinusMin()` method to return the result of the subtraction but this doesn't mean that all logic must be there. You can have more methods. Use the `calculateDayCount()` method to calculate the number of days in a year for comparison.

## Examples
**Sample Input 1:**
```console
1989 6 23
1991 5 22
1994 4 21
1993 3 19
1988 2 18
```

**Sample Output 1:**
```console
P7967Y18M85D
```

## Tags
- date and time
- essential standard classes

## Code
- [solution class](./src/main/java/dev/nj/solutions/PeriodUnitDifference.java)
- [unit tests](./src/test/java/PeriodUnitDifferenceTest.java)
