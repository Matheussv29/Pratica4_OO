package br.com.newton.poo.lojaComercial;

public class Administrativo extends Ancestral {
	private double salarioFixo, horaExtra, adicionais;

	public Administrativo(String nome, String rg, double salarioFixo, double horaExtra, double adicionais) {
		super(nome, rg);
		this.salarioFixo = salarioFixo;
		this.horaExtra = horaExtra;
		this.adicionais = adicionais;
	}

	public double getSalarioFixo() {
		return salarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		this.salarioFixo = salarioFixo;
	}

	public double getHoraExtra() {
		return horaExtra;
	}

	public void setHoraExtra(double horaExtra) {
		this.horaExtra = horaExtra;
	}

	public double getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(double adicionais) {
		this.adicionais = adicionais;
	}
	
	public double salarioTotal() {
		adicionais = getSalarioFixo() * 1/100;
		double totalAdicionais = adicionais * horaExtra;
		double valorTotal = getSalarioFixo() + totalAdicionais;
		return valorTotal;
		
	}

	
	

}
