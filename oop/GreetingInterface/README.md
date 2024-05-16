# Implementing a greeting interface
## Description
In Java, interfaces allow defining default methods with an implementation. Create an interface called `Greetings` with a default method `greet` that takes a name as input and returns a greeting message. Then create a class `GreetingsImpl` that implements the `Greetings` interface. The program should read a name from the user, create an instance of `GreetingsImpl`, and print the greeting message returned by calling the `greet` method.

## Examples
**Sample Input 1:**
```console
John
```

**Sample Output 1:**
```console
Hello, John!
```

**Sample Input 2:**
```console
Alice
```

**Sample Output 2:**
```console
Hello, Alice!
```

## Tags
- default methods
- interfaces and abstract classes
- class hierarchies
- oop

## Code
- [solution class](./src/main/java/dev/nj/solutions/GreetingInterface.java)
- [unit tests](./src/test/java/GreetingInterfaceTest.java)