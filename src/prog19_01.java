public class prog19_01 {

    public static void main(String[] args) {

        // Testing insertion sort vs bubble sort
        int size = 10000;
        int[] d = new int[size];
        SortingAlgorithms.fillArray(d);
        SortingAlgorithms.insertionsort(d);
        System.out.println("Done");
        SortingAlgorithms.bubblesort(d);
        System.out.println("Done");


        // Testing list merge method which merges two sorted lists
        int[] a = new int[10];
        SortingAlgorithms.fillArray(a);
        SortingAlgorithms.insertionsort(a);
        System.out.println("Array A:");
        SortingAlgorithms.printArray(a);

        int[] b = new int[10];
        SortingAlgorithms.fillArray(b);
        SortingAlgorithms.insertionsort(b);
        System.out.println("Array B: ");
        SortingAlgorithms.printArray(b);

        int[] c = new int[20];
        SortingAlgorithms.listMerge(a, b, c);
        System.out.println("Combining Array A and B into C: ");
        SortingAlgorithms.printArray(c);



        // Bubble sort vs insertion sort vs selection sort
        int[] e = new int[10000];
        SortingAlgorithms.fillArray(e);
        System.out.println("Array E sorted: ");
        long start = System.nanoTime();
        SortingAlgorithms.insertionsort(a);
        long elapsed = System.nanoTime() - start;
        System.out.println("It took " + elapsed + " ns");

        int[] f = new int[10000];
        SortingAlgorithms.fillArray(f);
        System.out.println("Array F sorted: ");
        long start2 = System.nanoTime();
        SortingAlgorithms.bubblesort(b);
        long elapsed2 = System.nanoTime() - start2;
        System.out.println("It took " + elapsed2 + " ns");

        int[] g = new int[10000];
        SortingAlgorithms.fillArray(g);
        System.out.println("Array G sorted: ");
        long start5 = System.nanoTime();
        SortingAlgorithms.selectionsort(g);
        long elapsed5 = System.nanoTime() - start5;
        System.out.println("It took " + elapsed5 + " ns");


        System.out.println();
        
        // Sequential search bs sorted search vs binary search
        int[] h = new int[10000];
        SortingAlgorithms.fillArray(h);
        SortingAlgorithms.insertionsort(h);

        long start3 = System.nanoTime();
        SortingAlgorithms.sequentialSearch(h,20);
        long elapsed3 = System.nanoTime() - start3;
        System.out.println("It took " + elapsed3 + " ns");

        long start4 = System.nanoTime();
        SortingAlgorithms.sortedsearch(h, 20);
        long elapsed4 = System.nanoTime() - start4;
        System.out.println("It took " + elapsed4 + " ns");

        long start6 = System.nanoTime();
        SortingAlgorithms.binarySearch(h, 20);
        long elapsed6 = System.nanoTime() - start6;
        System.out.println("It took " + elapsed6 + " ns");

    }
}
