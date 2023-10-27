# TitleCreate an email

## Description
We need to create an email name for an employee. For this, implement a method that takes a `String` **name** and a `String` **surname** as an argument. The method should concatenate the **name**, the **surname**, and at the end, add the domain "**@work.net**". Return the result. It's guaranteed that input strings will not be empty.

Use StringBuilder to solve the problem.

## Examples
**Sample Input 1:**
```console
Bill
Shates
```

**Sample Output 1:**
```console
BillShates@work.net
```

**Sample Input 2:**
```console
Elon  
Tusk
```

**Sample Output 2:**
```console
ElonTusk@work.net
```

## Tags
- basics
- string
- stringbuilder

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)