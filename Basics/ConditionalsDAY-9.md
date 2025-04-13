### **📚 Conditionals in Java**

Conditional statements in Java allow you to control the flow of your program based on certain conditions. By using conditionals, you can specify different actions to take depending on whether a condition is true or false.

Here are the main types of conditional statements in Java:

---

### **🔹 `if` Statement**

The `if` statement is used to test a condition and execute a block of code if the condition evaluates to `true`.

#### **Syntax:**
```java
if (condition) {
    // code to be executed if condition is true
}
```

#### **Example:**
```java
int number = 10;
if (number > 5) {
    System.out.println("Number is greater than 5");
}
```
In this example, the message will be printed because `number` is greater than `5`.

---

### **🔹 `else` Statement**

The `else` statement works in conjunction with an `if` statement. It specifies a block of code to be executed if the condition in the `if` statement evaluates to `false`.

#### **Syntax:**
```java
if (condition) {
    // code to be executed if condition is true
} else {
    // code to be executed if condition is false
}
```

#### **Example:**
```java
int number = 3;
if (number > 5) {
    System.out.println("Number is greater than 5");
} else {
    System.out.println("Number is less than or equal to 5");
}
```
Here, the message `"Number is less than or equal to 5"` will be printed because `number` is not greater than `5`.

---

### **🔹 `else if` Statement**

The `else if` statement allows you to test multiple conditions. If the first `if` condition is false, the program moves to the `else if` statement and checks its condition.

#### **Syntax:**
```java
if (condition1) {
    // code to be executed if condition1 is true
} else if (condition2) {
    // code to be executed if condition2 is true
} else {
    // code to be executed if neither condition1 nor condition2 is true
}
```

#### **Example:**
```java
int number = 10;
if (number > 20) {
    System.out.println("Number is greater than 20");
} else if (number == 10) {
    System.out.println("Number is equal to 10");
} else {
    System.out.println("Number is less than 10");
}
```
In this case, the message `"Number is equal to 10"` will be printed because `number` equals 10.

---

### **🔹 `switch` Statement**

The `switch` statement is used when you have multiple conditions to check, and each condition is based on the same variable or expression. It is an alternative to using many `if-else` statements when the conditions are based on a single value.

#### **Syntax:**
```java
switch (variable) {
    case value1:
        // code to be executed if variable equals value1
        break;
    case value2:
        // code to be executed if variable equals value2
        break;
    default:
        // code to be executed if variable doesn't match any case
}
```

#### **Example:**
```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    default:
        System.out.println("Invalid day");
}
```
Here, the output will be `"Wednesday"` because the value of `day` is `3`.

---

### **🔹 Ternary Operator (`? :`)**

The ternary operator is a compact way to write simple `if-else` statements in a single line. It works as follows:

#### **Syntax:**
```java
condition ? expression1 : expression2;
```
- If `condition` is true, `expression1` is executed.
- If `condition` is false, `expression2` is executed.

#### **Example:**
```java
int number = 7;
String result = (number > 5) ? "Greater than 5" : "Less than or equal to 5";
System.out.println(result);
```
In this case, the result will be `"Greater than 5"` because the condition `number > 5` is true.

---

### **🎯 Summary**

1. **`if`**: Executes code if the condition is true.
2. **`else`**: Executes code if the condition is false.
3. **`else if`**: Allows you to test multiple conditions.
4. **`switch`**: Efficient for testing multiple conditions based on a single variable.
5. **Ternary Operator**: A shorthand for simple `if-else` conditions.

Conditionals are an essential part of programming, allowing you to make decisions based on specific conditions and control the flow of execution in your programs.



@https://how.dev/answers/what-are-conditional-statements-in-programming

@https://www.youtube.com/results?search_query=Conditionals+in+Java
