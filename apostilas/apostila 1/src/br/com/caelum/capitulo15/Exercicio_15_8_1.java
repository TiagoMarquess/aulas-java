package br.com.caelum.capitulo15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Exercicio15_8_1 {
	public static void main(String[] args) throws IOException {

		//variavel is receber� a entrada de dados via teclado
		InputStream is =  System.in;

		// isr vai ler o que for recebido pela vari�vel is
		InputStreamReader isr =  new InputStreamReader(is);

		// armazena ficar o que for lido pela variavel isr
		BufferedReader br = new BufferedReader(isr);
		
		//imprime uma mensagem
		System.out.println("Digite sua mensagem:");
		
		// a vari�vel linha receber� o que for lido pelo teclado
		String linha = br.readLine();
		
		//enquanto a vari�vel linha for diferente de nulo
		while (linha != null) {

			//imprime o que houver na linha
			System.out.println(linha);
			linha = br.readLine();
		}
	}

}
