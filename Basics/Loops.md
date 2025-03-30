### **📚 Loops in Java**

In Java, loops are used to repeat a block of code multiple times, which is useful when you need to perform repetitive tasks or iterate through data. There are four main types of loops in Java: `for`, `forEach`, `while`, and `do...while`. 

Each loop has its own use case depending on the specific scenario you are dealing with.

---

### **🔹 `for` Loop**

The `for` loop is one of the most commonly used loops. It allows you to repeat a block of code a certain number of times, and you control the loop's execution with an initialization, condition, and increment/decrement.

#### **Syntax:**
```java
for (initialization; condition; increment/decrement) {
    // code to be executed
}
```

- **Initialization**: Sets up the initial value (e.g., `int i = 0`).
- **Condition**: The loop continues to run as long as this condition evaluates to true (e.g., `i < 10`).
- **Increment/Decrement**: This modifies the loop variable, either incrementing (e.g., `i++`) or decrementing (e.g., `i--`).

#### **Example:**
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Iteration: " + i);
}
```
Output:
```
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4
Iteration: 5
```
In this example, the loop will run 5 times, with `i` starting at 1 and being incremented by 1 each time, stopping when `i` reaches 5.

---

### **🔹 `forEach` Loop**

The `forEach` loop is specifically used to iterate through elements in collections (like arrays, lists, etc.) and execute a block of code for each element.

#### **Syntax:**
```java
for (data_type variable : array_name) {
    // code to be executed
}
```

- **data_type**: The type of the element (e.g., `int`, `String`).
- **variable**: A temporary variable to hold the current element of the array or collection.
- **array_name**: The name of the array or collection you want to iterate through.

#### **Example:**
```java
String[] colors = {"Red", "Green", "Blue"};
for (String color : colors) {
    System.out.println(color);
}
```
Output:
```
Red
Green
Blue
```
In this example, the `forEach` loop iterates over each element in the `colors` array and prints it.

---

### **🔹 `while` Loop**

The `while` loop repeats a block of code as long as a specified condition is true. The condition is checked before each iteration.

#### **Syntax:**
```java
while (condition) {
    // code to be executed
}
```

- **Condition**: The loop continues to run as long as this condition is true.

#### **Example:**
```java
int i = 1;
while (i <= 5) {
    System.out.println("Iteration: " + i);
    i++;
}
```
Output:
```
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4
Iteration: 5
```
In this example, the loop will run 5 times as long as `i` is less than or equal to 5.

---

### **🔹 `do...while` Loop**

The `do...while` loop is similar to the `while` loop, but with one key difference: the code block is executed **at least once** before the condition is checked. The condition is checked after the block of code is executed.

#### **Syntax:**
```java
do {
    // code to be executed
} while (condition);
```

- **Condition**: The loop will run again if the condition is true after the block is executed.

#### **Example:**
```java
int i = 1;
do {
    System.out.println("Iteration: " + i);
    i++;
} while (i <= 5);
```
Output:
```
Iteration: 1
Iteration: 2
Iteration: 3
Iteration: 4
Iteration: 5
```
In this example, the code block is executed once, and then the condition is checked. The loop will continue running as long as the condition is true.

---

### **🎯 Summary of Loops in Java**

1. **`for` Loop**: Best for when you know the number of iterations in advance (e.g., iterating over a range).
2. **`forEach` Loop**: Ideal for iterating over collections like arrays or lists.
3. **`while` Loop**: Use when you don’t know the number of iterations in advance but know a condition that should stop the loop.
4. **`do...while` Loop**: Similar to `while`, but the code block will always run at least once, even if the condition is false.

Loops are an essential concept in programming that helps automate repetitive tasks and make your code more efficient!


@https://www.programiz.com/java-programming/for-loop

@https://www.youtube.com/results?search_query=loops+for+java+developer
