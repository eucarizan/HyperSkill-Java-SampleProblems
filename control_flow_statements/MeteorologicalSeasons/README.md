# Meteorological seasons

## Description
Rewrite the following switch statement as a switch expression using the code template below.

Please ignore the `MagicNumberCheck` code style issue here. The default state won't be checked.

```java
enum Seasons { SPRING, SUMMER, AUTUMN, WINTER }
int temperature = 0;
switch (season) {
    case SPRING:
    case AUTUMN:
        temperature = 20;
        break;
    case SUMMER:
        temperature = 37;
        break;
    case WINTER:
        temperature = 1;
        break;
    default:
        throw new IllegalStateException("Invalid name of Seasons.");
}
```

## Examples
**Sample Input 1:**
```console
AUTUMN
```

**Sample Output 1:**
```console
20
```

## Tags
- basics
- control flow statements
- switch expression

## Code
- [solution class](./src/main/java/SomeClass.java)
- [unit tests](./src/test/java/SomeParamTest.java)