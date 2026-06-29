# E-commerce Platform Search Analysis

A clean, polished implementation comparing search algorithms tailored for an e-commerce platform. This project demonstrates how data structures and time complexity profoundly impact real-world application performance.

## Overview

When building applications at an enterprise scale (millions of users/products), picking the correct data structure and search algorithm is paramount. This repository showcases two primary searching paradigms written in Java:
- **Linear Search**: A brute-force traversal. Simple to write, but costs $O(n)$ time.
- **Binary Search**: A highly-optimized divide-and-conquer approach. Requires sorted data but delivers lighting-fast $O(\log n)$ performance.

You can find the detailed theoretical breakdown of these performance characteristics in our [Analysis.md](./Analysis.md).

## How to Run

1. **Prerequisites**: Make sure you have the Java Development Kit (JDK) installed.
2. **Compile the code**:
   ```bash
   javac src/*.java
   ```
3. **Run the program**:
   ```bash
   java -cp src Main
   ```

## Project Structure

- `src/Product.java`: The core model representing items in the e-commerce store. Implements `Comparable` for sorting.
- `src/SearchAlgorithm.java`: Contains static implementations for both the linear and binary search algorithms.
- `src/Main.java`: The test runner that sets up dummy data, triggers the algorithms, and prints the output.
- `Analysis.md`: A deep dive into Big O notation and the suitability of these algorithms in real-world scenarios.

---
