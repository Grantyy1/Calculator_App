# Calculator App :fax:

## Introduction
This Java application allowes a user to do mathematical calulations. This calculator has the ability to multiply, divide, add, subtract, power and square root.

---

## 📑 Table of Contents
- [📌Features](#features)
- [🖥️Console Code](#console-code)
- [📂Code Structure](#code-structure)
- [🛠️Technologies Used](#technologies-used)
- [📜License](#license)
- [Future Enhancements](#future-enhancements)
- [👥Authors](#authors)
--- 
## Features

### Calculator Memory:
      Stores, adds and subtracts current calculator value in memory. Itc can clear and recall the memory value for calculations.

### Basic Mathematics 
      - Addition: Adds a number to the current stored value.
      - Subtraction: Subtracts number from the current stored value.
      - Multiplication: Multiplies the current stored value by a number.
      - Division: Divides the current value by a number (with division by zero error handling)
      
### Advanced mathematics: 
      - Power exponent: Raises the current stored value to a specified power
      - Square Root exponent: Calculates the square root of the current value.
      
### Precision
      - Customizable decimal precision between (0-10 decimal places)
      - It adapts all calculations and display to the specified precision chosen

## Console Code for the App

      Calculator On 
      Calculator Cleared
      Calculator Precision is 2 decimal places. 

               0.00 
      +       10.22
      =============
              10.22
              
              10.22
      -        2.22
      =============
               8.00
               
      Memory Add                8.00
      
             2.0000
               8.00
      *       10.00
      =============
              80.00
              
      Memory Subtract         -72.00
      
              80.00
      /        2.00
      =============
              40.00
              
      Calculator Precision is 4 decimal places. 
      
            40.0000 
      ^      2.0000
      =============
         1,600.0000
      
      √ 1,600.0000
      =============
            40.0000
      
      Using memory value
            40.0000
      +    -72.0000
      =============
           -32.0000
  
      Memory Cleared 0.0000

      Calculator Cleared

**Calculator App**

├── **Input.java**        # Class representing the Users Input

<img src="https://github.com/Grantyy1/Pet_Store_App_2.0/blob/main/petstore/App/Input.java" alt="Input.java"/>

├── **PetStoreApp**         # Main application to interact with the user

<img src="https://github.com/Grantyy1/Pet_Store_App_2.0/blob/main/petstore/App/PetStoreApp.java" alt="PetStoreApp"/>

---

## Project Structure
      Project is divided into 2 interfaces and 4 classes:
      
# Interfaces:
      BasicMath.java: Defines basic arithmetic operations
      - add()
      - subtract()
      - multiply()
      - divide()
      AdvanceMath.java: Defines advanced mathematical operations
      - pow()
      - sqrt()

# Classes:
      Calculator.java: Abstract base class implementing BasicMath
            - Handles basic operations and display functionality
            - Maintains current and previous values
            - Provides clear functionality

      MemoryCalc.java: Extends Calculator
            - Adds memory storage functionality
            - Methods for memory operations (add, subtract, clear, display)

      AdvanceCalc.java: Extends MemoryCalc and implements AdvanceMath
            - Adds advanced mathematical operations
            - Customizable decimal precision
            - Enhanced display formatting

      TestBench.java: Main application class
            - Demonstrates calculator functionality
            - Tests various operations in sequence

---
## Class Diagram
      - A UML class diagram is included in this repository.
      
<img src="https://github.com/Grantyy1/Pet_Store_App_2.0/blob/main/PetStoreUML.jpg" alt="Profile Picture" /> 
      
--- 

## Technologies Used
- ![Amazon Corretto](https://img.shields.io/badge/Amazon_Corretto-blue?style=for-the-badge&logo=amazon-aws&logoColor=white)
- ![Java Version](https://img.shields.io/badge/Java-17-blue)
- ![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
---
## License
- ![License](https://img.shields.io/badge/License-MIT-green)
- Copyright &copy; 2025 Grant Peverett. All rights reserved.**
---
## Author

👨‍💻 **Grant Peverett**

<img src="https://github.com/Grantyy1/Banking_App_2.0/blob/10657c1f1040e8041bc3800c4b000588742cfc73/Assets/8023B029-A886-4B1A-8DF6-1A7132D34B6A%20(1).JPG" alt="Profile Picture" width="100" /> 

- **Grant Peverett GitHub Profile**: [Grantyy1](https://github.com/Grantyy1)
  
- **Email**: [grpeve01@wsc.edu]

[⬆️ Return to Top](#overview)
