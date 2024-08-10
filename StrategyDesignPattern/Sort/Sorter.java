public class Sorter {
    SortingStrategy sortingStrategy;

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort(int[] array) {
        if (sortingStrategy != null) {
            sortingStrategy.sort(array);
        }
    }

    public String getApplicationDetail(SortingStrategy sortingStrategy, int[] array) {
        if (sortingStrategy instanceof QuickSort) {
            if (array.length > 10) {
                return "Quick sort is applicable for large datasets.";
            } else {
                return "Quick sort is not suitable for small datasets.";
            }
        } else if (sortingStrategy instanceof BubbleSort) {
            if (array.length <= 10) {
                return "Bubble sort is applicable for small datasets.";
            } else {
                return "Bubble sort is not suitable for large datasets.";
            }
        } else if (sortingStrategy instanceof MergeSort) {
            return "Merge sort is applicable for any dataset size.";
        } else {
            return "Unknown sorting algorithm.";
        }
    }
}
