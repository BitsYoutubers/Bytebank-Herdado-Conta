package br.com.bytebank.banco.Testes.utill;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
//		Conta cc1 = new ContaCorrente(22, 11);
//		Conta cc2 = new ContaCorrente(22, 11);
//		
//		boolean igual = cc1.eIgual(cc2);
//		System.out.println(igual);

        ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		
		boolean existe = lista.contains(cc3);
		
		System.out.println("J� existe? " + existe);
		
		for(Object conta : lista) {
			System.out.println(conta);
		}

		
	}

}
