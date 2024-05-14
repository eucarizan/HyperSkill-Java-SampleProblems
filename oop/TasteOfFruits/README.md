# Determining the taste of fruits using method overriding
## Description
Imagine you have a superclass `Fruit` with a method `taste()`. You also have two subclasses `Apple` and `Orange` that extends `Fruit`. The `taste()` method returns the taste of the fruit as a string. You need to create the classes and override the `taste()` method in the subclasses. For an input fruit type, your code should call the `taste()` method of the corresponding fruit class and print the result. Input: - A single line that contains a string representation of the fruit type (either `Apple` or `Orange`) Output: - For an input of `Apple`, the output should be `Sweet` - For an input of `Orange`, the output should be `Sour`

## Examples
**Sample Input 1:**
```console
Apple
```

**Sample Output 1:**
```console
Sweet
```

## Tags
- polymorphism
- overriding methods
- class hierarchies
- oop

## Code
- [solution class](./src/main/java/dev/nj/solutions/TasteOfFruits.java)
- [unit tests](./src/test/java/TasteOfFruitsTest.java)