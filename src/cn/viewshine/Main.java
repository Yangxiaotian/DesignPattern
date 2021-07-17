package cn.viewshine;

import cn.viewshine.duck.correct.*;
import cn.viewshine.sort.*;

public class Main {

    public static void main(String[] args) {
	    Duck mallardDuck = new MallardDuck();
	    mallardDuck.display();
	    mallardDuck.swim();
	    mallardDuck.performFly();
	    mallardDuck.performQuack();

	    Duck redheadDuck = new RedheadDuck();
	    redheadDuck.display();
	    redheadDuck.swim();
	    redheadDuck.performFly();
	    redheadDuck.performQuack();

	    Duck rubberDuck = new RubberDuck();
	    rubberDuck.display();
	    rubberDuck.swim();
	    rubberDuck.performFly();
	    rubberDuck.performQuack();

	    Duck decoyDuck = new DecoyDuck();
	    decoyDuck.display();
	    decoyDuck.swim();
	    decoyDuck.performFly();
	    decoyDuck.performQuack();

	    Duck modelDuck = new ModelDuck();
	    modelDuck.display();
	    modelDuck.swim();
	    modelDuck.performFly();
	    modelDuck.setFlyBehavior(new FlyWithWings());
	    modelDuck.performFly();
	    modelDuck.performQuack();

	    int A[] = {3,2,1,4};
		SortAlgorithm insertSort = new InsertSort();
		insertSort.sort(A);
		System.out.println("插入排序");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+" ");
		System.out.println();

		A[0] = 3; A[1] = 2; A[2] = 1; A[3] = 4;
		SortAlgorithm quickSort = new QuickSort();
		quickSort.sort(A);
		System.out.println("快速排序");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+" ");
		System.out.println();

		A[0] = 3; A[1] = 2; A[2] = 1; A[3] = 4;
		SortAlgorithm mergeSort = new MergeSort();
		mergeSort.sort(A);
		System.out.println("归并排序");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+" ");
		System.out.println();

		A[0] = 3; A[1] = 2; A[2] = 1; A[3] = 4;
		SortAlgorithm heapSort = new HeapSort();
		heapSort.sort(A);
		System.out.println("堆排序");
		for (int i = 0; i < A.length; i++)
			System.out.print(A[i]+" ");

    }
}
