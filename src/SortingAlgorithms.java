import java.util.Random;

/**
 * Class that has sorting and searching algorithms
 */
public class SortingAlgorithms {


    // Insertion sort algorithm
    public static void insertionsort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i-1;
            while(j >=0 && temp < list[j]) {
                list[j+1] = list[j];
                j--;
            }
            list[j+1] = temp;
        }
    }

    // Bubble sort algorithm
    public static void bubblesort(int[] list) {
        int n = list.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (list[j] > list[j+1]) {

                    // Swap list[j] and list[j+1]
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

    // Selection sort algorithm
    public static void selectionsort(int[] list) {
        int n = list.length;

        for (int i = 0; i < n -1; i++) {

            int min = i;
            for (int j = i+1; j < n; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }
            int temp = list[min];
            list[min] = list[i];
            list[i] = temp;

        }
    }

    // List merge algorithm
    public static void listMerge(int[] list1, int[] list2, int[] list3) {
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        while(p1 != list1.length && p2 != list2.length) {
            if (list1[p1] < list2[p2]) {
                list3[p3] = list1[p1];
                p1++;
            }
            else {
                list3[p3] = list2[p2];
                p2++;
            }
            p3++;
        }
        if (p1 == list1.length) {
            while(p2 != list2.length) {
                list3[p3] = list2[p2];
                p2++;
                p3++;
            }
        }
        if (p2 == list2.length) {
            while(p1 != list1.length) {
                list3[p3] = list1[p1];
                p1++;
                p3++;
            }
        }

    }

    // Print array method
    public static void printArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    // Fill array method
    public static void fillArray(int[] list) {
        Random rnd = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = rnd.nextInt(100);
        }
    }

    // Binary search algorithm
    public static boolean binarySearch(int[] list, int x) {

        int first = 0, last = list.length - 1, pivot = 0;
        boolean found = false;
        while (first <= last && !found) {
            pivot = (first + last) / 2;
            if (list[pivot] == x) {
                found = true;
            }
            else {
                if (x < list[pivot]) {
                    last = pivot -1;
                }
                else {
                    first = pivot + 1;
                }
            }
        }
        if (found) {
            System.out.println("Your element is at " + pivot);
        }
        else {
            System.out.println("Your element is not found");
        }
        return found;
    }

    // Sequential search algorithm
    public static boolean sequentialSearch(int[] list, int x) {
        boolean found = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == x) {
                found = true;
                break;
            }
        }
        return found;
    }

    // Sorted search algorithm
    public static void sortedsearch(int[] list, int x) {
        int n = list.length;
        int i = 0;
        while (i < n && list[i] < x) {
            i++;
        }
        if (i < n && list[i] == x) {
            System.out.println("Found");
        }
        else {
            System.out.println("Not found");
        }
    }
}
