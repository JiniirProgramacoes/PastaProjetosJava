package teste.principal;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import teste.Aluno;
import teste.ColecaoAluno;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		ColecaoAluno ca = new ColecaoAluno();
		Random r = new Random();
		
		for (int cont = 0; cont < 5; cont++) {
			
			Aluno a = new Aluno();
			System.out.println("Digite o nome do aluno: ");	
			a.setNome(in.nextLine());

			ca.cadastrarAlunoOtimizado(a);
		}

		System.out.println(Arrays.toString(ca.retornoAluno()));

	}

}
