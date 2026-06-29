# Financial Forecasting Analysis

## 1. Understanding Recursive Algorithms

**Recursion** is a programming technique where a method calls itself to solve a smaller instance of the same problem. Every recursive algorithm needs two main parts:
*   **Base Case**: A condition that stops the recursion. Without it, the method would call itself infinitely (leading to a `StackOverflowError`).
*   **Recursive Step**: The part of the method where it breaks the problem down into a smaller piece and calls itself.

Recursion simplifies problems that have naturally repeating sub-structures, such as traversing file systems, evaluating mathematical sequences, or compounding values period by period.

## 2. Analysis of the Forecasting Algorithm

### Time and Space Complexity
*   **Time Complexity**: $O(n)$, where $n$ is the number of periods. The method makes exactly $n$ recursive calls before hitting the base case.
*   **Space Complexity**: $O(n)$, because each recursive call adds a new frame to the program's call stack. If $n$ is very large (e.g., forecasting millions of periods), this will result in a memory error.

### Optimizing the Recursive Solution

To avoid excessive computation and potential stack overflow issues, we can optimize this forecasting problem in several ways:

1.  **Iterative Approach**:
    Replacing recursion with a simple `for` loop removes the overhead of the call stack entirely. The space complexity drops to $O(1)$ while the time complexity remains $O(n)$.

2.  **Memoization (Dynamic Programming)**:
    If your application repeatedly asks for forecasts from the same starting value and rate but for varying periods, you can store the results of previous computations in a HashMap. Before making a recursive call, check if the value for that period is already computed. This saves redundant calculations.

3.  **Mathematical Formula (Best Optimization)**:
    Financial compounding has a direct mathematical formula: $FV = PV \times (1 + r)^n$.
    By using the `Math.pow(1 + rate, periods)` function, we can calculate the future value in $O(1)$ or $O(\log n)$ time with $O(1)$ space complexity, completely bypassing the need for recursion or iteration.
