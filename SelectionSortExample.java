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
