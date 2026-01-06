
---

# Student Management System

A robust, console-based Java application designed to manage student records efficiently. This project demonstrates core Java principles, including **Object-Oriented Programming (OOP)**, **File I/O (Serialization)**, **Exception Handling**, and **Collection Frameworks**.

## 🚀 Features

* **Add Student**: Create new student profiles with unique IDs.
* **View All Students**: Retrieve and display a list of all students currently in the system.
* **Search by ID**: Quickly find a specific student using their unique identification number.
* **Update Records**: Modify existing student details such as name, age, department, and marks.
* **Delete Student**: Remove student records from the database.
* **Data Persistence**: Student data is automatically saved to and loaded from a local file (`students.dat`) using Java Serialization, ensuring information is not lost when the program closes.

## 🛠️ Tech Stack

* **Language**: Java
* **Storage**: File-based persistence (Binary Serialization)
* **Architecture**: Layered Architecture (Model-Service-Utility)

## 📁 Project Structure

```text
studentmanagement/
├── Main.java                # Entry point of the application (CLI Menu)
├── model/
│   └── Student.java         # Student POJO (Plain Old Java Object)
├── service/
│   └── StudentService.java  # Business logic for CRUD operations
├── exception/
│   ├── DuplicateStudentException.java   # Custom exception for ID conflicts
│   └── StudentNotFoundException.java    # Custom exception for missing records
├── util/
│   └── FileUtil.java        # Utility class for file reading/writing
└── students.dat             # Data file where student records are stored

```

## 📋 Prerequisites

* **Java Development Kit (JDK)** 8 or higher.
* A terminal or IDE (IntelliJ IDEA, Eclipse, VS Code).

## ⚙️ How to Run

1. **Clone the Repository**:
```bash
git clone https://github.com/your-username/student-management-system.git
cd student-management-system

```


2. **Compile the Project**:
Navigate to the root directory and compile all `.java` files:
```bash
javac Main.java model/*.java service/*.java exception/*.java util/*.java

```


3. **Execute the Program**:
```bash
java Main

```



## 💡 Usage

Upon running the application, you will be presented with a menu:

1. **Add Student**: Provide ID, Name, Age, Department, and Marks.
2. **View All**: Displays all stored students.
3. **View By ID**: Enter an ID to fetch specific details.
4. **Update**: Enter an existing ID to overwrite student information.
5. **Delete**: Enter an ID to remove a student from the system.
6. **Exit**: Safely closes the application.

## ⚠️ Exception Handling

The system includes custom error handling to ensure stability:

* **`DuplicateStudentException`**: Prevents adding multiple students with the same ID.
* **`StudentNotFoundException`**: Handles cases where a user attempts to search, update, or delete an ID that does not exist.

---

**Next Step:** Would you like me to help you create a `.gitignore` file for this project to ensure your compiled `.class` files aren't uploaded to GitHub?
