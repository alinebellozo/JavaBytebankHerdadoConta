package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc = new ContaCorrente(22, 22);
//		Conta cc2 = new ContaCorrente(22, 22);
//		
//		boolean igual = cc.ehIgual(cc2);
//		System.out.println(igual);

		// <> = generics
		// List<Conta> lista = new ArrayList<Conta>();
		// List<Conta> lista = new LinkedList<Conta>();
		List<Conta> lista = new Vector<Conta>(); // thread safe
		
		Conta cc = new ContaCorrente(22, 11);
	    lista.add(cc);

	    Conta cc2 = new ContaCorrente(22, 22);
	    lista.add(cc2);
	        
	    Conta cc3 = new ContaCorrente(22, 22);
	    boolean existe = lista.contains(cc3);
	    
	    System.out.println("Já existe? " + existe);
	    
//	    for(Conta conta : lista) {
//	    	if(conta.ehIgual(cc3));
//	    	System.out.println("Já existe!");
//	    }
	     
	    for(Conta conta : lista) {
	    	 System.out.println(conta);
	    }
	}

}
