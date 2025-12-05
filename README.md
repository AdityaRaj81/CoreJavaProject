# 🧠 Core Java Project - Logic Builder & Practice 🧩

[![Java Version](https://img.shields.io/badge/Java-17-orange.svg)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
[![Maven](https://img.shields.io/badge/Maven-3.8+-blue.svg)](https://maven.apache.org/)
[![JUnit](https://img.shields.io/badge/JUnit-5.10.1-green.svg)](https://junit.org/junit5/)

A comprehensive collection of Core Java practice programs designed for learning fundamental programming concepts and building strong Java foundations.

**Developed by:** Aditya Raj 💻

---

## 📚 Topics Covered

### 1️⃣ Basics & Decision Making
- Area calculations (Rectangle)
- ASCII value operations
- Arithmetic operations (Sum, Average, etc.)
- Character type checking
- Date/time calculations (Days in Month, Leap Year)
- Decision-making programs (Calculator, Grade Calculator)
- Number comparisons (Greatest of Two/Three/Multiple, Second Largest)
- Temperature conversions
- Variable swapping techniques
- Simple and Compound Interest calculations
- Voting eligibility checks

### 2️⃣ Numbers & Mathematical Logic
- Count Digits
- Factorial (Recursive)
- Factor calculation
- Special Numbers:
  - **Happy Number**: Numbers that reach 1 when repeatedly replacing with sum of squares of digits
  - **Harshad Number**: Numbers divisible by sum of their digits
  - **Neon Number**: Numbers where sum of digits of square equals the number
  - **Palindrome Number**: Numbers that read same forwards and backwards
  - **Prime/Composite**: Prime number detection
  - **Spy Number**: Numbers where sum of digits equals product of digits
  - **Xylem/Phloem Number**: Based on sum of extreme vs middle digits
- Digit operations (Sum, Product, Reverse)

### 3️⃣ Arrays (1D & 2D)
- 2D Array operations
- Sum of Primary Diagonal

### 4️⃣ Patterns
- Grid Pattern generation
- Star patterns
- Number patterns

---

## 🚀 Getting Started

### Prerequisites

- **Java Development Kit (JDK) 17** or higher
- **Apache Maven 3.8** or higher
- IDE (IntelliJ IDEA, Eclipse, VS Code) or terminal

### Installation

1. **Clone or download the repository:**
   ```bash
   git clone <repository-url>
   cd CoreJavaProject
   ```

2. **Build the project with Maven:**
   ```bash
   mvn clean install
   ```

3. **Run the main application:**
   ```bash
   mvn exec:java -Dexec.mainClass="corejava.Main"
   ```
   
   Or using Java directly:
   ```bash
   java -cp target/core-java-project-1.0.0.jar corejava.Main
   ```

---

## 📂 Project Structure

```
CoreJavaProject/
├── pom.xml                          # Maven configuration
├── README.md                        # This file
├── src/
│   ├── main/
│   │   └── java/
│   │       └── corejava/            # Lowercase package (Java convention)
│   │           ├── Main.java        # Entry point
│   │           ├── basics/          # Basic programs
│   │           ├── numbers/         # Number-related programs
│   │           ├── array2d/         # 2D Array programs
│   │           └── patterns/        # Pattern programs
│   └── test/
│       └── java/
│           └── corejava/            # Unit tests
│               ├── basics/          # Tests for basic programs
│               ├── numbers/         # Tests for number programs
│               ├── array2d/         # Tests for array programs
│               └── patterns/        # Tests for pattern programs
```

---

## 🧪 Running Tests

### Run all tests:
```bash
mvn test
```

### Run tests for a specific class:
```bash
mvn test -Dtest=FactorialTest
```

### Generate test coverage report:
```bash
mvn clean test
```

---

## 💡 Usage Examples

### Example 1: Calculate Factorial
```java
import corejava.numbers.Factorial;

public class Example {
    public static void main(String[] args) {
        int result = Factorial.factorial(5);
        System.out.println("Factorial of 5: " + result); // Output: 120
    }
}
```

### Example 2: Check Prime Number
```java
import corejava.numbers.PrimeComposite;

public class Example {
    public static void main(String[] args) {
        boolean isPrime = PrimeComposite.isPrime(17);
        System.out.println("Is 17 prime? " + isPrime); // Output: true
    }
}
```

### Example 3: Check Leap Year
```java
import corejava.basics.LeapYearCheck;

public class Example {
    public static void main(String[] args) {
        boolean isLeap = LeapYearCheck.isLeapYear(2024);
        System.out.println("Is 2024 a leap year? " + isLeap); // Output: true
    }
}
```

---

## 🛠️ Development

### Package Naming Convention
This project follows **Java naming conventions**:
- **Packages**: lowercase (e.g., `corejava.basics`, `corejava.numbers`)
- **Classes**: PascalCase (e.g., `AreaOfRectangle`, `PrimeComposite`)
- **Methods**: camelCase (e.g., `calculateGrade`, `isPrime`)

### Adding New Programs

1. Create your Java class in the appropriate package under `src/main/java/corejava/`
2. Implement the logic with a static method (testable)
3. Add a `main` method for standalone execution (optional)
4. Create corresponding test class in `src/test/java/corejava/`
5. Write unit tests using JUnit 5

### Code Quality Guidelines

- ✅ Use meaningful variable and method names
- ✅ Add JavaDoc comments for public methods
- ✅ Keep methods small and focused (single responsibility)
- ✅ Handle edge cases and invalid inputs
- ✅ Write unit tests for all logic methods
- ✅ Close Scanner resources properly

---

## 📖 Learning Resources

### Basics & Decision Making
- **Control Structures**: if-else, switch-case
- **Operators**: Arithmetic, relational, logical
- **Input/Output**: Scanner class
- **Type Casting**: Implicit and explicit conversions

### Numbers & Algorithms
- **Loops**: for, while, do-while
- **Recursion**: Factorial, power calculations
- **Mathematical Operations**: Modulo, division
- **Algorithm Optimization**: Prime checking, digit extraction

### Arrays
- **1D Arrays**: Declaration, initialization, traversal
- **2D Arrays**: Matrix operations, diagonal sums
- **Array Algorithms**: Searching, sorting

---

## 🤝 Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-program`)
3. Follow the coding conventions
4. Write tests for your code
5. Commit your changes (`git commit -m 'Add new program'`)
6. Push to the branch (`git push origin feature/new-program`)
7. Open a Pull Request

---

## 📝 License

This project is created for educational purposes. Feel free to use, modify, and distribute as needed for learning Java programming.

---

## 📞 Contact

**Aditya Raj**
- GitHub: [Your GitHub Profile]
- Email: [Your Email]

---

## 🎯 Future Enhancements

- [ ] Add more pattern programs (Triangle, Diamond, etc.)
- [ ] Implement sorting algorithms (Bubble, Selection, Insertion, etc.)
- [ ] Add searching algorithms (Binary Search, Linear Search)
- [ ] String manipulation programs
- [ ] Object-Oriented Programming examples
- [ ] Collections framework examples
- [ ] File I/O operations
- [ ] Exception handling examples

---

## 🔥 Keep coding, keep learning – Java never stops! 🔥

---

**Star ⭐ this repository if you found it helpful!**

