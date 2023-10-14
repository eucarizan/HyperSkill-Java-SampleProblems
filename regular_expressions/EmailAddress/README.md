# E-mail address

## Description
Suppose you are writing a program to match an e-mail address. The rules for email addresses are:

1. The e-mail username can consist of lowercase and uppercase Latin letters, digits and symbols `_%+-.`.
2. The domain name (the part that comes after the @ symbol in an e-mail address) can consist only of lowercase and uppercase Latin letters.
3. The e-mail domain should include a subdomain and a top-level domain.

Here are some valid examples:

- `bob.smith@gmail.com`
- `anna@example.ru`
- `kat9%yy+@subdomain.topleveldomain`

Which of the following regexes can help you write this program? 
- [ ] ^[a-zA-Z0-9_%+-]+@[a-zA-Z0-9]+.[a-zA-Z]
- [x] ^[a-zA-Z0-9_%+-.]+@[a-zA-Z]+\\.[a-zA-Z]+$
- [ ] ^[a-zA-Z0-9_%+-]+@[a-zA-Z].[a-zA-Z]+$
- [ ] [a-Z0-9_%+-]+@[a-Z0-9].[a-Z]+

## Tags
- additional instruments
- regular expressions
- patterns and matcher

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)