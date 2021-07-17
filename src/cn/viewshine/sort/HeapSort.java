package cn.viewshine.sort;

public class HeapSort implements SortAlgorithm{
    private int left(int i) {
        return 2*i+1;
    }
    private int right(int i) {
        return 2*i+2;
    }
    private void MAX_HEAPIFY(int A[], int i, int n) {
        int max = i;
        int l = left(i);
        int r = right(i);
        if (l < n && A[l] > A[max]) max = l;
        if (r < n && A[r] > A[max]) max = r;
        if (max != i) {
            int temp = A[i];
            A[i] = A[max];
            A[max] = temp;
            MAX_HEAPIFY(A, max, n);
        }
    }
    private void BUILD_MAX_HEAP(int A[], int n) {
        for(int i = n/2-1; i >= 0; i--) {
            MAX_HEAPIFY(A, i, n);
        }
    }
    private void HEAP_SORT(int[] A, int n) {
        BUILD_MAX_HEAP(A, n);
        for (int i = n-1; i > 0; i--) {
            int temp = A[0];
            A[0] = A[i];
            A[i] = temp;
            MAX_HEAPIFY(A, 0, i);
        }

    }
    @Override
    public void sort(int[] A) {
        HEAP_SORT(A, A.length);
    }
}
