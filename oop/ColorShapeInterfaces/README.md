# Implementing and extending color and shape interfaces
## Description
Design two interfaces `Shape` and `Colorable`. The `Shape` interface should have a default method `name()` that returns `Generic Shape`. The `Colorable` interface should also have a default method `color()` that returns `No Color`. Create a class `Circle` that implements both the `Shape` and `Colorable` interfaces. Override the `name()` in `Circle` to return `Circle` and leave the `color()` method as is. Then, create another class `ColoredCircle` that extends `Circle` and override `color()` to return `Red`. Your implementation should take a string as input representing the type of object (`Circle` or `ColoredCircle`). If `Circle` is provided, return the name and color of a Circle object, if `ColoredCircle` is provided, return the name and color of a ColoredCircle object.

## Examples
**Sample Input 1**:
```console
Circle
```

**Sample Output 1**:
```console
Circle
No Color
```

## Tags
- default methods
- interfaces and abstract classes
- class hierarchies
- oop

## Code
- [solution class](./src/main/java/dev/nj/solutions/ColorShapeInterfaces.java)
- [unit tests](./src/test/java/ColorShapeInterfacesTest.java)
