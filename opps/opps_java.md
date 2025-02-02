
![Logo](https://github.com/AkashRouth001/DSA-WITH-JAVA/blob/main/images/opps.jpg)


# 🚀 Object-Oriented Programming (OOP) in Java

## 📌 Table of Contents
- [🔰 Introduction](#-introduction)
- [📝 User-Defined Data Types](#-user-defined-data-types)
- [🏗️ Classes](#-classes)
- [🧱 Objects](#-objects)
- [📊 Array vs Class](#-array-vs-class)
- [🔍 Revisiting Scanner Class](#-revisiting-scanner-class)
- [📦 Classes Inside Main](#-classes-inside-main)
- [🔄 Passing Class to Functions](#-passing-class-to-functions)
- [📁 Class in Different File](#-class-in-different-file)
- [📌 Default Values of Attributes](#-default-values-of-attributes)
- [🔒 Access Modifiers](#-access-modifiers)
- [⚙️ Getters and Setters](#-getters-and-setters)
- [🔄 this Keyword](#-this-keyword)
- [🚀 Constructor](#-constructor)
- [🏗️ Types of Constructors](#-types-of-constructors)
- [🚫 final Keyword](#-final-keyword)
- [⚡ static Keyword](#-static-keyword)
- [🔧 Static Functions](#-static-functions)
- [🎭 Polymorphism (Function Overloading)](#-polymorphism-function-overloading)
- [👨‍👩‍👧‍👦 Inheritance](#-inheritance)
- [📦 Packages](#-packages)
- [🔒 Encapsulation](#-encapsulation)
- [🎭 Abstraction](#-abstraction)
- [🔌 Interfaces](#-interfaces)

---

## 🔰 Introduction
Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects." It allows developers to model real-world entities in code, improving modularity, reusability, and maintainability. 

Key principles of OOP include:
- **Encapsulation** 🛡️: Hiding data and only exposing necessary parts.
- **Abstraction** 🎭: Showing only essential details and hiding complexity.
- **Inheritance** 👨‍👩‍👧‍👦: Reusing code from existing classes.
- **Polymorphism** 🎭: Allowing one interface to be used for multiple implementations.

---

## 📝 User-Defined Data Types
User-defined data types allow programmers to define their own complex data structures using classes.

```java
class Person {
    String name;
    int age;
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "John";
        p1.age = 25;
        System.out.println("Name: " + p1.name + ", Age: " + p1.age);
    }
}
```

---

## 🏗️ Classes
A class is a blueprint for objects. It defines attributes (fields) and behaviors (methods) that objects can have.

```java
class Car {
    String brand;
    int speed;
}
```

---

## 🧱 Objects
Objects are instances of a class. They represent real-world entities and can interact with each other.

```java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.speed = 120;
        System.out.println("Car Brand: " + myCar.brand);
    }
}
```

---

## 📊 Array vs Class
- **Array**: Stores multiple values of the same type.
- **Class**: Can hold multiple attributes of different types and methods.

```java
int[] numbers = {1, 2, 3}; // Array Example
Car car1 = new Car(); // Class Example
```

---

## 🔍 Revisiting Scanner Class
The `Scanner` class is used to take user input in Java.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
```

---

## 📦 Classes Inside Main
Classes can be declared inside the `main` method but it's not a common practice.

```java
public class Main {
    static class InnerClass {
        void display() {
            System.out.println("Inside Inner Class");
        }
    }

    public static void main(String[] args) {
        InnerClass obj = new InnerClass();
        obj.display();
    }
}
```

---

## 🔄 Passing Class to Functions
Objects of a class can be passed as parameters to methods.

```java
class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

public class Main {
    static void printStudent(Student s) {
        System.out.println("Student Name: " + s.name);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        printStudent(s1);
    }
}
```

---

## 📁 Class in Different File
For better organization, classes can be stored in separate files.

```java
// File: Animal.java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
```

```java
// File: Main.java
public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
    }
}
```

---

## 📌 Default Values of Attributes
If attributes are not initialized, Java assigns default values.

```java
class Demo {
    int num; // Default: 0
    String text; // Default: null
}
```

---

## 🔒 Access Modifiers
Java provides access control using `public`, `private`, `protected`, and default.

```java
class Example {
    private int data = 10;
    public int getData() {
        return data;
    }
}
```

---

## ⚙️ Getters and Setters
Getters and setters are used to access private attributes.

```java
class Person {
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
```

---

This README provides a structured and engaging overview of Java OOP with detailed explanations and examples. 🚀 Let me know if you need more modifications! 🎯

