# JavaUtils: File System Exercises

👨‍💻 Author: Lucy Castro

🧠 Learning Focus: Java File I/O, Serialization, and Command Line Execution

🛠️ IDE: IntelliJ IDEA

💡 Java SDK: 21

## 📄 Description
This repository contains Java exercises focused on:

- **Directory listing and traversal**

- **File I/O operations**

- **Object serialization/deserialization**

- **Command line execution**

## 💻 Technologies Used

☕ Java 21

🧠 IntelliJ IDEA  

⌨️ Command Line Tools

## 📋 Requirements
✅ Java JDK 21

✅ IDE (IntelliJ IDEA or Eclipse)

✅ Basic command line knowledge

## 🛠️ Installation

git clone https://github.com/Lucy-SD/S1T5_JavaUtils

cd java-jutils-exercises

## 📚 Exercise Catalog
### 📂 Level 1: File System Operations

<details> <summary><b>Exercise 1: Directory Lister</b></summary>

Create a class that lists alphabetically the contents of a directory received by parameter.

</details>


<details> <summary><b>Exercise 2: Recursive Directory Tree</b></summary>

Add to the class from the previous exercise the functionality of listing a directory tree with the content of all its levels (recursively) so that they are printed on the screen in alphabetical order within each level, also indicating whether it is a directory (D) or a file (F), and its last modification date.


</details>


<details> <summary><b>Exercise 3: File Output</b></summary>

Modify the previous exercise. Now, instead of displaying the result on the screen, save the result in a TXT file.

</details>

<details> <summary><b>Exercise 4: File Reader</b></summary>


Adds the functionality to read any TXT file and display its contents via console.

</details>


<details> <summary><b>Exercise 5: Object Serialization</b></summary>


Now the program must serialize a Java Object to a .ser file and then deserialize it.

</details>

<details> <summary><b> 📝 readme.txt (Command Line Instructions)</b></summary>
text
=== COMPILATION & EXECUTION INSTRUCTIONS ===

1. First compile all Java files:
javac -d out src/*.java

2. Run specific exercises:

Exercise 1: Basic Directory Listing
java -cp out DirectoryLister /path/to/directory

Exercise 2: Recursive Directory Tree
java -cp out RecursiveDirectoryLister /path/to/directory

Exercise 3: Save Directory Tree to File
java -cp out DirectoryTreeToFile /path/to/directory output.txt

Exercise 4: Display TXT File Contents
java -cp out FileReader input.txt

Exercise 5: Serialization Demo
java -cp out SerializationDemo

</details>


## 🎯 Learning Goals

✅ Java File I/O operations

✅ Directory traversal

✅ Object serialization/deserialization

✅ Command line compilation and execution

✅ Cross-platform path handling

## 🏆 Best Practices Implemented
✔ Used File.separator for path compatibility
✔ Followed clean code principles
✔ Implemented proper exception handling
✔ Used relative paths in code
✔ Programmed in English

## 🤝 Contributions

⭐ Star the repository

🍴 Fork the project

📥 Create a pull request

## 🌐 Deployment

For educational purposes only.

## 🚀 Thanks for Visiting!
