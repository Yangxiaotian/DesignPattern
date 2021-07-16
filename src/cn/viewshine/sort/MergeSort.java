package cn.viewshine.sort;

public class MergeSort implements SortAlgorithm{
    private void merge(int[] A, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[] = new int[n1];
        int R[] = new int[n2];
        int i, j, k = 0;
        for (i = 0; i < n1; i++) L[i] = A[p+i];
        for (j = 0; j < n2; j++) R[j] = A[q+j+1];
        for (i = 0, j = 0; i < n1 && j < n2;) {
            if (L[i] < R[j])
                A[p+k++] = L[i++];
            else A[p+k++] = R[j++];
        }
        while (i < n1) A[p+k++] = L[i++];
        while (j < n2) A[p+k++] = R[j++];
    }
    private void mergeSort(int[] A, int p, int r) {
        if (p < r) {
            int q = (p+r)/2;
            mergeSort(A, p, q);
            mergeSort(A, q+1, r);
            merge(A, p, q, r);
        }
    }
    @Override
    public void sort(int[] A) {
        mergeSort(A, 0, A.length-1);
    }
}
