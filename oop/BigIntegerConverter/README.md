# Creating instances
## Description
Packages allow you to access both constructors and static methods.

Now you're working with an application that multiplies a provided number by 200. There's a special class that is used for operating on large numbers called `BigInteger`.

In this task, you will need to access this class _without importing it_. Its constructor accepts only one argument: a string with a number (for example, "1264"). It is located in the `java.math` package.

You need to create an instance of this class with the number given in the method, and return it.

The program will then multiply it – you _don't_ need to perform multiplication.

## Examples
**Sample Input 1:**
```console
49225
```

**Sample Output 1:**
```console
49225 multiplied by 200 is 9845000
```

## Tags
- grouping classes with packages
- classes and members
- classes and objects
- oop

## Code
- [solution class](./src/main/java/dev/nj/solutions/BigIntegerConverter.java)
- [unit tests](./src/test/java/BigIntegerConverterTest.java)