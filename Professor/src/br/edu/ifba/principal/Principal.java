package br.edu.ifba.principal;

import br.edu.ifba.basica.Conta;
import br.edu.ifba.cadastros.CadastroObject;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta c = new Conta("Fulano", 20);
		Conta c1 = new Conta("Beltrano", 10.5);
		Conta c2 = new Conta("Sicrano", 15.5);
		Conta c3 = new Conta("Coisinha", 0.5);
                Conta c4 = new Conta("Miguel", 55.5);
                Conta c5 = new Conta("João", 2);
		CadastroObject<Conta> cc = new CadastroObject<Conta>();
		cc.adicionar(c);
		cc.adicionar(c1);
		cc.adicionar(c2);
                cc.adicionar(c4);
		cc.adicionarPorPosicao(1, c3);
                cc.adicionar(c5);
		cc.listar();
                System.out.println(cc.tamanhoVetor());
                cc.removerPorPosicao(5);
                cc.listar();
                System.out.println(cc.tamanhoVetor());

	/*	System.out.println(cc.procurarPosicao(2));
		Conta conta = cc.procurarNome("hulano");
		if (conta == null) {
			System.out.println("Conta n�o encontrada");
		} else {
			System.out.println(conta);
		} */

		System.out.println();

	}

}
