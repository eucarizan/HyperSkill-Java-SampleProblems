# Bank account

## Description
You are given a class named `BankAccount`. The class has two fields: `number` and `balance`.

Define two classes which inherit from the `BankAccount`:
- `CheckingAccount` containing the double field `fee`.
- `SavingsAccount` containing the double field `interestRate`.

Each new class should have a constructor with three parameters to initialize all fields:
- `CheckingAccount(String number, Long balance, double fee)`
- `SavingsAccount(String number, Long balance, double interestRate)`

Do not forget to invoke the superclass constructor when creating objects.

Do not make the fields `private`.

## Tags
- code organization
- object-oriented programming
- class hierarchies
- building class hierarchies
- the keyword super

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)