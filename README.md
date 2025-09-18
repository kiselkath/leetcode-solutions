# LeetCode Solutions (Java / Maven)

A set of small algorithmic problems solved in Java. The project uses Maven and each solution is a standalone class with a `main` method for quick runs.

## Table of Contents
- [About](#about)
- [Requirements](#requirements)
- [Quick Start](#quick-start)
- [Run Examples](#run-examples)
  - [Average of digits in a string (`AverageNumber`)](#average-of-digits-in-a-string-averagenumber)
  - [Longest substring without repeats (`LongestSubstring`)](#longest-substring-without-repeats-longestsubstring)
  - [Bracket pairing validation (`Pairs`)](#bracket-pairing-validation-pairs)
  - [Remove duplicates from sorted array (`RemoveDuplicates`)](#remove-duplicates-from-sorted-array-removeduplicates)
- [Tests](#tests)
- [Useful Maven Commands](#useful-maven-commands)

## About
This repository contains small, self-contained solutions to common coding interview/LeetCode-style tasks. Each solution lives in the `org.elisys` package and typically exposes a `public static void main(String[] args)` for demonstration.

## Requirements
- JDK 8+ (JDK 11 or newer recommended)
- Maven 3.6+

## Quick Start
1) Install dependencies and compile the project:
```bash
mvn -q clean compile
```
2) Run any example by specifying the class via `java -cp target/classes`.

Generic run template:
```bash
java -cp target/classes org.elisys.<ClassName>
```

## Run Examples
Below are short descriptions and run commands for each class.

### Average of digits in a string (`AverageNumber`)
- Function: `findAverageGPA(String)` — computes the arithmetic mean of all digits in the input string. Throws `IllegalArgumentException` for empty or non-numeric input.
- Source: `src/main/java/org/elisys/AverageNumber.java`
- Run:
```bash
java -cp target/classes org.elisys.AverageNumber
```

### Longest substring without repeats (`LongestSubstring`)
- Function: `findLongestSubstring(String)` — returns the length of the longest substring without repeating characters and prints the substring itself. Sliding window with a `HashSet`.
- Source: `src/main/java/org/elisys/LongestSubstring.java`
- Run:
```bash
java -cp target/classes org.elisys.LongestSubstring
```

### Bracket pairing validation (`Pairs`)
- Function: `isPaired(String)` — validates proper pairing of round, square, and curly brackets using a stack.
- Source: `src/main/java/org/elisys/Pairs.java`
- Run:
```bash
java -cp target/classes org.elisys.Pairs
```

### Remove duplicates from sorted array (`RemoveDuplicates`)
- Function: `removeDuplicates(int[])` — compresses a sorted array in-place and returns the count of unique elements (`k`).
- Source: `src/main/java/org/elisys/RemoveDuplicates.java`
- Run:
```bash
java -cp target/classes org.elisys.RemoveDuplicates
```

Note: `App.java` is the default Maven archetype starter (prints "Hello World!").

## Tests
The project uses `junit:3.8.1`. Run tests with:
```bash
mvn -q test
```

## Useful Maven Commands
- Build without tests:
```bash
mvn -q -DskipTests package
```
- Clean build artifacts:
```bash
mvn -q clean
```
- Recompile sources:
```bash
mvn -q compile
```
