package br.com.caelum.capitulo16;

import java.util.LinkedList;

public class Exercicio_16_15_2_LinkedList {

	public static void main(String[] args) {

		// decalra um objeto do tipo LinkedList
		LinkedList lista = new LinkedList();

		// adicionando valores a lista
		lista.add("Segundo");
		lista.add("Terceiro");
		lista.add("Quarto");

		// adiciona um valor na primeira prosi��o da lista, criando um novo espa�o e sem
		// apagar o que j� havia antes
		lista.addFirst("Primeiro");
		// adiciona um valor na ultima prosi��o da lista
		lista.addLast("Ultimo");

		// imrpime a lista
		System.out.println(lista);
	}

}
