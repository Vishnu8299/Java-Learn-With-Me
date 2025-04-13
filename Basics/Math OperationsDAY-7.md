### **📊 Math Operations in Java**

Math operations are the backbone of numerical calculations in any programming language. In **Java**, we can perform basic arithmetic operations such as addition, subtraction, multiplication, division, and modulus. These operations are used to manipulate numbers and perform mathematical tasks in your program.

---

### **🔹 Basic Math Operations in Java**

Here are the most commonly used math operations in Java:

1. **Addition (+)**: Adds two numbers together.
2. **Subtraction (-)**: Subtracts one number from another.
3. **Multiplication (*)**: Multiplies two numbers.
4. **Division (/)**: Divides one number by another.
5. **Modulus (%)**: Returns the remainder when one number is divided by another.

---

### **🔹 Example of Basic Math Operations**

Let’s see a program that demonstrates all the basic math operations:

```java
public class MathOperations {
    public static void main(String[] args) {
        int num1 = 15;
        int num2 = 4;

        // Addition
        int sum = num1 + num2;
        System.out.println("Addition: " + sum);  // Output: 19

        // Subtraction
        int difference = num1 - num2;
        System.out.println("Subtraction: " + difference);  // Output: 11

        // Multiplication
        int product = num1 * num2;
        System.out.println("Multiplication: " + product);  // Output: 60

        // Division
        int quotient = num1 / num2;
        System.out.println("Division: " + quotient);  // Output: 3

        // Modulus (remainder)
        int remainder = num1 % num2;
        System.out.println("Modulus: " + remainder);  // Output: 3
    }
}
```

---

### **🔹 Explanation of Operations**

1. **Addition (+)**:
    - `sum = num1 + num2;` adds `num1` and `num2` together and stores the result in `sum`.
    
2. **Subtraction (-)**:
    - `difference = num1 - num2;` subtracts `num2` from `num1` and stores the result in `difference`.
    
3. **Multiplication (*)**:
    - `product = num1 * num2;` multiplies `num1` and `num2` and stores the result in `product`.
    
4. **Division (/)**:
    - `quotient = num1 / num2;` divides `num1` by `num2`. The result is an integer because both operands are integers.
    
5. **Modulus (%)**:
    - `remainder = num1 % num2;` gives the remainder when `num1` is divided by `num2`. It is useful when you need to check divisibility or find remainders.

---

### **🔹 Integer Division and Remainder**

When you divide two integers in Java, the result is always an integer, which means any decimal is discarded.

- For example, `15 / 4` will output `3`, not `3.75`, because Java performs **integer division** when both operands are integers.

### **Example with Floating-Point Numbers:**

If you need to preserve decimal values, you can use **floating-point numbers** (`float` or `double`).

```java
public class MathOperations {
    public static void main(String[] args) {
        double num1 = 15;
        double num2 = 4;

        // Division with decimals
        double quotient = num1 / num2;
        System.out.println("Division: " + quotient);  // Output: 3.75
    }
}
```

---

### **🔹 Common Use Cases for Math Operations**

1. **Calculating the area of shapes**:
    - Area of a circle: `π * radius^2`
    - Area of a rectangle: `length * width`
  
2. **Converting units**:
    - Convert kilometers to miles: `miles = kilometers * 0.621371`
  
3. **Financial calculations**:
    - Calculating tax or discounts: `total = price - (price * discount)`

4. **Handling percentages**:
    - Finding a percentage: `percentage = (part / total) * 100`

---

### **🎯 Final Thoughts**
- **Math operations** form the foundation of many algorithms and programs, from simple calculations to complex financial models.
- Java makes it easy to perform these operations using basic operators.


@https://jenkov.com/tutorials/java/math-operators-and-math-class.html

@https://medium.com/@AlexanderObregon/beginners-guide-to-java-math-21edc9cc1ee0T

@https://www.youtube.com/results?search_query=math+operations+for+java+developer
