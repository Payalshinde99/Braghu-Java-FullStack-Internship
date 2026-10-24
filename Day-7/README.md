# Day 7: Library Management System

## Overview
The Library Management System is a console-based Java application developed as part of the Braghu Technology Java Full Stack Internship. It helps manage library books through a simple menu-driven interface.

## Features
- Add new books to the library
- Display all available and issued books
- Search books by ID
- Issue books to library members
- Return issued books
- Prevent duplicate book IDs
- Handle invalid input and library-related exceptions

## Technologies Used
- Java
- JDK
- Visual Studio Code
- Git and GitHub

## Concepts Used
- Classes and Objects
- Constructors
- Encapsulation
- Inheritance
- Abstraction
- Interfaces
- Method Overriding
- ArrayList
- Exception Handling
- Custom Exceptions
- Packages
- Switch Statements and Loops

## Project Structure

```text
Day-7/
├── README.md
└── src/
    └── library/
        ├── Book.java
        ├── Person.java
        ├── Member.java
        ├── LibraryOperations.java
        ├── LibraryException.java
        ├── Library.java
        └── Main.java
```

## How to Run the Project

### 1. Open the terminal
Navigate to the Day-7 project directory.

### 2. Compile the Java files

```powershell
javac -d out src\library\*.java
```

### 3. Run the application

```powershell
java -cp out library.Main
```

## Menu Options

1. Add Book
2. Display All Books
3. Search Book
4. Issue Book
5. Return Book
6. Exit

## Learning Outcomes
- Learned how to design a Java application using OOP principles.
- Practised implementing interfaces and inheritance.
- Used collections to store and manage books.
- Implemented custom exception handling.
- Learned how to organize Java files into packages.
- Practised compiling and running a multi-file Java project.

## Limitations
- Book information is stored in memory and is not retained after the application closes.
- The application uses a console-based interface.
- Database integration is not included.

## Author
Payal Shinde

## Internship
Braghu Technology — Java Full Stack Internship
