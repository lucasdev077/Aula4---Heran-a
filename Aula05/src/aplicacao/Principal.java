package aplicacao;

import entidade.ContaComercial;

import entidade.enums.Cores;

public class Principal {

	public static void main(String[] args) {
		
		ContaComercial cc = new ContaComercial("Fernando", 1234, 600, Cores.BLACK, 250);
		
		cc.depositar(100);
		
		System.out.println(cc.agua());
		
		
	}

}
