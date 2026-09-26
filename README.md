# Lab 06 – Abstract Data Types (ADT)

## Course Information

**Course:** Software Constructions and Development
**Department:** Software Engineering
**University:** University of Engineering & Technology (UET), Peshawar, Pakistan
**Instructor:** Engr. Rizwan Shah
**Lab:** 06
**Topic:** Abstract Data Types (ADT)

---

## Student Information

**Student Name:** Hajra Parveen
**Registration No:** 24ABSWE0029

---

## Objective

The objective of this lab is to implement and understand basic Abstract Data Types (ADTs) in Java. The lab focuses on important Software Construction concepts including abstraction, interfaces, encapsulation, Java Collections, and unit testing with JUnit.

The lab also demonstrates the separation between an ADT's specification and its implementation.

---

## Software and Tools Used

* Java
* NetBeans IDE
* Maven
* JUnit 5
* GitHub

---

# Lab Tasks

## Task 1 – Implementing the Stack ADT

### Description

In this task, a stack was implemented using an array-based structure through the `ArrayStack` class.

The following operations were performed:

* Push `10`
* Push `20`
* Push `30`
* Pop the top element

The stack follows the **LIFO (Last In, First Out)** principle. Therefore, the `pop()` operation returns `30` because it was the last element inserted.

### Files

* `ArrayStack.java`
* `StackDemo.java`
* `ArrayStackTest.java`

### Testing

JUnit was used to verify that the `pop()` method returns the expected top element.

---

## Task 2 – Data Encapsulation

### Description

This task demonstrates the concept of **encapsulation** in Java. A `Student` class was created with private data members for:

* Student ID
* Student Name
* Student CGPA

Public getter methods were provided to access the private data.

The `StudentDemo` class demonstrates how student information can be accessed through these methods. Direct access to the private `id` variable from outside the class results in a compiler error.

### Files

* `Student.java`
* `StudentDemo.java`

### Concept Demonstrated

The task shows how encapsulation protects internal class data and provides controlled access through public methods.

---

## Task 3 – Programming to an Abstraction

### Description

This task demonstrates programming to an abstraction using the Java `List` interface.

A `List<String>` reference was used with two different implementations:

* `ArrayList`
* `LinkedList`

The same abstraction can work with different underlying implementations. This allows the client code to depend on the `List` interface rather than a specific collection class.

### File

* `Abstraction.java`

### Concept Demonstrated

This task demonstrates how programming to an interface provides flexibility and reduces dependency on a particular implementation.

---

## Task 4 – Library System ADT Design

### Description

A Library System ADT was designed using an interface and a concrete implementation.

The system manages information such as:

* Book
* Book ID
* Title
* Author

The following operations were defined:

* `addBook()`
* `removeBook()`
* `searchBook()`
* `issueBook()`
* `returnBook()`

The `LibrarySystem` interface defines the required operations, while `LibraryImplementation` provides their actual implementation.

The `LibrarySystemDemo` class was used to demonstrate the functionality of the library system.

### Files

* `LibrarySystem.java`
* `LibraryImplementation.java`
* `LibrarySystemDemo.java`

### Concept Demonstrated

This task demonstrates how an interface can define an ADT specification while a separate class provides its implementation.

---

## Task 5 – Student Management System

### Description

In this task, a Student Management ADT was developed using the `StudentCollection1` interface.

The interface defines operations for managing student records:

* `addStudent(Student1 student)`
* `removeStudent(int id)`
* `findStudent(int id)`
* `getSize()`
* `isEmpty()`

The `StudentImplementation1` class provides the concrete implementation of these operations. Student IDs are used to identify and manage student records.

JUnit tests were created in `StudentCollectionTest1` to verify the behavior of the student collection.

### Files

* `Student1.java`
* `StudentCollection1.java`
* `StudentImplementation1.java`
* `StudentCollectionTest1.java`

### Concept Demonstrated

This task demonstrates the separation of **specification and implementation** using an interface-based ADT design.

---

# Project Structure

```text
Lab6/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── mycompany/
│   │               └── lab6/
│   │                   ├── Abstraction.java
│   │                   ├── ArrayStack.java
│   │                   ├── LibraryImplementation.java
│   │                   ├── LibrarySystem.java
│   │                   ├── LibrarySystemDemo.java
│   │                   ├── StackDemo.java
│   │                   ├── Student.java
│   │                   ├── Student1.java
│   │                   ├── StudentCollection1.java
│   │                   ├── StudentDemo.java
│   │                   └── StudentImplementation1.java
│   │
│   └── test/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── lab6/
│                       ├── ArrayStackTest.java
│                       └── StudentCollectionTest1.java
│
├── pom.xml
└── README.md
```

> The exact folder structure may vary slightly depending on the NetBeans/Maven project configuration.

---

# Testing

JUnit 5 was used to test the implemented ADT operations.

The test classes include:

* `ArrayStackTest.java`
* `StudentCollectionTest1.java`

The tests were used to verify that the implemented methods produce the expected results.

To run the tests using Maven:

```bash
mvn test
```

---

# Key Concepts Learned

This lab provided practical experience with the following Software Construction concepts:

* Abstract Data Types (ADT)
* Stack and LIFO behavior
* Data encapsulation
* Interfaces
* Abstraction
* Programming to an abstraction
* Separation of specification and implementation
* Java Collections
* JUnit 5 testing
* Maven project structure

---

# Overall Result

All five tasks of the Abstract Data Types lab were successfully implemented and tested. The implementations demonstrated how abstraction and interfaces can be used to separate the required behavior of a system from its implementation details.

The lab also provided practical experience with Java Collections, encapsulation, interface-based design, and JUnit testing.

---

# Reflection

This lab improved my understanding of Abstract Data Types and their role in Software Construction. I learned how a Stack follows the LIFO principle and how operations such as `push()` and `pop()` are used to manage its elements.

I also learned how encapsulation protects class data by keeping variables private and providing controlled access through methods. The programming-to-an-abstraction task helped me understand how the same `List` reference can work with different implementations such as `ArrayList` and `LinkedList`.

The Library System and Student Management System tasks helped me understand how interfaces can be used to define the required operations of an ADT while keeping the implementation separate. Finally, JUnit testing helped me verify that the implemented operations were working as expected.

Overall, this lab strengthened my practical understanding of abstraction, encapsulation, interfaces, collections, ADT design, and unit testing in Java.

---

## Author

**Hajra Parveen**
**Registration No:** 24ABSWE0029
**Department:** Software Engineering
**University of Engineering & Technology, Peshawar**

---

## License

This project was developed as part of the **Software Constructions and Development** course for academic purposes.
