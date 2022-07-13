/**
 * 
 */
package com.JavaFirst.Model;

import java.util.Objects;

/**
 * @author bnave
 *
 */
public class Livro {
	private String nome;
	private String npag;
	/**
	 * @param nome
	 * @param npag
	 */
	public Livro(String nome, String npag) {
		this.nome = nome;
		this.npag = npag;
	}
	/**
	 * 
	 */
	public Livro() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", npag=" + npag + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, npag);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(npag, other.npag);
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
	 * @return the npag
	 */
	public String getNpag() {
		return npag;
	}
	/**
	 * @param npag the npag to set
	 */
	public void setNpag(String npag) {
		this.npag = npag;
	}
	
	
	
}
