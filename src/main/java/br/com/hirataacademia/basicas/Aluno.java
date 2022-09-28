package br.com.hirataacademia.basicas;

import java.util.Date;

import javax.persistence.Entity;

import br.com.hirataacademia.basicas.exception.ValorNegativoException;

@Entity
public class Aluno extends Pessoa {

	private float imc;
	private float peso;
	private float altura;
	private double percentualGordura;
	private String contato;

	public Aluno() {
		super();

	}

	public Aluno(String nome, Date dataDeNascimento, String cpf, Endereco endereco, float peso, float altura,
			double percentualGordura, String contato) throws ValorNegativoException {
		super(nome, dataDeNascimento, cpf, endereco);
		
		if (peso <= 0 || altura <= 0) {
			throw new ValorNegativoException("O peso ou altura estão errados");
		}
		
		this.percentualGordura = percentualGordura;
		this.contato = contato;
		this.peso = peso;
		this.altura = altura;
		calcularImc();

	}

	public float getImc() {
		return imc;
	}

	public void setImc(float imc) {
		this.imc = imc;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) throws ValorNegativoException {

		if (peso <= 0) {
			throw new ValorNegativoException("O peso é negativo");
		}

		this.peso = peso;
		calcularImc();

	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) throws ValorNegativoException {
		if (altura <= 0) {
			throw new ValorNegativoException("A altura é negativa");
		}

		this.altura = altura;
		calcularImc();
	}

	public double getPercentualGordura() {
		return percentualGordura;
	}

	public void setPercentualGordura(double percentualGordura) {
		this.percentualGordura = percentualGordura;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	private void calcularImc() {
		imc = peso / (altura * altura);
	}
	

	@Override
	public String toString() {
		return "Aluno [imc=" + imc + ", peso=" + peso + ", altura=" + altura + ", percentualGordura="
				+ percentualGordura + ", contato=" + contato + ", getId()=" + getId() + ", getNome()=" + getNome()
				+ ", getDataDeNascimento()=" + getDataDeNascimento() + ", getCpf()=" + getCpf() + ", getEndereco()="
				+ getEndereco() + "]";
	}
	
	

}
