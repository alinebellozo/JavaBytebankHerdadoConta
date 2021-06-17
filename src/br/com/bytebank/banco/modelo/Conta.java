package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author Aline
 *
 */

public abstract class Conta extends Object implements Comparable<Conta>, Serializable {
	
	protected double saldo;
	private int agencia;
	private int numero;
	private transient Cliente titular; // transient: que não pertence à serialização
	private static int total; // static: atributo da classe
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agência e do número
	 * 
	 * @param agencia
	 * @param numero
	 */
	
	
	public Conta(int agencia, int numero) { //o () é o construtor
		Conta.total++;
	//	System.out.println("O total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
	//	System.out.println("Estou criando uma conta " + this.numero);
	}
	
	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser maior que o saldo
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
		
		
	public void saca (double valor) throws SaldoInsuficienteException {
		
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("O saldo é " + this.saldo + ", valor do saque: " + valor);
		}
		this.saldo -= valor;
		
	}
	
	public void transfere (double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Valor inválido");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Valor inválido");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Conta outra) {
				
		return Double .compare(this.saldo, outra.saldo);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Número: " + this.numero + ", Agência: " + this.agencia + ", saldo: " + this.saldo;
	}
	
}