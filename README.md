# Java-OOP-labtasks
Java OOP lab tasks covering basic problems, core OOP concepts, and advanced topics such as multithreading and exception handling.

---

##  Lab 1: Basic Problems 

### 01. Divisibility Check (2 or 3, but not both)
- Reads an integer from the console.  
- Determines whether the number is divisible by either 2 or 3, but not both.  
- Prints `TRUE` if the condition is met, otherwise prints `FALSE`.

---

### 02. Minutes to Years and Days Conversion
- Prompts the user to enter a number of minutes (e.g., 1 billion).  
- Calculates and displays the equivalent number of years and days.  
- Assume 1 year = 365 days.
**Output:**  
Enter the number of minutes: 1000000000
1000000000 minutes is approximately X years and Y days
  
**Example Output:**
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
##  Lab 2: Basic Number Problems

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
# Lab-3: Loop problems

### 1. Check Odd Even
- **Description**: Checks if a given integer is odd or even and prints "Odd Number" or "Even Number" accordingly. Always prints "bye!" before exiting.
- **Example Output**:
  ```
  Odd Number
  bye!
  ```

### 2. Fibonacci
- **Description**: Prints the first 20 Fibonacci numbers and calculates their harmonic mean. The Fibonacci sequence is defined as F(n) = F(n-1) + F(n-2), with F(1) = F(2) = 1.
- **Example Output**:
  ```
  The first 20 Fibonacci numbers are:
  1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
  The average is [calculated harmonic mean]
  ```

### 3. Square Pattern
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
    # # # # # # # # # # # ```
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
- **Description**: Four programs that prompt the user for a size and print different number-based patterns:
  - **Pattern A**: Left-aligned increasing numbers.
  - **Pattern B**: Centered increasing numbers.
  - **Pattern C**: Left-aligned decreasing numbers.
  - **Pattern D**: Right-aligned decreasing numbers.
- **Example Output** (for size = 8):
  ```
  1                    1 2 3 4 5 6 7 8                          1      8 7 6 5 4 3 2 1
  1 2                    1 2 3 4 5 6 7                        2 1      7 6 5 4 3 2 1
  1 2 3                    1 2 3 4 5 6                      3 2 1      6 5 4 3 2 1
  1 2 3 4                    1 2 3 4 5                    4 3 2 1      5 4 3 2 1
  1 2 3 4 5                    1 2 3 4                  5 4 3 2 1      4 3 2 1
  1 2 3 4 5 6                    1 2 3                6 5 4 3 2 1      3 2 1
  1 2 3 4 5 6 7                    1 2              7 6 5 4 3 2 1      2 1
  1 2 3 4 5 6 7 8                    1            8 7 6 5 4 3 2 1      1
  ```

### 6. Guess Number
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

### 7. Star Number Pattern
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
- **Description**: Checks if a given integer is a palindrome (reads the same forwards and backwards).
- **Example Output**:
  ```
  Input number: 54789
  Not a Palindrome.
  Input number: 02022020
  It is a Palindrome.
  ```

### 9. Separate Even Odd
- **Description**: Takes an array of integers and rearranges it to place all even numbers before odd numbers.
- **Example Output**:
  ```
  Original array: [1, 2, 3, 4, 5, 6]
  Sorted array: [2, 4, 6, 1, 3, 5]
  ```

### 10. While Loop Patterns
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



### 11. Series Sum
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

### 13. Pascals Triangle
- **Description**: Prints Pascal's Triangle up to `n` rows using a while-loop, where `n` is a user-provided integer.
- **Example Input/Output** (for n = 6):
  ```
              1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1
    1   5  10  10   5   1
  ```
  ```

### 14. Factorial
- **Description**: Calculates the factorial of a user-provided non-negative integer.
- **Example Input/Output**:
  ```
  Enter a number: 5
  Factorial: 120
  ```

### 15. Reverse Number
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
   

#### 17. Weekday
- **Description**: Takes an integer between 1 and 7 and displays the corresponding weekday name.
- **Example Input/Output**:
    ```plaintext
    Input number: 3
    Wednesday
    ```

### 18. Leap Year
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
# Lab-4: Java Basic Object-Oriented Programming Exercises

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
  +--------------------------+
  |     Icecream             |
  +--------------------------+
  | icecreamType: String     |
  | icecreamCompany: String  |
  | icecreamPrice: double    |
  +--------------------------+
  | +Icecream()              |
  | +Icecream(icecreamType: String, icecreamCompany: String, icecreamPrice: double) |
  | +toString(): String      |
  +--------------------------+
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

# LabTest: Java Basic and OOP Programming Exercises

## Problems

### 1. Find the 1001st Prime Number
- **Description**: Write a Java program to find the 1001st prime number, given that the first six prime numbers are 2, 3, 5, 7, 11, and 13, and the 6th prime is 13.
- **Expected Output**:
  ```plaintext
  7927
  ```

### 2. Matrix Diagonal Operations
- **Description**: Write a Java program to take two square matrices, compute the sum of the left diagonal elements of the first matrix and the product of the right diagonal elements of the second matrix, and print their sum.
- **Test Data**:
  ```plaintext
  Input the rows and columns of first matrix: 2 2
  Input the rows and columns of second matrix: 2 2
  Input elements in the first matrix:
  element - [0],[0] : 1
  element - [0],[1] : 2
  element - [1],[0] : 3
  element - [1],[1] : 4
  Input elements in the second matrix:
  element - [0],[0] : 5
  element - [0],[1] : 6
  element - [1],[0] : 7
  element - [1],[1] : 8
  ```
- **Expected Output**:
  ```plaintext
  The first matrix is:
  1 2
  3 4
  The second matrix is:
  5 6
  7 8
  Addition of the left Diagonal elements is: 5
  Multiplication of the right Diagonal elements is: 48
  The sum is: 53
  ```

### 3. Sum of Squares vs. Square of Sum
- **Description**: Write a Java program to find the difference between the sum of the squares of the first 100 natural numbers and the square of their sum. For example, for the first ten natural numbers, the sum of squares is 385, the square of the sum is 3025, and their difference is 2640.
- **Expected Output**:
  ```plaintext
  25164150
  ```

### 4. Patient Management System
- **Description**: Implement a `Patient` class to track patients in a hospital with a capacity of 10 seats, where some patients are affected by coronavirus. The program should calculate the sum of ages of coronavirus-affected patients with oxygen saturation levels below 70%.
- **Class Specifications**:
  - **Instance Variables** (all private):
    - `patientId` (int, from 1 to 10)
    - `isCorona` (boolean, true if the patient has coronavirus, false otherwise)
    - `age` (int)
    - `oxygenSaturationLevel` (double, from 1.00 to 100.00)
    - `bodyTemperature` (double, temperature in degrees Celsius)
    - `numberOfPatient` (int, static, to count the number of patients)
  - **Constructors**:
    - At least two constructors (e.g., default and parameterized).
  - **Methods**:
    - `toString()`: Returns a string containing the patient’s information.
  - **Main Class (`HealthDemo`)**:
    - Create an array of 10 `Patient` objects.
    - Initialize the array with user input.
    - Print "Seat is not available" when attempting to admit the 10th patient.
    - Calculate and print the sum of ages of coronavirus-affected patients with oxygen saturation levels below 70%.
- **Expected Functionality**:
  - Handle up to 10 patients, with input for each patient’s details.
  - Track and display the sum of ages for qualifying patients.

# Lab-6: Java Object-Oriented Programming and Application Development

## Exercises
### A. Static Variables in a Class
- **Description**: Implement a `Book` class with a static variable to track the number of `Book` objects created.
- **Class Diagram**:
  ```plaintext
  +---------------+
  |     Book      |
  +---------------+
  | - ISBN: String |
  | - bookTitle: String |
  | - numberOfPages: int |
  | + count: int  |
  +---------------+
  | + Book()      |
  | + Book(ISBN: String, bookTitle: String, numberOfPages: int) |
  | + getCount(): int |
  +---------------+
  ```
- **Specifications**:
  - **Instance Variables**: `ISBN` (String), `bookTitle` (String), `numberOfPages` (int).
  - **Static Variable**: `count` (int) to track the total number of `Book` objects.
  - Increment `count` in the constructors each time a `Book` object is created.
  - **Static Method**: `getCount()` returns the value of `count`.
  - Each object has its own copy of instance variables, but all objects share a single copy of the static `count` variable.

### B. Demonstrating Calendar Class for Manipulating Dates
- **Description**: Demonstrate the use of the `Calendar` class to manipulate and display dates.
- **Specifications**:
  - Create a `DateDemo` class with a `main()` method.
  - Use `Calendar.getInstance()` to get the current date and time.
  - Print the date and time in milliseconds.
  - Modify the date to January 1, 2020, 00:00:01 and print the updated date and time.
  - Display the `Calendar` object’s string representation and the current system time in milliseconds.
- **Example Output**:
  ```plaintext
  The date is [current date and time] [milliseconds]
  The changed date is Wed Jan 01 00:00:01 [timezone] 2020 [milliseconds]
  [Calendar.toString()]
  [System.currentTimeMillis()]
  ```

### C. Immutable Class and Immutable Objects
- **Description**: Analyze whether the provided `Student` class is immutable.
- **Class Definition**:
  ```java
  public class Student {
      private int id;
      private String name;
      private java.util.Date dateCreated;
      public Student(int ssn, String newName) {
          id = ssn;
          name = newName;
          dateCreated = new java.util.Date();
      }
      public int getId() {
          return id;
      }
      public String getName() {
          return name;
      }
      public java.util.Date getDateCreated() {
          return dateCreated;
      }
  }
  ```
- **Specifications**:
  - An immutable class has:
    - All private data fields.
    - No setter (mutator) methods.
    - No accessor methods that return references to mutable objects.
  - The `Student` class has private fields and no setters, but `getDateCreated()` returns a mutable `java.util.Date` object, which may affect immutability.

### D. Demonstrating Point2D Class for Manipulating Points
- **Description**: Define a `Line` class to represent a line in a two-dimensional space and check for line intersections.
- **Specifications**:
  - **Instance Variables** (private):
    - `x1`, `y1`, `x2`, `y2` (representing coordinates of two points on the line).
  - **Methods**:
    - `findSlope()`: Returns the slope of the line using the formula `(y2 - y1) / (x2 - x1)`.
    - `toString()`: Returns a string in the format `Line has points (x1, y1) and (x2, y2)` (e.g., `Line has points (3, 4) and (9, 5)`).
  - **Program Requirements**:
    - Create an array of 4 `Line` objects, initialized with user input for coordinates using the `Scanner` class.
    - Implement a static method `isIntersecting(Line l1, Line l2)` that returns `true` if the two lines intersect (i.e., have different slopes) and `false` if they are parallel (same slopes).
    - Use `findSlope()` in `isIntersecting()` and call it in the `main()` method to print the result.

### E. Defining Multiple Classes
- **Description**: Develop a minimal university management application with `Student`, `Course`, and `Faculty` classes and a menu-based interface.
- **Relationship Diagram**:
  ```plaintext
  +----------+           +----------+           +----------+
  | Student  |<*>------<>|  Course  |-----------| Faculty  |
  +----------+           +----------+           +----------+
  ```
  - `<*>`: Aggregation to many `Student` objects.
  - `<>`: Aggregation diamond.
  - `---`: Association to one `Faculty` object.
- **Class Diagrams**:
  - **Student**:
    ```plaintext
    +---------------+
    |    Student    |
    +---------------+
    | - studentId: int |
    | - studentName: String |
    | - studentCGPA: double |
    +---------------+
    | + Student()   |
    | + Student(studentId: int, studentName: String, studentCGPA: double) |
    | + toString(): String |
    +---------------+
    ```
  - **Course**:
    ```plaintext
    +---------------+
    |     Course    |
    +---------------+
    | - courseId: String |
    | - courseTitle: String |
    | - credit: double |
    | - studentList: Student[] |
    | - numberOfStudents: int |
    | - faculty: Faculty |
    +---------------+
    | + Course()    |
    | + Course(courseId: String, courseTitle: String, credit: double) |
    | + toString(): String |
    | + addStudent(Student): void |
    | + dropStudent(studentId: int): void |
    | + addFaculty(Faculty): void |
    | + dropFaculty(): void |
    | + printStudentList(): void |
    +---------------+
    ```
  - **Faculty**:
    ```plaintext
    +---------------+
    |    Faculty    |
    +---------------+
    | - facultyId: int |
    | - facultyName: String |
    | - facultyPosition: String |
    +---------------+
    | + Faculty()   |
    | + Faculty(facultyId: int, facultyName: String, facultyPosition: String) |
    | + toString(): String |
    +---------------+
    ```
- **Menu-Based Application**:
  - Implement a `Main` class to demonstrate the functionality of the `Student`, `Course`, and `Faculty` classes.
  - Provide a menu with the following options:
    - **Add**:
      - Add a Student
      - Add a Course
      - Add a Faculty
    - **Delete**:
      - Delete a Student
      - Delete a Course
      - Delete a Faculty
    - **Update**:
      - Update a Student
      - Update a Course
      - Update a Faculty
    - **Print**:
      - Print all students
      - Print all courses
      - Print all faculties
      - Print information of a student
      - Print information of a course
      - Print information of a faculty
      - Print student list and faculty information of a course
      - Print courses taken by a student
    - **Search**:
      - Search a Student
      - Search a Course
      - Search a Faculty
      - Search whether a student takes a course
      - Search whether a faculty teaches a course
      - Search courses taken by a student
      - Search courses taught by a faculty

# Lab-6: Java Inheritance and Polymorphism Exercises

## Exercises

### A. Defining the Superclass
- **Description**: Design a superclass `Account` to manage bank account details.
- **Class Diagram**:
  ```plaintext
  +--------------------+
  |      Account       |
  +--------------------+
  | - id: int          |
  | - balance: double  |
  | - annualInterestRate: double |
  +--------------------+
  | + Account()        |
  | + Account(id: int, balance: double, annualInterestRate: double) |
  | + getId(): int     |
  | + setId(id: int): void |
  | + getBalance(): double |
  | + setBalance(balance: double): void |
  | + getAnnualInterestRate(): double |
  | + setAnnualInterestRate(annualInterestRate: double): void |
  | + getMonthlyInterestRate(): double |
  | + getMonthlyInterestAmount(): double |
  | + withdraw(amount: double): void |
  | + deposit(amount: double): void |
  +--------------------+
  ```
- **Specifications**:
  - **Instance Variables** (private):
    - `id` (int, default 0)
    - `balance` (double, default 0.0)
    - `annualInterestRate` (double, default 0.0, percentage like 4.5%)
  - **Constructors**:
    - No-arg constructor for default account.
    - Parameterized constructor for specified `id`, `balance`, and `annualInterestRate`.
  - **Methods**:
    - Accessors (`getId`, `getBalance`, `getAnnualInterestRate`) and mutators (`setId`, `setBalance`, `setAnnualInterestRate`).
    - `getMonthlyInterestRate()`: Returns `annualInterestRate / 12` (converted from percentage by dividing by 100).
    - `getMonthlyInterestAmount()`: Returns `balance * monthlyInterestRate`.
    - `withdraw(amount)`: Subtracts the specified amount from `balance`.
    - `deposit(amount)`: Adds the specified amount to `balance`.
  - **Test Program**:
    - Create an `Account` object with ID 1122, balance $20,000, and annual interest rate 4.5%.
    - Withdraw $2,500 and deposit $3,000.
    - Print the ID, balance, and monthly interest amount.

### B. Creating the Subclasses
- **Description**: Create two subclasses, `CheckingAccount` and `SavingsAccount`, extending the `Account` class.
- **Class Diagrams**:
  - **CheckingAccount**:
    ```plaintext
    +--------------------+
    |  CheckingAccount   |
    |    (extends Account)|
    +--------------------+
    | - overdraftLimit: double |
    +--------------------+
    | + CheckingAccount() |
    | + CheckingAccount(id: int, balance: double, annualInterestRate: double, overdraftLimit: double) |
    | + getOverdraftLimit(): double |
    | + setOverdraftLimit(overdraftLimit: double): void |
    +--------------------+
    ```
  - **SavingsAccount**:
    ```plaintext
    +--------------------+
    |   SavingsAccount   |
    |    (extends Account)|
    +--------------------+
    | - creditCardNumber: String |
    +--------------------+
    | + SavingsAccount() |
    | + SavingsAccount(id: int, balance: double, annualInterestRate: double, creditCardNumber: String) |
    | + getCreditCardNumber(): String |
    | + setCreditCardNumber(creditCardNumber: String): void |
    | + getCreditBalance(): double |
    +--------------------+
    ```
- **Specifications**:
  - **CheckingAccount**:
    - Additional private instance variable: `overdraftLimit` (double).
    - Constructors: No-arg and parameterized (including `overdraftLimit`).
    - Accessor (`getOverdraftLimit`) and mutator (`setOverdraftLimit`).
  - **SavingsAccount**:
    - Additional private instance variable: `creditCardNumber` (String, 16-digit card number).
    - Constructors: No-arg and parameterized (including `creditCardNumber`).
    - Accessor (`getCreditCardNumber`) and mutator (`setCreditCardNumber`).
    - `getCreditBalance()`: Returns three times the current balance.

### C. Defining an Array/ArrayList of Account Type Objects in Main Method
- **Description**: Demonstrate polymorphism by managing `Account` objects in an ArrayList based on user input.
- **Specifications**:
  - In the `main()` method, display:
    ```plaintext
    Press (1) for creating a Checking Account
    Press (2) for creating a Savings Account
    ```
  - Create at least 4 account objects (either `CheckingAccount` or `SavingsAccount`) based on user selection.
  - Perform one deposit and one withdrawal operation for each account.
  - Print details for each account using polymorphism (without using `toString()`):
    - **For CheckingAccount**:
      ```plaintext
      This is a Checking Account
      Account ID: [id]
      Current Balance: [balance]
      Annual Interest Rate: [annualInterestRate]
      Monthly Interest Amount: [monthlyInterestAmount]
      Overdraft Limit: [overdraftLimit]
      ```
    - **For SavingsAccount**:
      ```plaintext
      This is a Savings Account
      Account ID: [id]
      Current Balance: [balance]
      Annual Interest Rate: [annualInterestRate]
      Monthly Interest Amount: [monthlyInterestAmount]
      Credit Card Number: [creditCardNumber]
      Credit Balance: [creditBalance]
      ```
# Lab-6: Java Inheritance and Polymorphism Exercises

### A. Defining the Superclass
- **Description**: Design a superclass `Account` to manage bank account details.
- **Class Diagram**:
  ```plaintext
  +--------------------+
  |      Account       |
  +--------------------+
  | - id: int          |
  | - balance: double  |
  | - annualInterestRate: double |
  +--------------------+
  | + Account()        |
  | + Account(id: int, balance: double, annualInterestRate: double) |
  | + getId(): int     |
  | + setId(id: int): void |
  | + getBalance(): double |
  | + setBalance(balance: double): void |
  | + getAnnualInterestRate(): double |
  | + setAnnualInterestRate(annualInterestRate: double): void |
  | + getMonthlyInterestRate(): double |
  | + getMonthlyInterestAmount(): double |
  | + withdraw(amount: double): void |
  | + deposit(amount: double): void |
  +--------------------+
  ```
- **Specifications**:
  - **Instance Variables** (private):
    - `id` (int, default 0)
    - `balance` (double, default 0.0)
    - `annualInterestRate` (double, default 0.0, percentage like 4.5%)
  - **Constructors**:
    - No-arg constructor for default account.
    - Parameterized constructor for specified `id`, `balance`, and `annualInterestRate`.
  - **Methods**:
    - Accessors (`getId`, `getBalance`, `getAnnualInterestRate`) and mutators (`setId`, `setBalance`, `setAnnualInterestRate`).
    - `getMonthlyInterestRate()`: Returns `annualInterestRate / 12` (converted from percentage by dividing by 100).
    - `getMonthlyInterestAmount()`: Returns `balance * monthlyInterestRate`.
    - `withdraw(amount)`: Subtracts the specified amount from `balance`.
    - `deposit(amount)`: Adds the specified amount to `balance`.
  - **Test Program**:
    - Create an `Account` object with ID 1122, balance $20,000, and annual interest rate 4.5%.
    - Withdraw $2,500 and deposit $3,000.
    - Print the ID, balance, and monthly interest amount.

### B. Creating the Subclasses
- **Description**: Create two subclasses, `CheckingAccount` and `SavingsAccount`, extending the `Account` class.
- **Class Diagrams**:
  - **CheckingAccount**:
    ```plaintext
    +--------------------+
    |  CheckingAccount   |
    |    (extends Account)|
    +--------------------+
    | - overdraftLimit: double |
    +--------------------+
    | + CheckingAccount() |
    | + CheckingAccount(id: int, balance: double, annualInterestRate: double, overdraftLimit: double) |
    | + getOverdraftLimit(): double |
    | + setOverdraftLimit(overdraftLimit: double): void |
    +--------------------+
    ```
  - **SavingsAccount**:
    ```plaintext
    +--------------------+
    |   SavingsAccount   |
    |    (extends Account)|
    +--------------------+
    | - creditCardNumber: String |
    +--------------------+
    | + SavingsAccount() |
    | + SavingsAccount(id: int, balance: double, annualInterestRate: double, creditCardNumber: String) |
    | + getCreditCardNumber(): String |
    | + setCreditCardNumber(creditCardNumber: String): void |
    | + getCreditBalance(): double |
    +--------------------+
    ```
- **Specifications**:
  - **CheckingAccount**:
    - Additional private instance variable: `overdraftLimit` (double).
    - Constructors: No-arg and parameterized (including `overdraftLimit`).
    - Accessor (`getOverdraftLimit`) and mutator (`setOverdraftLimit`).
  - **SavingsAccount**:
    - Additional private instance variable: `creditCardNumber` (String, 16-digit card number).
    - Constructors: No-arg and parameterized (including `creditCardNumber`).
    - Accessor (`getCreditCardNumber`) and mutator (`setCreditCardNumber`).
    - `getCreditBalance()`: Returns three times the current balance.

### C. Defining an Array/ArrayList of Account Type Objects in Main Method
- **Description**: Demonstrate polymorphism by managing `Account` objects in an ArrayList based on user input.
- **Specifications**:
  - In the `main()` method, display:
    ```plaintext
    Press (1) for creating a Checking Account
    Press (2) for creating a Savings Account
    ```
  - Create at least 4 account objects (either `CheckingAccount` or `SavingsAccount`) based on user selection.
  - Perform one deposit and one withdrawal operation for each account.
  - Print details for each account using polymorphism (without using `toString()`):
    - **For CheckingAccount**:
      ```plaintext
      This is a Checking Account
      Account ID: [id]
      Current Balance: [balance]
      Annual Interest Rate: [annualInterestRate]
      Monthly Interest Amount: [monthlyInterestAmount]
      Overdraft Limit: [overdraftLimit]
      ```
    - **For SavingsAccount**:
      ```plaintext
      This is a Savings Account
      Account ID: [id]
      Current Balance: [balance]
      Annual Interest Rate: [annualInterestRate]
      Monthly Interest Amount: [monthlyInterestAmount]
      Credit Card Number: [creditCardNumber]
      Credit Balance: [creditBalance]
      ```
# Lab-7: Java Multithreading and Exception Handling

## Problems

### 1. Thread-Safe Counter
- **Description**: Implement a thread-safe `Counter` class that maintains an integer `count` starting at 0, incremented concurrently by multiple threads.
- **Requirements**:
  - **Class**: `Counter`
    - Private integer variable `count`.
    - `increment()`: Increases `count` by 1, synchronized for thread safety.
    - `getCount()`: Returns the current `count`.
  - Use the `synchronized` keyword to ensure thread safety.
  - In `main()`:
    - Create two threads, each incrementing the counter 1000 times.
    - Start both threads and use `join()` to wait for completion.
    - Print the final counter value.
- **Input**: No user input; each thread increments the counter 1000 times.
- **Output**:
  ```plaintext
  Final Count: 2000
  ```

### 2. Multithreaded Number Printer
- **Description**: Write a multithreaded program with three threads to print even, odd, and prime numbers concurrently.
- **Requirements**:
  - Create two threads using `Runnable`:
    - One thread prints even numbers between 0 and 10.
    - One thread prints odd numbers between 1 and 10.
  - Create one thread by extending `Thread` class:
    - Prints prime numbers between 1 and 20.
  - All threads run concurrently with a `Thread.sleep(500)` delay after each number to simulate processing.
- **Specifications**:
  - Even number thread: Uses `Runnable`.
  - Odd number thread: Uses `Runnable`.
  - Prime number thread: Extends `Thread` class.

### 3. User-Defined Exception
- **Description**: Simulate a bank withdrawal system that throws a user-defined `InsufficientBalanceException` if the withdrawal amount exceeds the account balance.
- **Requirements**:
  - Prompt the user for account balance and withdrawal amount.
  - If withdrawal amount > balance, throw `InsufficientBalanceException`.
  - Display the remaining balance if withdrawal is successful, or a meaningful error message if the exception is caught.
- **Input Example**:
  ```plaintext
  Enter account balance: 500
  Enter withdrawal amount: 600
  ```
- **Output Example**:
  ```plaintext
  Insufficient balance! Cannot withdraw 600 from 500.
  ```

### 4. Runtime Exception (Unchecked Exception)
- **Description**: Demonstrate handling of a runtime exception (`ArithmeticException`) in a division operation.
- **Requirements**:
  - Prompt the user for two integers (numerator and denominator).
  - Perform division and handle the case where the denominator is zero using a try-catch block.
  - Print the result if successful, or an error message if an exception occurs.
- **Concept**: `ArithmeticException` is an unchecked exception, occurring at runtime (e.g., division by zero).
- **Input Example**:
  ```plaintext
  Enter numerator: 10
  Enter denominator: 0
  ```
- **Output Example**:
  ```plaintext
  Cannot divide by zero! ArithmeticException caught.
  ```

### 5. Compile-Time Exception (Checked Exception)
- **Description**: Demonstrate handling of a checked exception (`FileNotFoundException`) when reading a file.
- **Requirements**:
  - Attempt to read a file named `data.txt`.
  - Use a try-catch block to handle `FileNotFoundException`.
  - Print the file contents if the file exists, or an error message if the file is missing.
- **Concept**: `FileNotFoundException` is a checked exception, requiring handling at compile time via try-catch or a `throws` declaration.
- **Input**: No user input; the program attempts to read `data.txt`.
- **Output Example (if file is missing)**:
  ```plaintext
  File not found! Please check the filename.
  ```
- **Output Example (if file exists with content “Hello World”)**:
  ```plaintext
  File content: Hello World
  ```
# Project: Course Listing System

This project is a Java Swing application designed to manage course information through a graphical user interface (GUI). It supports CRUD operations (Create, Read, Update, Delete) for course details, which are displayed in a table. The application includes input fields for course code, section, class schedule, and tuition fees, and provides functionality to add, delete, update, and refresh course data.


## Project Description
- **Description**: A simple Java Swing application for managing course information using a GUI. The application allows users to perform CRUD operations on course details, which are stored in an `ArrayList` and displayed in a table.
- **Features**:
  - **Add**: Add a new course with details (course code, section, class schedule, tuition fees) to the `ArrayList` and display it in the table.
  - **Delete**: Remove a selected course from the table with a confirmation prompt.
  - **Update**: Modify the details of a selected course.
  - **Refresh**: Clear the input fields to allow new data entry.
- **GUI Components**:
  - Text fields for entering course code, section, class schedule, and tuition fees.
  - A table to display the list of courses.
  - Buttons for adding, deleting, updating, and refreshing course data.

## Usage
Run the main Java file to launch the GUI application. Use the interface to:
- Enter course details in the provided text fields and click the "Add" button to include a new course in the table.
- Select a course from the table and click the "Delete" button to remove it (with a confirmation prompt).
- Select a course, modify its details in the text fields, and click the "Update" button to save changes.
- Click the "Refresh" button to clear the input fields.

## Contributing
Feel free to submit issues or pull requests for improvements or bug fixes. Ensure that any new code follows the same structure and includes clear comments.




