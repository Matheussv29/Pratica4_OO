package br.com.newton.poo.lojaComercial;

public class Vendedor extends Ancestral{
	private double salarioBase, comissao;
	private int vendas;

	public Vendedor(String nome, String rg, double salarioBase, double comissao, int vendas) {
		super(nome, rg);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
		this.vendas = vendas;
	}
	


	public double getSalarioBase() {
		return salarioBase;
	}



	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}



	public double getComissao() {
		return comissao;
	}



	public void setComissao(double comissao) {
		this.comissao = comissao;
	}



	public int getVendas() {
		return vendas;
	}



	public void setVendas(int vendas) {
		this.vendas = vendas;
	}
	
	public void vendas() {
		return;
	}
	
	
	
	public double salarioTotal() {
		comissao = getSalarioBase() * 5/100;
		double valorComissaoTotal = comissao * vendas;
		double valorTotal = getSalarioBase() + valorComissaoTotal;
		return valorTotal;
	
	}
	
	

}
