import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        Sorter sorter = new Sorter();

        System.out.println("1. Bubble Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Merge Sort");
        System.out.print("Select a sorting algorithm: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                sorter.setSortingStrategy(new BubbleSort());
                break;
            case 2:
                sorter.setSortingStrategy(new QuickSort());
                break;
            case 3:
                sorter.setSortingStrategy(new MergeSort());
                break;
            default:
                System.out.println("Invalid choice");
        }

        String detail = sorter.getApplicationDetail(sorter.sortingStrategy, array);
        System.out.println(detail);

        if (!detail.contains("not suitable")) {
            sorter.sort(array);
            System.out.println("Sorted array: " + Arrays.toString(array));
        }
    }
}
