package cn.viewshine.sort;

public class InsertSort implements SortAlgorithm{

    @Override
    public void sort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int key = A[i];
            int j = i-1;
            while(j >= 0 && key < A[j]) {
                A[j+1] = A[j];
                j--;
            }
            A[j+1] = key;
        }
    }
}
