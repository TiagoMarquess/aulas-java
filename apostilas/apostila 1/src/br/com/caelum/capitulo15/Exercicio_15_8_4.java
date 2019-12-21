package br.com.caelum.capitulo15;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercicio_15_8_4 {

	public static void main(String[] args) throws IOException {

		// variavel is receber� a entrada de dados via teclado
		// isr vai ler o que for recebido pela vari�vel is
		// armazena ficar o que for lido pela variavel isr
		// armazena ficar o que for lido pela variavel isr
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("arquivo.txt")));

		// a vari�vel linha receber� o que for lido na vari�vel br
		String linha = br.readLine();

		//enquanto a vari�vel linha for diferente de nulo
		while (linha != null) {
			//imprime o que houver na linha
			System.out.println(linha);
			linha = br.readLine();
		}
		//fecha o arquivo
		br.close();
	}

}
