# Polymorphic area calculator for shapes
## Description
Design an interface for a `Shape` with a method to calculate its area. Implement the interface in two classes: `Rectangle` and `Circle`. The program should read the dimensions of a shape from the user, create an object of the corresponding class, and print its area. **Input**: The first line contains the shape type (either '`rectangle`' or '`circle`'). If the shape is a rectangle, the next line contains the length and width separated by a space. If the shape is a circle, the next line contains the radius. Output: The area of the shape rounded to two decimal places.

## Examples
**Sample Input 1:**
```console
rectangle
5 3
```

**Sample Output 1:**
```console
15.00
```

**Sample Input 2:**
```console
circle
2.5
```

**Sample Output 2:**
```console
19.63
```

## Tags
- declaring functionalities with interfaces
- interfaces and abstract classes
- class hierarchies
- oop

## Code
- [solution class](./src/main/java/dev/nj/solutions/AreaCalculator.java)
- [unit tests](./src/test/java/AreaCalculatorTest.java)