# Java-OOP-labtasks
Java OOP lab tasks covering basic problems, core OOP concepts, and advanced topics such as multithreading and exception handling.

---

### 03. Quadratic Equation Roots
- Equation: `ax^2 + bx + c = 0`  
- Uses discriminant `D = b^2 - 4ac`.  
  - If `D > 0` → Two real roots.  
  - If `D = 0` → One real root.  
  - If `D < 0` → No real roots.  
- Prompts the user for `a, b, c` and displays the result.  
- Use `Math.pow(x, 0.5)` for square root calculations.

---

### 04. Currency Converter (USD ↔ BDT)
- Prompts the user to enter the exchange rate from USD to BDT.  
- Asks the user to enter:  
  - `0` → Convert from USD to BDT  
  - `1` → Convert from BDT to USD  
- Prompts for the amount and displays the converted value.

---

### 05. Point Inside Circle Check
- Prompts the user to enter the circle’s center `(p, q)` and radius `r`.  
- Prompts the user to enter a point `(x, y)`.  
- Checks whether the point lies inside the circle.  

**Examples:**
- `(4, 5)` is inside the circle centered at `(0, 0)` with radius `10`.  
- `(9, 9)` is outside the circle.  

---

### 06. Reverse a String
- Reverse a given string without using built-in reverse methods.  

**Example:**  
Input: `"hello"` → Output: `"olleh"`  

---

### 07. Check if a String is a Palindrome
- Determine if a string reads the same backward and forward.  

**Examples:**  
- Input: `"racecar"` → Output: `true`  
- Input: `"hello"` → Output: `false`  

---

### 08. Count the Number of Occurrences of a Substring
- Given a string and a pattern, count how many times the pattern appears.  

**Example:**  
Input: `"ababab"`, pattern = `"ab"` → Output: `3`  

---
## 📂 Lab 2: More Basic & Number Problems

### 01. Grading System
- A school has the following rules for grading:
  - Below 25 → F  
  - 25 to 45 → E  
  - 45 to 50 → D  
  - 50 to 60 → C  
  - 60 to 80 → B  
  - Above 80 → A  
- Ask the user to enter marks and print the corresponding grade.

---

### 02. Triangle Type Checker
- Write a program to check whether a triangle is **Equilateral, Isosceles, or Scalene**.  

**Test Data:**  
Input: `50 50 60`  
Output: `This is an isosceles triangle.`

---

### 03. Next Prime Finder
- Create a function that returns the **next prime number**.  
- If the input is already prime, return the number itself.  

**Examples:**  
- `nextPrime(12) ➞ 13`  
- `nextPrime(24) ➞ 29`  
- `nextPrime(11) ➞ 11`  

---

### 04. Factorial Calculation
- Write a program to calculate the factorial of a given number.  

**Test Data:**  
Input: `5`  
Output: `The Factorial of 5 is: 120`

---

### 05. Armstrong Number Check
- An **Armstrong number** (Narcissistic number) is equal to the sum of its digits raised to the power of the number of digits.  

**Examples:**  
- `153 → 1³ + 5³ + 3³ = 153` (Armstrong)  
- `125 → 1³ + 2³ + 5³ = 134` (Not Armstrong)  
- `1634 → 1⁴ + 6⁴ + 3⁴ + 4⁴ = 1634` (Armstrong)  

Write a program to check if a number is Armstrong or not.

---

### 06. Count Non-Prime Numbers
- Create a function that counts how many numbers are **not prime** up to a given integer.  

**Examples:**  
- `notPrimeNumbers(10) ➞ 6` → {1, 4, 6, 8, 9, 10}  
- `notPrimeNumbers(5) ➞ 2` → {1, 4}  

---

### 07. Rectangle Area and Perimeter
- Write a program to calculate the **area** and **perimeter** of a rectangle.  

**Test Data:**  
Width = `5.5`, Height = `8.5`  

**Expected Output:**  
- Area = `47.60`  
- Perimeter = `28.20`

---

### 08. Swap Two Variables
- Write a program to swap two variables **without using a third variable**.

---

### 09. Reverse an Integer
- Create a function that reverses the digits of an integer.  

**Examples:**  
- `rev(5121) ➞ 1215`  
- `rev(69) ➞ 96`  
- `rev(-122157) ➞ 751221`  

*(If the number is negative, treat it as positive before reversing.)*

---

### 10. Sum of the First 100 Prime Numbers
- Write a program to compute the sum of the **first 100 prime numbers**.  

**Expected Output:**  
`Sum of the first 100 prime numbers: 24133`

---
Lab-3:
# Lab-3: Java Programming Exercises

This repository contains solutions to the programming exercises for Lab-3, implemented in Java. Each program addresses a specific problem as described below. The programs are designed to be simple, readable, and well-commented to facilitate understanding.

## Prerequisites
- Java Development Kit (JDK) 8 or higher
- A Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor with command-line compilation tools

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/lab-3.git
   ```
2. Navigate to the project directory:
   ```bash
   cd lab-3
   ```
3. Compile and run each Java file using:
   ```bash
   javac <filename>.java
   java <filename>
   ```

## Programs

### 1. CheckOddEven
- **File**: `CheckOddEven.java`
- **Description**: Checks if a given integer is odd or even and prints "Odd Number" or "Even Number" accordingly. Always prints "bye!" before exiting.
- **Example Output**:
  ```
  Odd Number
  bye!
  ```

### 2. Fibonacci
- **File**: `Fibonacci.java`
- **Description**: Prints the first 20 Fibonacci numbers and calculates their harmonic mean. The Fibonacci sequence is defined as F(n) = F(n-1) + F(n-2), with F(1) = F(2) = 1.
- **Example Output**:
  ```
  The first 20 Fibonacci numbers are:
  1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
  The average is [calculated harmonic mean]
  ```

### 3. SquarePattern
- **File**: `SquarePattern.java`
- **Description**: Prompts the user for a size (non-negative integer) and prints a square pattern of '#' characters using nested for-loops.
- **Example Output** (for size 5):
  ```
  # # # # #
  # # # # #
  # # # # #
  # # # # #
  # # # # #
  ```

### 4. Triangle Patterns
- **Files**: `TrianglePatternA.java`, `TrianglePatternB.java`
- **Description**: Two programs that prompt the user for the number of rows and print triangular patterns:
  - **Pattern A**: A right-aligned triangle of '#' characters with increasing width.
  - **Pattern B**: An inverted triangle of '#' characters with decreasing width.
- **Example Output** (for rows = 6):
  - Pattern A:
    ```
         #
       # # #
     # # # # #
   # # # # # # #
 # # # # # # # # #
# # # # # # # # # # #
    ```
  - Pattern B:
    ```
# # # # # # # # # # #
 # # # # # # # # #
   # # # # # # #
     # # # # #
       # # #
         #
    ```

### 5. Number Patterns
- **Files**: `NumberPatternA.java`, `NumberPatternB.java`, `NumberPatternC.java`, `NumberPatternD.java`
- **Description**: Four programs that prompt the user for a size and print different number-based patterns:
  - **Pattern A**: Left-aligned increasing numbers.
  - **Pattern B**: Centered increasing numbers.
  - **Pattern C**: Left-aligned decreasing numbers.
  - **Pattern D**: Right-aligned decreasing numbers.
- **Example Output** (for size = 8):
  ```
  1                    1 2 3 4 5 6 7 8                          1      8 7 6 5 4 3 2 1
  1 2                    1 2 3 4 5 6 7                       2 1      7 6 5 4 3 2 1
  1 2 3                    1 2 3 4 5 6                    3 2 1      6 5 4 3 2 1
  1 2 3 4                    1 2 3 4 5                 4 3 2 1      5 4 3 2 1
  1 2 3 4 5                    1 2 3 4              5 4 3 2 1      4 3 2 1
  1 2 3 4 5 6                    1 2 3           6 5 4 3 2 1      3 2 1
  1 2 3 4 5 6 7                    1 2        7 6 5 4 3 2 1      2 1
  1 2 3 4 5 6 7 8                    1     8 7 6 5 4 3 2 1      1
  ```

### 6. GuessNumber
- **File**: `GuessNumber.java`
- **Description**: Generates a random number and prompts the user to guess it, providing feedback ("Too high, try again" or "Too low, try again") until the correct guess is made.
- **Example Output**:
  ```
  Enter your guess: 50
  Too high, try again.
  Enter your guess: 25
  Too low, try again.
  Enter your guess: 42
  Correct!
  ```

### 7. StarNumberPattern
- **File**: `StarNumberPattern.java`
- **Description**: Uses three for-loops to print a pattern of increasing numbers followed by asterisks.
- **Example Output**:
  ```
  1******
  12*****
  123****
  1234***
  12345**
  123456*
  1234567
  ```

### 8. Palindrome
- **File**: `Palindrome.java`
- **Description**: Checks if a given integer is a palindrome (reads the same forwards and backwards).
- **Example Output**:
  ```
  Input number: 54789
  Not a Palindrome.
  Input number: 02022020
  It is a Palindrome.
  ```

### 9. SeparateEvenOdd
- **File**: `SeparateEvenOdd.java`
- **Description**: Takes an array of integers and rearranges it to place all even numbers before odd numbers.
- **Example Output**:
  ```
  Original array: [1, 2, 3, 4, 5, 6]
  Sorted array: [2, 4, 6, 1, 3, 5]
  ```

### 10. WhileLoopPatterns
- **Files**: `WhileLoopPatternA.java`, `WhileLoopPatternB.java`
- **Description**: Two programs that use while-loops to print number-based triangular patterns:
  - **Pattern A**: Centered increasing numbers (e.g., 1, 222, 33333).
  - **Pattern B**: Centered numbers with a mirrored pattern (e.g., 1, 212, 32123).
- **Example Output**:
  - Pattern A:
    ```
          1
        222
      33333
    4444444
  555555555
    ```
  - Pattern B:
    ```
          1
        212
      32123
    4321234
  543212345
    ```

## Usage
Each program can be run independently. Navigate to the project directory, compile the desired Java file, and run it. For example:
```bash
javac CheckOddEven.java
java CheckOddEven
```


## Programs

### 11. SeriesSum
- **Description**: Calculates the sum of the series `1 + 1/2 + 1/3 + ... + 1/n`, where `n` is a user-provided positive integer.
- **Example Input/Output**:
  ```
  Enter n: 5
  Sum of series: 2.283333333333333
  ```
  

### 12. GCD
- **Description**: Computes the Greatest Common Divisor (GCD) of two user-provided integers using a for-loop and if-statement.
- **Example Input/Output**:
  ```
  Enter two numbers: 48 18
  GCD: 6
  ```

### 13. PascalsTriangle
- **Description**: Prints Pascal's Triangle up to `n` rows using a while-loop, where `n` is a user-provided integer.
- **Example Input/Output** (for n = 6):
  ```
           1
         1   1
       1   2   1
     1   3   3   1
   1   4   6   4   1
 1   5  10  10   5  1
  ```
  ```

### 14. Factorial
- **Description**: Calculates the factorial of a user-provided non-negative integer.
- **Example Input/Output**:
  ```
  Enter a number: 5
  Factorial: 120
  ```

### 15. ReverseNumber
- **Description**: Reverses a user-provided integer using a do-while loop.
- **Example Input/Output**:
  ```plaintext
  Input number: 54789
  The reversed number is: 98745
  ```

### 16. NumberRhombus
- **Description**: Prints a rhombus structure of numbers based on a user-provided integer.
- **Example Input/Output** (for n = 7):
  ```plaintext
      1
     2 1 2
    3 2 1 2 3
   4 3 2 1 2 3 4
  5 4 3 2 1 2 3 4 5
 6 5 4 3 2 1 2 3 4 5 6
7 6 5 4 3 2 1 2 3 4 5 6 7
 6 5 4 3 2 1 2 3 4 5 6
  5 4 3 2 1 2 3 4 5
   4 3 2 1 2 3 4
    3 2 1 2 3
     2 1 2
      1
  ```

### 17. Weekday
- **Description**: Takes an integer between 1 and 7 and displays the corresponding weekday name.
- **Example Input/Output**:
  ```plaintext
  Input number: 3
  Wednesday
  ```

### 18. LeapYear
- **Description**: Determines if a user-provided year is a leap year.
- **Example Input/Output**:
  ```plaintext
  Input the year: 2016
  2016 is a leap year
  ```

### 19. SinX
- **Description**: Computes the sine of `x` using the series `sin(x) = x - x^3/3! + x^5/5! - ...` up to the term involving `x^n`, where `x` and `n` are user-provided.
- **Example Input/Output**:
  ```plaintext
  Enter x: 1.0
  Enter n: 5
  Sin(1.0) = 0.8414709848078965
  ```

### 20. CosX
- **Description**: Computes the cosine of `x` using the series `cos(x) = 1 - x^2/2! + x^4/4! - ...` up to the term involving `x^n`, where `x` and `n` are user-provided.
- **Example Input/Output**:
  ```plaintext
  Enter x: 1.0
  Enter n: 5
  Cos(1.0) = 0.5403023058681398
  ```
# Lab-4: Java Object-Oriented Programming Exercises

This repository contains solutions to the programming exercises for Lab-4, implemented in Java. The exercises focus on object-oriented programming concepts such as class definitions, constructors, getters/setters, object arrays, and class diagrams. Each problem includes a description and specifications as provided.

## Prerequisites
- Java Development Kit (JDK) 8 or higher
- A Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor with command-line compilation tools

## Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/lab-4.git
   ```
2. Navigate to the project directory:
   ```bash
   cd lab-4
   ```
3. Compile and run each Java file using:
   ```bash
   javac <filename>.java
   java <filename>
   ```

## Exercises

### A. Writing Class Definition
- **Description**: Define a class `Icecream` with the following instance variables:
  - `icecreamType` (String)
  - `icecreamCompany` (String)
  - `icecreamPrice` (double)
- **Specifications**:
  - Instance variables have default access (no public or private modifier).
  - Define constructors:
    - A parameterized constructor that sets all attribute values.
    - A default constructor (optional, based on implementation).
  - Define an instance method `toString()` that returns a string containing the ice cream's information.

### B. Demonstrating Class Functionalities
- **Description**: Create a `Main` class with a `main()` method to demonstrate `Icecream` class functionality.
- **Specifications**:
  - Create two `Icecream` objects using both constructors.
  - Print their values using the `toString()` method.

### C. Introducing Private Access Specifier and Setters/Getters
- **Description**: Modify the `Icecream` class to use private access specifiers for instance variables and add setters and getters for data encapsulation.
- **Specifications**:
  - Instance variables are private to achieve data hiding.
  - Define setters and getters:
    - `setIcecreamType(String icecreamType)`: Sets the ice cream type.
    - `getIcecreamType()`: Returns the ice cream type.
    - Similar setters and getters for `icecreamCompany` and `icecreamType`.
  - Remove previous constructors and define a new constructor that sets `icecreamPrice` to zero.

### D. Passing Objects to Methods
- **Description**: Enhance the `Icecream` class to support passing objects to methods.
- **Specifications**:
  - Add an `equals(Icecream I)` method that returns `true` if the price of the caller object equals the price of the parameter object; `false` otherwise.
  - Add a `compareTo(Icecream I)` method that returns:
    - `1` if the caller object's price is higher.
    - `0` if prices are equal.
    - `-1` if the caller object's price is lower.
  - Objects are passed by reference, unlike primitive types which are passed by value.

### E. Array of Objects
- **Description**: Demonstrate the creation of an array of `Icecream` objects.
- **Specifications**:
  - An array of objects is an array of reference variables.
  - Example: `Icecream[] IcecreamArray = new Icecream[10];`

### F. Introducing Class Diagram
- **Description**: Represent the `Icecream` class using a class diagram.
- **Class Diagram**:
  ```plaintext
  +-------------------+
  |     Icecream      |
  +-------------------+
  | icecreamType: String |
  | icecreamCompany: String |
  | icecreamPrice: double |
  +-------------------+
  | +Icecream() |
  | +Icecream(icecreamType: String, icecreamCompany: String, icecreamPrice: double) |
  | +toString(): String |
  +-------------------+
  ```

## Lab Problems

### 01. Icecream Array and Search
- **Description**: Create an array of `Icecream` objects and implement a search method.
- **Specifications**:
  - Create an array of `Icecream` objects with a minimum size of 5.
  - Initialize the objects with user input.
  - Implement a static method `searchByCompany` in the `Main` class that takes a `String` parameter (company name) and prints information for all ice creams manufactured by that company.

### 02. Book Class and Array
- **Description**: Implement a `Book` class and demonstrate its functionality with an array of objects.
- **Class Diagram**:
  ```plaintext
  +-------------------+
  |       Book        |
  +-------------------+
  | -title: String    |
  | -author: String   |
  | -pages: int       |
  +-------------------+
  | +Book()           |
  | +Book(title: String, author: String, pages: int) |
  | +toString(): String |
  | +compareTo(b: Book): int |
  +-------------------+
  ```
- **Specifications**:
  - Create a `Main` class with a `main()` method.
  - Define an array of `Book` objects of size 5 and instantiate them with user input.
  - Implement a static method `displayAll()` to print all `Book` objects' data.
  - Use the `compareTo(Book b)` method to compare two `Book` objects based on their page count:
    - Returns `1` if the caller object has more pages.
    - Returns `0` if page counts are equal.
    - Returns `-1` if the caller object has fewer pages.
  - Print the result of `compareTo()`.
  - Implement a static method `isHeavier(Book b)` in the `Main` class that returns `true` if the book’s page count is greater than 500; `false` otherwise.
  - Demonstrate the functionality of `isHeavier()` in the `main()` method.

### 03. Fraction Class and Operations
- **Description**: Implement a `Fraction` class to perform arithmetic operations and test its methods.
- **Class Diagram**:
  ```plaintext
  +-------------------+
  |     Fraction      |
  +-------------------+
  | -numerator: int   |
  | -denominator: int |
  +-------------------+
  | +Fraction()       |
  | +Fraction(numerator: int, denominator: int) |
  | +add(f: Fraction): void |
  | +sub(f: Fraction): void |
  | +mul(f: Fraction): void |
  | +div(f: Fraction): void |
  | +toString(): String |
  +-------------------+
  ```
- **Specifications**:
  - Implement methods for fraction arithmetic:
    - `add(Fraction f)`: Adds two fractions and stores the result in the calling object (e.g., `1/4 + 3/5 = (1*5 + 3*4)/(4*5) = 17/20`).
    - `sub(Fraction f)`: Subtracts the parameter fraction from the calling object.
    - `mul(Fraction f)`: Multiplies the calling object by the parameter fraction.
    - `div(Fraction f)`: Divides the calling object by the parameter fraction.
  - Implement `toString()` to return the fraction in the format `numerator/denominator` (e.g., `1/2`).
  - Write a test program that:
    - Creates two `Fraction` objects.
    - Prints both objects.
    - Tests `add`, `sub`, `mul`, and `div` methods, printing the calling object after each operation.



