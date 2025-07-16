import java.util.Scanner;

public class ArrayProgramsSet01 {
    
    static void printArray(int[] arr) {
        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();
    }

    static int sumArray(int[] arr) {
        int sum = 0;
        for (int val : arr)
            sum += val;
        return sum;
    }

    static double averageArray(int[] arr) {
        return (double) sumArray(arr) / arr.length;
    }

    static int maxElement(int[] arr) {
        int max = arr[0];
        for (int val : arr)
            if (val > max)
                max = val;
        return max;
    }

    static int minElement(int[] arr) {
        int min = arr[0];
        for (int val : arr)
            if (val < min)
                min = val;
        return min;
    }

    static void countEvenOdd(int[] arr) {
        int even = 0, odd = 0;
        for (int val : arr) {
            if (val % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }

    static void elementsAtEvenIndices(int[] arr) {
        for (int i = 0; i < arr.length; i += 2)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void elementsAtOddIndices(int[] arr) {
        for (int i = 1; i < arr.length; i += 2)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void countPositiveNegative(int[] arr) {
        int pos = 0, neg = 0;
        for (int val : arr) {
            if (val > 0) pos++;
            else if (val < 0) neg++;
        }
        System.out.println("Positive: " + pos + ", Negative: " + neg);
    }

    static void replaceNegativeWithZero(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < 0) arr[i] = 0;
    }

    static void linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not found");
    }

    static int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            copy[i] = arr[i];
        return copy;
    }

    static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    static void swapFirstLast(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
    }

    static void printReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void countFrequency(int[] arr, int num) {
        int count = 0;
        for (int val : arr)
            if (val == num) count++;
        System.out.println("Frequency of " + num + ": " + count);
    }

    static void findIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == num) {
                System.out.println("Index of " + num + ": " + i);
                return;
            }
        System.out.println("Element not found");
    }

    static void replaceEvenWithMinusOne(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] % 2 == 0)
                arr[i] = -1;
    }

    static int multiplyAll(int[] arr) {
        int prod = 1;
        for (int val : arr)
            prod *= val;
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Array: ");
        printArray(arr);

        System.out.println("Sum: " + sumArray(arr));
        System.out.println("Average: " + averageArray(arr));
        System.out.println("Max: " + maxElement(arr));
        System.out.println("Min: " + minElement(arr));
        countEvenOdd(arr);
        System.out.print("Even indices: ");
        elementsAtEvenIndices(arr);
        System.out.print("Odd indices: ");
        elementsAtOddIndices(arr);
        countPositiveNegative(arr);
        replaceNegativeWithZero(arr);
        System.out.print("After replacing negatives with 0: ");
        printArray(arr);
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        linearSearch(arr, key);
        int[] copied = copyArray(arr);
        System.out.print("Copied array: ");
        printArray(copied);
        reverseArray(arr);
        System.out.print("Reversed array: ");
        printArray(arr);
        swapFirstLast(arr);
        System.out.print("After swapping first and last: ");
        printArray(arr);
        System.out.print("Print array in reverse order: ");
        printReverse(arr);
        System.out.print("Enter element to count frequency: ");
        int freq = sc.nextInt();
        countFrequency(arr, freq);
        System.out.print("Enter element to find index: ");
        int idx = sc.nextInt();
        findIndex(arr, idx);
        replaceEvenWithMinusOne(arr);
        System.out.print("After replacing even numbers with -1: ");
        printArray(arr);
        System.out.println("Product of all elements: " + multiplyAll(arr));

        sc.close();
    }
}
