package cn.viewshine.sort;

public class QuickSort implements SortAlgorithm{

    private int partition(int[] A, int p, int r) {
        int i = p-1;
        for (int j = p; j < r; j++) {
            if (A[j] < A[r]) {
                int temp = A[++i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        int temp = A[i+1];
        A[i+1] = A[r];
        A[r] = temp;
        return i+1;
    }
    private void quickSort(int[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            quickSort(A, p, q-1);
            quickSort(A, q+1, r);
        }
    }
    @Override
    public void sort(int[] A) {
        quickSort(A, 0, A.length-1);
    }
}
