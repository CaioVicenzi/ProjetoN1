package br.com.loja;

import br.com.loja.modelo.Banco;
import br.com.loja.modelo.Cliente;
import br.com.loja.modelo.Funcionario;
import br.com.loja.modelo.Loja;

public class Main {
	public static void main(String[] args) {
		//Deve conter um total de 1 banco
		Banco bancoPrincipal = new Banco();
		
		// 2 lojas
		Loja lojaSapatos = new Loja("Caio Sapatos");
		Loja lojaRoupas = new Loja("Caio Roupas");
		
		
		// 4 funcionarios (2 por loja)
		Funcionario caio = new Funcionario();
		Funcionario giovanni = new Funcionario();
		Funcionario eduardo = new Funcionario();
		Funcionario raquel  = new Funcionario();
		
		// adicionando os funcionários nas lojas
		lojaSapatos.addFuncionario(caio);
		lojaSapatos.addFuncionario(giovanni);
		lojaRoupas.addFuncionario(eduardo);
		lojaRoupas.addFuncionario(raquel);		
		
		// 5 clientess
		Cliente thiago = new Cliente();
		Cliente pedro = new Cliente();
		Cliente joao = new Cliente();
		Cliente mateus = new Cliente();
		Cliente paulo = new Cliente();
		
	}
}
