# GeneratingPasswords

## Description
A password is hard to crack if it contains at least A uppercase letters, at least B lowercase letters, at least C digits and consists of exactly N symbols. Also, a password cannot contain two or more of the same characters in a row.

For the given numbers A, B, C, and N, you should output a password that matches these requirements.

It is guaranteed that A, B, C, and N are non-negative integers, and A + B + C <= N. Keep in mind that any parameter can be equal to zero. It means that it's ok if the password does not contain symbols of such type.

## Examples
**Sample Input 1:**
```console
3 2 3 10
```

**Sample Output 1:**
```console
ABAab121AB
```

## Tags
- basics
- strings
- processing strings

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)