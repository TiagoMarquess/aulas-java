package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// classe Primeira Logica herda os metodos da Interface Logica
public class PrimeiraLogica implements Logica{

	// sobreescrevendo um metodo herdado
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("Executando a logica...");
		System.out.println("Retornando o nome da página JSP...");
		return "primeira-logica.jsp";
	}

}
