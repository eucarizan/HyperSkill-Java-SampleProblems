# Pick your team

## Description
Imagine that you're creating teams to organize events. You need a module for your program that will select the people for these teams.

There are only two selection algorithms:

- take every **k**-th person, or every person if k = 1;
- take the last **k** people, or the last person if k = 1.

You decided to use the **strategy pattern** in the module because new selection algorithms will be added in the future. Also, the pattern allows you to change the current algorithm at runtime.

The basic structure of classes is provided below, but it doesn't work properly yet.

Your goal is to implement the following methods:

- `setAlgorithm` and `selectPersons` methods of the class `SelectionContext`;
- `select` of the class `TakePersonsWithStepAlgorithm` to take every **k**-th person **starting with the index 0** in the same order as in the input array (when k is 3, then it must take 0, 3, 6, ... persons);
- `select` of the class `TakeLastPersonsAlgorithm` to take the last **k** persons in the same order as the input array.

Perhaps, you should add some fields to the classes as well.

Please do not change the class `Person` and the interface `PersonSelectionAlgorithm`, and do not rename existing methods.

**HINT**: tests 1–4 check `TakePersonsWithStepAlgorithm`, tests 5–8 check `TakeLastPersonsAlgorithm`. Do not forget to check your solution when the step is 1 or the input array consists of a single element.

## Tags
- code organization
- design patterns
- behavioral patterns
- strategy

## Code
- [solution class](./src/main/java/Solution.java)
- [unit tests](./src/test/java/SomeParamTest.java)