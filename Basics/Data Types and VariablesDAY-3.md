### **📌 Understanding Variables and Data Types in Java (Simple Explanation) 🚀**  

In Java, **variables** are like **containers** that store different types of data. These variables help us store and manipulate information while the program runs. Let's break it down in an easy way! 😊  

---

## **🔹 What is a Variable?**  
A **variable** is a **named storage location** in memory where data is stored.  
💡 Think of it as a **box** where you keep your items (data).  

Example:  
```java
int age = 25;  // 'age' is a variable that stores the value 25
```
Here,  
- `int` → Data type (it can store whole numbers).  
- `age` → Variable name.  
- `25` → Value assigned to the variable.

---

## **🔹 Types of Variables in Java**  
There are **3 types** of variables in Java:

### **1️⃣ Local Variable** 🏠  
- Declared inside a method or block.  
- Can only be used inside that method/block.  
- **Not stored permanently** (disappears after the method finishes).  

Example:  
```java
public class Example {
    public void show() {
        int localVar = 10;  // Local variable
        System.out.println(localVar);
    }
}
```

---

### **2️⃣ Instance Variable** 🏛️  
- Declared **inside a class** but **outside any method**.  
- Each **object** of the class gets a copy of this variable.  
- Stored in **heap memory**.  

Example:  
```java
public class Student {
    String name;  // Instance variable

    public void setName(String newName) {
        name = newName;
    }

    public void display() {
        System.out.println("Student name: " + name);
    }
}
```

---

### **3️⃣ Static Variable** ⚡  
- Declared using the `static` keyword.  
- **Shared among all objects** of the class.  
- Stored in **static memory**.  

Example:  
```java
public class School {
    static String schoolName = "ABC School";  // Static variable

    public static void main(String[] args) {
        System.out.println("School: " + schoolName);
    }
}
```

---

## **🔹 Data Types in Java**  
Java has **two main types** of data types:

### **1️⃣ Primitive Data Types (Basic Types) 🏗️**
- These store **simple values** like numbers, characters, or true/false.
- **Total: 8 types**  
  | **Data Type** | **Size** | **Example** |
  |-------------|------|------------|
  | `byte`  | 1 byte  | `byte b = 100;` |
  | `short` | 2 bytes | `short s = 5000;` |
  | `int`   | 4 bytes | `int num = 25;` |
  | `long`  | 8 bytes | `long bigNum = 100000L;` |
  | `float` | 4 bytes | `float price = 10.5f;` |
  | `double`| 8 bytes | `double pi = 3.14159;` |
  | `boolean` | 1 bit | `boolean isJavaFun = true;` |
  | `char`  | 2 bytes | `char letter = 'A';` |

---

### **2️⃣ Non-Primitive Data Types (Reference Types) 📦**  
- More **complex** data types that store objects, strings, arrays, etc.  
- **Examples:**  
  - `String` (Stores text)  
  - `Array` (Stores multiple values)  
  - `Class` (Blueprint for objects)  
  - `Enum` (Fixed set of constants)  
  - `Record` (Immutable data structure)

Example:  
```java
String message = "Hello, Java!";  // String variable
int[] numbers = {1, 2, 3, 4};     // Array variable
```

---

## **🔗 Summary Table**
| **Concept** | **Description** | **Example** |
|------------|--------------|------------|
| **Local Variable** | Defined inside a method/block | `int x = 10;` inside a method |
| **Instance Variable** | Defined inside a class but outside methods | `String name;` inside a class |
| **Static Variable** | Shared across all objects, uses `static` keyword | `static int count = 0;` |
| **Primitive Data Types** | Basic types (numbers, char, boolean) | `int, double, char, boolean` |
| **Non-Primitive Data Types** | Objects, strings, arrays | `String, Arrays, Classes` |

---

### **🎯 Final Thoughts**
Now you understand **what variables are, their types, and data types** in Java! 🚀  



@https://www.youtube.com/watch?v=Le25I331_yU

@https://www.codechef.com/blogs/variables-and-datatypes-in-java

@https://www.geeksforgeeks.org/data-types-in-java/
