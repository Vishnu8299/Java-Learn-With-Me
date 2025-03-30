### **📚 Basics of Object-Oriented Programming (OOP)**

Object-Oriented Programming (OOP) is a programming style that focuses on organizing code around objects, which are instances of **classes**. The idea behind OOP is to model real-world entities and behaviors in software using **objects**. 

In OOP, an **object** is a self-contained unit that consists of:
1. **Attributes** (also called **fields** or **properties**) - These represent the data or state of the object.
2. **Methods** (also called **functions** or **procedures**) - These represent the behaviors or actions that the object can perform.

OOP has four fundamental principles that help in creating clean, reusable, and scalable code:

---

### **🔹 1. Encapsulation**

Encapsulation is the process of bundling the data (attributes) and the methods (functions) that operate on the data into a single unit called a **class**. It also involves restricting direct access to some of an object's components, which helps protect the object's internal state from unintended modification.

**Why Encapsulation?**
- It hides the internal complexity.
- It makes code more maintainable.
- It helps in restricting unauthorized access to sensitive data.

#### **Example:**
```java
class Person {
    private String name;  // Private attribute (can't be accessed directly from outside)
    private int age;

    // Getter method to access 'name'
    public String getName() {
        return name;
    }

    // Setter method to modify 'name'
    public void setName(String name) {
        this.name = name;
    }
}
```
In this example, `name` and `age` are **encapsulated** within the `Person` class. The `getName()` and `setName()` methods allow controlled access to the `name` field.

---

### **🔹 2. Inheritance**

Inheritance allows a new class (called a **subclass** or **child class**) to inherit the attributes and behaviors (methods) from an existing class (called a **superclass** or **parent class**). It promotes code reuse and establishes a relationship between the classes.

**Why Inheritance?**
- It helps avoid code duplication.
- It allows a class to be extended to add more specific features.

#### **Example:**
```java
class Animal {
    public void speak() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void speak() {
        System.out.println("The dog barks");
    }
}
```
In this example:
- `Dog` **inherits** the `speak()` method from `Animal`, but it **overrides** it to provide a specific implementation for dogs.

---

### **🔹 3. Polymorphism**

Polymorphism allows an object to take many forms. It means that a subclass object can be treated as an instance of its superclass. The most common use of polymorphism is through method overriding (runtime polymorphism) and method overloading (compile-time polymorphism).

**Why Polymorphism?**
- It provides flexibility and allows for the use of a single interface to represent different types of objects.
- It helps make code more extensible.

#### **Example (Method Overriding - Runtime Polymorphism):**
```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();  // Polymorphism: Animal reference, but Cat object
        animal.sound();  // Calls the overridden method in the Cat class
    }
}
```
Output:
```
Cat meows
```
In this example:
- `animal` is of type `Animal`, but it's actually a `Cat` object. When `sound()` is called, Java uses the overridden method in `Cat`, not `Animal`.

#### **Example (Method Overloading - Compile-time Polymorphism):**
```java
class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
}
```
Here, the method `add()` is overloaded to handle both integer and double values. This is an example of **compile-time polymorphism**, where the method is resolved at compile time based on the argument types.

---

### **🔹 4. Abstraction**

Abstraction is the process of hiding the complex implementation details and showing only the essential features of an object. This helps in reducing complexity and allows the user to interact with the object in a simplified manner.

In Java, abstraction is achieved using **abstract classes** and **interfaces**.

**Why Abstraction?**
- It simplifies the code by hiding unnecessary details.
- It allows you to define a blueprint for other classes to follow.

#### **Example (Using Abstract Class):**
```java
abstract class Animal {
    public abstract void sound();  // Abstract method (no implementation)
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}
```
In this example:
- The `Animal` class is abstract and defines an abstract method `sound()`, which must be implemented by any concrete subclass like `Dog`.

---

### **🎯 Summary of OOP Principles:**

1. **Encapsulation**: Bundling data and methods together and hiding internal details.
2. **Inheritance**: Reusing code by creating a new class that inherits properties and behaviors from an existing class.
3. **Polymorphism**: Using a single interface for different data types, allowing for method overriding and overloading.
4. **Abstraction**: Hiding the implementation details and showing only the essential features of an object.

By leveraging these four key principles, OOP allows developers to write cleaner, more reusable, and maintainable code. It makes it easier to model real-world systems in programming and promotes good software design practices!


@https://jenkov.com/tutorials/java/classes.html

@https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/

@https://www.youtube.com/results?search_query=oops+in+java
