/**
 * 
 */
package com.JavaFirst.Model;

import java.util.Objects;

/**
 * @author bnave
 *
 */
public class Gato {
	private String nome;
	private Integer idade;
	private String cor;

	/**
	 * @param nome
	 * @param idade
	 * @param cor
	 */
	public Gato(String nome, Integer idade, String cor) {
		
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
	}

	/**
	 * 
	 */
	public Gato() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the idade
	 */
	public Integer getIdade() {
		return idade;
	}

	/**
	 * @param idade the idade to set
	 */
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	/**
	 * @return the cor
	 */
	public String getCor() {
		return cor;
	}

	/**
	 * @param cor the cor to set
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, idade, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gato other = (Gato) obj;
		return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Gato [nome=" + nome + ", idade=" + idade + ", cor=" + cor + ", getNome()=" + getNome() + ", getIdade()="
				+ getIdade() + ", getCor()=" + getCor() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

}
