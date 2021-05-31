package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		String vazio = " Alura ";
		String outroVazio = vazio.trim(); // trim tira os espaços no começo e no final
		
		System.out.println(vazio.contains("Alu"));
		System.out.println(outroVazio);
		
		
		String nome = "Alura"; // object literal
		// não precisa colocar "new" para String
		// String outro = nome.replace("A", "a");
	
		System.out.println(nome.length());
		
		for(int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
		
//		char c = nome.charAt(2); //posição do caractere; começa com zero
//		System.out.println(c);
		
		//		char c = 'A'; // char representa um caractere só, e usa aspas simples
//		char d = 'a';
//		String outra = nome.replace(c, d);
		
		// String outra = nome.toLowerCase();
		
		// nome.toLowerCase();
		
//		System.out.println(nome);
//		System.out.println(outra);
		
	}

}
