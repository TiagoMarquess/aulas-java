package br.com.caelum.capitulo14;

public class ExercicioString_14_10_13 {

	public static void main(String[] args) {
		//declarando uma string
		String s = "abc";
		for (int i = s.length() - 1; i >= 0; i--) {
			//imprime cada caracter separadamente na mesma linha
			System.out.print(s.charAt(i));
		}
	}

}
