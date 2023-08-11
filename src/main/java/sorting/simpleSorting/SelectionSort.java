package sorting.simpleSorting;
import util.Util;
import sorting.AbstractSorting;

/**
 * The selection sort algorithm chooses the smallest element from the array and
 * puts it in the first position. Then chooses the second smallest element and
 * stores it in the second position, and so on until the array is sorted.
 */
public class SelectionSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		int j = leftIndex;
		while (leftIndex < rightIndex) {
			for (int i = j; i < array.length; i++) {
				int comparador = array[j].compareTo(array[i]);  // >0 menor, <0, maior, =0 iguais
				if (comparador > 0) {
					Util.swap(array, i, j);
				}
			}
			j++;
		}
	}
}
