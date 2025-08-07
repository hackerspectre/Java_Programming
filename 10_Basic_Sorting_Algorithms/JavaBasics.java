// Sorting Algorithms ✅ 
// Bubble Sort ✅ 
/* 
public class JavaBasics {
    public static void bubbleSort(int arr[]) {
        // int swap = 0;
        for(int turn=0; turn<arr.length-1; turn++) {
            for(int j=0; j<arr.length-1-turn; j++) {
                if(arr[j] > arr[j+1]) {
                    //swaping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    // swap++;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        System.out.println("The sorted array is: ");

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        // int arr[] = {1, 2, 3, 4, 5};
        bubbleSort(arr);
        printArr(arr);
    }
}
*/

/* 
public class JavaBasics {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            boolean swapped = false;
            for (int j=1; j<n; j++) {
                if (arr[j-1] > arr[j]) {
                    //swap
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then the array is sorted.
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};

        bubbleSort(arr);
        System.out.println("The sorted array is: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
*/

// Selection Sort ✅ 
/* 
public class JavaBasics {
    public static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            int min_idx = i;
            for (int j=i+1; j<n; j++) {
                if (arr[min_idx] > arr[j]) {
                    min_idx = j;
                }
            }
            //swaping
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        System.out.println("The sorted array is: ");

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        selectionSort(arr);
        printArr(arr);
    }
}
*/

// Insertion Sort ✅ 
/* 
public class JavaBasics {
    public static void insertionSort(int arr[]) {
        int n = arr.length; 
        for (int i=1; i<n; i++) {  
            int curr = arr[i];
            int prev = i-1;

            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev --;
            }

            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        System.out.println("The sorted array is: ");

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
    }    

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
        printArr(arr);
    }
}
*/

// Inbuilt Sort ✅
/* 
import java.util.Arrays;
import java.util.Collections;
public class JavaBasics {
    // public static void printArr(int arr[]) {
    //     System.out.println("The sorted array using inbuilt sort function is :");

    //     for(int i=0; i<arr.length; i++) {
    //         System.out.print(arr[i]+ " ");
    //     }

    //     System.out.println();
    // }

    public static void printArr(Integer arr[]) {
        System.out.println("The sorted array using inbuilt sort function is :");

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        // int arr[] = {5, 4, 1, 3, 2};
        Integer arr[] = {5, 4, 1, 3, 2};
        
        //using inbuilt sort method of Arrays class ✅

        // Arrays.sort(arr);
        // Arrays.sort(arr, 0, 3);

        // Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, 0, 3, Collections.reverseOrder());

        printArr(arr);
    }
}
*/

// Counting Sort ✅ 
/* 
public class JavaBasics {
    public static void countingSort(int arr[]) {
        int n = arr.length;
        int max = arr[0];

        // find the maximum element from the array to know the size of count array
        for (int i = 1; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int count[] = new int[max + 1];
        // store count of each element in an array
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        // change count[i] so that count[i] contains actual position of this element in original array
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // build the output array
        int output[] = new int[n];
        for (int i = 0; i < n; i++) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // copy the output array to arr[] so that it can be shown to the user
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void printArr(int arr[]) {
        System.out.println("The sorted array is: ");

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        System.out.println();
    }    

    public static void main(String[] args) {
        int arr[]  = {1, 4, 1, 3, 2, 4, 3, 7};

        countingSort(arr);
        printArr(arr);
    }
}
*/

