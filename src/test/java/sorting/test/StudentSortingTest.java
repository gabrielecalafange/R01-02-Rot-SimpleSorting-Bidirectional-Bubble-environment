package sorting.test;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import sorting.AbstractSorting;
import sorting.simpleSorting.BubbleSort;
import sorting.simpleSorting.InsertionSort;
import sorting.simpleSorting.SelectionSort;
import sorting.variationsOfBubblesort.RecursiveBubbleSort;
import sorting.variationsOfSelectionsort.RecursiveSelectionSort;

public class StudentSortingTest {

	private Integer[] vetorTamPar;
	private Integer[] vetorTamImpar;
	private Integer[] vetorVazio = {};
	private Integer[] vetorValoresRepetidos;
	private Integer[] vetorValoresIguais;

	public AbstractSorting<Integer> implementationSelectionSort;
	public AbstractSorting<Integer> implementationInsertionSort;
	public AbstractSorting<Integer> implementationBubbleSort;
	public AbstractSorting<Integer> implementationSelectionSort_recursive;

	public AbstractSorting<Integer> implementationBubbleSort_recursive;



	@Before
	public void setUp() {
		populaVetorTamanhoPar(new Integer[] { 30, 28, 7, 29, 11, 26, 4, 22, 23,
				31 });
		populaVetorTamanhoImpar(new Integer[] { 6, 41, 32, 7, 26, 4, 37, 49,
				11, 18, 36 });
		populaVetorRepetido(new Integer[] { 4, 9, 3, 4, 0, 5, 1, 4 });
		populaVetorIgual(new Integer[] { 6, 6, 6, 6, 6, 6 });

		getImplementation();
	}

	// // MÉTODOS AUXILIARES DA INICIALIZAÇÃO
	/**
	 * Método que inicializa a implementação a ser testada com a implementação
	 * do aluno
	 */
	private void getImplementation() {
		this.implementationSelectionSort = new SelectionSort<Integer>();
		this.implementationInsertionSort = new InsertionSort<Integer>();
		this.implementationBubbleSort = new BubbleSort<Integer>();
		this.implementationSelectionSort_recursive = new RecursiveSelectionSort<Integer>();
		this.implementationBubbleSort_recursive = new RecursiveBubbleSort<Integer>();
	}

	public void populaVetorTamanhoPar(Integer[] arrayPadrao) {
		this.vetorTamPar = Arrays.copyOf(arrayPadrao, arrayPadrao.length);
	}

	public void populaVetorTamanhoImpar(Integer[] arrayPadrao) {
		this.vetorTamImpar = Arrays.copyOf(arrayPadrao, arrayPadrao.length);
	}

	public void populaVetorRepetido(Integer[] arrayPadrao) {
		this.vetorValoresRepetidos = Arrays.copyOf(arrayPadrao,
				arrayPadrao.length);
	}

	public void populaVetorIgual(Integer[] arrayPadrao) {
		this.vetorValoresIguais = Arrays
				.copyOf(arrayPadrao, arrayPadrao.length);
	}

	// FIM DOS METODOS AUXILIARES DA INICIALIZAÇÃO
	// MÉTODOS DE TESTE "SIMPLE SORTING"

	public void genericTest(Integer[] array) { // testa o SelectionSort
		Integer[] copy1 = {};
		if(array.length > 0){
			copy1 = Arrays.copyOf(array, array.length);			
		}
		implementationSelectionSort.sort(array);
		Arrays.sort(copy1);
		Assert.assertArrayEquals(copy1, array);
	}

	public void genericTest2(Integer[] array) { // testa o InsertionSort
		Integer[] copy1 = {};
		if(array.length > 0){
			copy1 = Arrays.copyOf(array, array.length);
		}
		implementationInsertionSort.sort(array);
		Arrays.sort(copy1);
		Assert.assertArrayEquals(copy1, array);
	}

	public void genericTest3(Integer[] array) { // testa o BubbleSort
		Integer[] copy1 = {};
		if(array.length > 0){
			copy1 = Arrays.copyOf(array, array.length);
		}
		implementationBubbleSort.sort(array);
		Arrays.sort(copy1);
		Assert.assertArrayEquals(copy1, array);
	}

	@Test
	public void testSort01() {
		genericTest(vetorTamPar);
		genericTest2(vetorTamPar);
		genericTest3(vetorTamPar);
	}

	@Test
	public void testSort02() {
		genericTest(vetorTamImpar);
		genericTest2(vetorTamImpar);
		genericTest3(vetorTamImpar);
	}

	@Test
	public void testSort03() {
		genericTest(vetorVazio);
		genericTest2(vetorVazio);
		genericTest3(vetorVazio);
	}

	@Test
	public void testSort04() {
		genericTest(vetorValoresIguais);
		genericTest2(vetorValoresIguais);
		genericTest3(vetorValoresIguais);
	}

	@Test
	public void testSort05() {
		genericTest(vetorValoresRepetidos);
		genericTest2(vetorValoresRepetidos);
		genericTest3(vetorValoresRepetidos);
	}

	// MÉTODOS DE TESTE "VARIATIONS"

	public void genericTest_recursive(Integer[] array) { // testa o SelectionSort Recursivo
		Integer[] copy1 = {};
		if(array.length > 0){
			copy1 = Arrays.copyOf(array, array.length);
		}
		implementationSelectionSort_recursive.sort(array);
		Arrays.sort(copy1);
		Assert.assertArrayEquals(copy1, array);
	}

	public void genericTest_recursive2(Integer[] array) { // testa o SelectionSort Recursivo
		Integer[] copy1 = {};
		if(array.length > 0){
			copy1 = Arrays.copyOf(array, array.length);
		}
		implementationBubbleSort_recursive.sort(array);
		Arrays.sort(copy1);
		Assert.assertArrayEquals(copy1, array);
	}

	@Test
	public void testSort01_recursive() {
		genericTest_recursive(vetorTamPar);
		genericTest_recursive2(vetorTamPar);
	}

	@Test
	public void testSort02_recursive() {
		genericTest_recursive(vetorTamImpar);
		genericTest_recursive2(vetorTamImpar);
	}

	@Test
	public void testSort03_recursive() {
		genericTest_recursive(vetorVazio);
		genericTest_recursive2(vetorVazio);

	}

	@Test
	public void testSort04_recursive() {
		genericTest_recursive(vetorValoresIguais);
		genericTest_recursive2(vetorValoresIguais);

	}

	@Test
	public void testSort05_recursive() {
		genericTest_recursive(vetorValoresRepetidos);
		genericTest_recursive2(vetorValoresRepetidos);
	}

}