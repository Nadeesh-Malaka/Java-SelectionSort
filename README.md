# Selection Sort Implementation in Java  

## Introduction  
This project demonstrates the implementation of the Selection Sort algorithm in Java. The algorithm sorts an array of integers in ascending order by repeatedly finding the smallest element from the unsorted part of the array and moving it to its correct position.  

---

## Features  
- **Simple Sorting Algorithm:** Uses Selection Sort to sort an integer array.  
- **Educational Purpose:** Includes clear code and comments to understand the algorithm.  
- **Testing Included:** Demonstrates sorting with a sample input array.  

---

## How It Works  
1. The program initializes an unsorted array.  
2. The `selectionSort` method sorts the array by:  
   - Finding the smallest element in the unsorted portion.  
   - Swapping it with the first element in the unsorted portion.  
3. The sorted array is displayed as the output.  

---

## Code  
Here is the Java code for the Selection Sort implementation:  

```java
public class SelectionSortExample {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Loop through the entire array
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the index of the smallest element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Update the index of the smallest element
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        // Print the original array
        System.out.println("Original Array:");
        for (int num : arr) System.out.print(num + " ");
        // Perform Selection Sort
        selectionSort(arr);

        // Print the sorted array
        System.out.println("\nSorted Array:");
        for (int num : arr) System.out.print(num + " ");
    }
}
