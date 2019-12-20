package br.com.caelum.capitulo15;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Exercicio_15_8_8 {

	public static void main(String[] args) throws IOException {
		
		// variavel is receber� o que for enviado via teclado
		InputStream is =  System.in;
		// scanner de entrada vai ler o que for recebido na variavel is
		Scanner entrada =  new Scanner(is);

		// variavel os ir� utilizar de saida2.txt
		OutputStream os = new FileOutputStream("saida2.txt");

		//  variavel osw ir� escrever no arquivo apontado pela vari�vel os
		OutputStreamWriter osw = new OutputStreamWriter(os);

		//buffer bw ir� armazenar o que for escrito na variavel osw
		BufferedWriter bw = new BufferedWriter(osw); 
		
		//imprime uma mensagem
		System.out.println("Digite sua mensagem:");
		
		// enquanto a entrada tiver uma proxima linha
		while (entrada.hasNextLine()) {
			String linha = entrada.nextLine();
			// escreve o que foi digitado pelo usu�rio em uma linha no arquivo
			bw.write(linha);
			//gera uma nova linha
			bw.newLine();
		}
		// fecha o buffer
		bw.close();
		//fecha o arquivo
		entrada.close();
	}

}
