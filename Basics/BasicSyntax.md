### **Understanding Java Basics** 🚀  

A strong foundation in Java starts with understanding **basic terminologies, syntax rules, and core concepts**.  

---

### **📌 Key Concepts in Java Basics**  

1️⃣ **Terminologies**  
   - **Variable**: A container for storing data. (`int age = 25;`)  
   - **Method**: A block of code that performs a specific task.  
   - **Class**: A blueprint for creating objects.  

2️⃣ **Naming Conventions**  
   - Class names: `PascalCase` → `StudentDetails`  
   - Variable & method names: `camelCase` → `studentName`  
   - Constants: `UPPER_CASE` → `MAX_LIMIT`  

3️⃣ **Reserved Keywords**  
   - Words reserved by Java for specific purposes (e.g., `class`, `int`, `public`, `static`).  
   - Cannot be used as variable names.  

4️⃣ **Expressions & Statements**  
   - **Expression**: Produces a value (`5 + 3`, `a * b`).  
   - **Statement**: Performs an action (`int sum = 5 + 3;`).  

5️⃣ **Data Structures**  
   - Arrays, Lists, Sets, Maps, and Queues for storing & organizing data efficiently.  

6️⃣ **Object-Oriented Programming (OOP)**  
   - Java follows OOP principles:  
     - **Encapsulation** (data hiding)  
     - **Abstraction** (hiding complexity)  
     - **Inheritance** (reusability)  
     - **Polymorphism** (multiple forms of a method)  

7️⃣ **Packages**  
   - Organizes related classes together. (`import java.util.*;`)  

---

### **🖨️ Printing Output in Java**
Use **`System.out.println()`** to display output:  

```java
System.out.println("Hello, Java! 🚀");
```

---

### **⌨️ Taking Input from the User**
Java provides two common ways to take input:  

1️⃣ **Using Scanner** (Easy to use)  
```java
import java.util.Scanner;

Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = scanner.nextLine();
System.out.println("Hello, " + name + "!");
scanner.close();
```

2️⃣ **Using BufferedReader** (Efficient for large input)  
```java
import java.io.*;

BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter your age: ");
int age = Integer.parseInt(reader.readLine());
System.out.println("You are " + age + " years old.");
```

---

### **🚀 Summary**
- Java has structured rules & conventions.  
- Printing output → `System.out.println()`.  
- Taking input → `Scanner` (for easy use) or `BufferedReader` (for efficiency).  
- OOP, data structures, and expressions form the core of Java programming.  

✅ **Now, you're ready to write basic Java programs!** 🎉
