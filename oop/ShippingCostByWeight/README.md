# Calculating package shipping cost by weight
## Description
Create a Java program that defines a class called 'Package' with a private member variable 'weight' of type double. The class should have a constructor that takes the weight as a parameter and a public method 'getShippingCost' that returns the shipping cost based on the package weight. The shipping cost is calculated as follows: 5 _forpackagesweighingupto_ 5 _pounds_ , _andanadditional_ 1 for each pound above 5 pounds. In the main method, create an instance of the 'Package' class with a weight entered by the user, and print the shipping cost.

## Examples
**Sample Input 1:**
```console
3.5
```

**Sample Output 1:**
```console
5.0
```

**Sample Input 2:**
```console
7.2
```

**Sample Output 2:**
```console
8.0
```

## Tags
- grouping classes with packages

## Code
- [solution class](./src/main/java/dev/nj/solutions/ShippingCostByWeight.java)
- [unit tests](./src/test/java/ShippingCostByWeightTest.java)