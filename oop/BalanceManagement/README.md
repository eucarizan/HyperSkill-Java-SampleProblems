# Balance management

## Description
You are given the enum `Operation` and the class `Account`. Their implementations are shown below.

The `Operation` enum:
```java
enum Operation {
    /**
     * deposit (add) an amount into an Account
     */
    DEPOSIT,
    /**
     * withdraw (subtract) an amount from an Account
     */
    WITHDRAW
}
```

The `Account` class:
```java
class Account {

    private String code;
    private Long balance;

    public String getCode() {
        return code;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
```

Your task is to implement the method `changeBalance` to control balances. It has the following declaration:
```java
    public static boolean changeBalance(Account account, Operation operation, Long sum)
```

- If the given operation is DEPOSIT the method adds the sum to the account's balance.
- If the operation is WITHDRAW the method subtracts the given sum from the account's balance. If the given sum is greater than the balance, the method shouldn't change it. Instead, the method must output the string **"Not enough money to withdraw."** (without quotes, don't forget the full point).
- In any case, the method returns a **boolean value** — true if the balance has changed, false if it hasn't.

## Examples
**Sample Input 1:**
```console
The following values are passed to the method: 
    operation = Operation.DEPOSIT, 
    sum = 2000. 
    The initial balance of the account is 1000.
```

**Sample Output 1:**
```console
In this case, the method returns "true" 
    and the new account balance is 3000.
```

**Sample Input 2:**
```console
The following values are passed to the method: 
    operation = Operation.WITHDRAW, 
    sum = 5000. 
    The initial balance of the account is 2000.
```

**Sample Output 2:**
```console
In this case, the method returns "false", 
    the account's balance is not changed (2000) 
    and method prints "Not enough money to withdraw.".
```

## Tags
- code organization
- object-oriented programming
- other concepts
- enumerations
- fields and methods in enum

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)