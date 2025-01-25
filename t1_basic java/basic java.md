
# Mastering Java Basics - Your Gateway to Programming!

Welcome to the world of Java! This guide is your starting point for understanding the foundational concepts of Java programming. Whether you're a beginner or brushing up on your skills, these topics will help you build a strong base. Let's dive in with definitions, examples, and hands-on explanations!

---

## 1. User Input / Output
🎤 **Definition:**
User Input and Output enable interaction between the program and the user. In Java, you can use the `Scanner` class for input and `System.out` for output.

💡 **Example:**
```java
import java.util.Scanner;

public class UserInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name + "! Let's code together!");
    }
}
```
🛠️ **Try This:** Modify the program to ask for the user's age and print a personalized greeting.

---

## 2. Data Types
🔢 **Definition:**
Data types define the type of value a variable can store. Java offers a variety of types, including `int` for integers, `float` for decimals, and `boolean` for true/false values.

💡 **Example:**
```java
public class DataTypesExample {
    public static void main(String[] args) {
        int age = 23;
        float height = 5.9f;
        char initial = 'J';
        boolean lovesJava = true;

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Initial: " + initial);
        System.out.println("Loves Java? " + lovesJava);
    }
}
```
🛠️ **Try This:** Add more data types, like `double` or `long`, and print their values.

---

## 3. If-Else Statements
🤔 **Definition:**
If-Else statements allow your program to make decisions. Use them to execute different code blocks based on conditions.

💡 **Example:**
```java
public class IfElseExample {
    public static void main(String[] args) {
        int number = 42;
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}
```
🛠️ **Try This:** Add a check for whether the number is positive, negative, or zero.

---

## 4. Switch Statements
🎚️ **Definition:**
Switch statements make multi-way decisions simpler. Use them to replace long chains of `if-else` statements when checking a single variable.

💡 **Example:**
```java
public class SwitchExample {
    public static void main(String[] args) {
        int month = 7;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 7:
                System.out.println("July");
                break;
            default:
                System.out.println("Not January or July");
        }
    }
}
```
🛠️ **Try This:** Extend the switch case to print all months of the year.

---

## 5. What are Arrays and Strings?
📚 **Definition:**
- Arrays are collections of elements of the same type, like a bookshelf holding books.
- Strings are sequences of characters, treated as objects in Java.

💡 **Example:**
```java
public class ArraysStringsExample {
    public static void main(String[] args) {
        // Array Example
        int[] scores = {95, 85, 75};
        for (int score : scores) {
            System.out.println("Score: " + score);
        }

        // String Example
        String greeting = "Hello, Java World!";
        System.out.println(greeting);
    }
}
```
🛠️ **Try This:** Create a program that reverses an array or string.

---

## 6. Loops
🔄 **Definition:**
Loops are used to repeat a block of code multiple times. Java provides several types of loops: `for`, `while`, and `do-while`.

### Types of Loops:
1. **For Loop** - Ideal for known iterations.
2. **While Loop** - Executes as long as the condition is true.
3. **Do-While Loop** - Executes at least once before checking the condition.

💡 **Examples:**

### For Loop:
```java
public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Counting: " + i);
        }
    }
}
```

### While Loop:
```java
public class WhileLoopExample {
    public static void main(String[] args) {
        int countdown = 5;
        while (countdown > 0) {
            System.out.println("Countdown: " + countdown);
            countdown--;
        }
        System.out.println("Blast off!");
    }
}
```

### Do-While Loop:
```java
public class DoWhileExample {
    public static void main(String[] args) {
        int count = 1;
        do {
            System.out.println("Iteration: " + count);
            count++;
        } while (count <= 5);
    }
}
```

🛠️ **Try This:** Use each loop to calculate the factorial of a number or print a multiplication table.

---

## 7. Functions (Pass by Reference and Value)
🔧 **Definition:**
Functions (or methods) perform specific tasks. In Java, primitive data types are passed by value, while objects are passed by reference.

💡 **Example:**
```java
public class FunctionsExample {
    public static void main(String[] args) {
        int number = 10;
        multiplyByTwo(number);
        System.out.println("Original number: " + number);
    }

    public static void multiplyByTwo(int value) {
        value *= 2;
        System.out.println("Doubled value: " + value);
    }
}
```
🛠️ **Try This:** Create a function to calculate the sum of an array.

---

## 8. Time Complexity
⏳ **Definition:**
Time complexity measures the efficiency of an algorithm as input size grows. 

💡 **Example:**
For linear search:
```java
public class TimeComplexityExample {
    public static void main(String[] args) {
        int[] array = {3, 6, 8, 12, 14};
        int target = 12;

        boolean found = false;
        for (int num : array) {
            if (num == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Target found!");
        } else {
            System.out.println("Target not found.");
        }
    }
}
```
🛠️ **Try This:** Write a program to compare the time complexity of bubble sort and insertion sort.

---

🌟 Feel free to experiment with these examples, tweak the code, and embark on your Java journey. Happy coding!
