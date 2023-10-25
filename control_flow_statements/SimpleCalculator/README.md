# A simple calculator

## Description
Write a simple calculator that reads the three values from the line: the first number, the operation, and the second number.

The program should apply the operation to the numbers entered ("first number" "operation" "second number") and output the result to the screen. Note that the numbers are long.

The calculator should support:

- addition: "+"
- subtraction: "-"
- integer division: "/"
- multiplication: "*"

If a user performs division and the second number is 0, it is necessary to output the line "Division by 0!".

If the input operator is not one from the list, the program should output "Unknown operator".

**Note:** it's recommended to use the switch statement in your solution.

## Examples
**Sample Input 1:**
```console
10000000000 + 20000000000
```

**Sample Output 1:**
```console
30000000000
```

**Sample Input 2:**
```console
3000 / 0
```

**Sample Output 2:**
```console
Division by 0!
```

**Sample Input 3:**
```console
10000 ! 300
```

**Sample Output 3:**
```console
Unknown operator
```

## Tags
- basics
- control flow statements
- switch statement

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)