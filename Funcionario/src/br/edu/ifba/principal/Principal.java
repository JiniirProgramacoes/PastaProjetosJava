package br.edu.ifba.principal;

import br.edu.ifba.basica.Funcionario;
import br.edu.ifba.cadastros.Servico;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Servico ser = new Servico();
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < 1; i++){
            Funcionario f = new Funcionario();
            System.out.println("Digite o nome:");
            String nome = scan.next();
            System.out.println("Digite o cpf:");
            String cpf = scan.next();
            System.out.println("Digite a função:");
            String funcao = scan.next();
            f.setNome(nome);
            f.setCpf(cpf);
            f.setFuncao(funcao);
            ser.adicionar(f);
        }
        //System.out.println("Deseja procurar qual funcionário pelo nome?");
        //String nomeProcurar = scan.next();
        //System.out.println(ser.procurar(nomeProcurar));
        System.out.println(ser.listar());
        ser.remover(0);
        System.out.println(ser.listar());
    }
}
