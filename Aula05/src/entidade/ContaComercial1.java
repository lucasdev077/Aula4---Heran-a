package entidade;

import entidade.enums.Cores;

public class ContaComercial1 extends Conta1 {

	private double limite;

	public ContaComercial1(String nome, int numero, double saldo, Cores cor, double limite) {
		super(nome, numero, saldo, cor);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String agua() {
		return toString() + "limite: " + limite;
	}

}
