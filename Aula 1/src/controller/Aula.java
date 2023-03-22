package controller;

import java.util.Scanner;

public class Aula {
    
    public static void main(String[] args){
        
        Servicos serv = new Servicos();
        
        serv.mensagem("Olá IFBA!");
        
        int anoNascimento;
        int anoAtual;
        
        double nota1;
        double nota2;
        double nota3;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva a seguir o seu ano de nascimento:");
        anoNascimento = scan.nextInt();
        System.out.println("Escreva a seguir o ano Atual:");
        anoAtual = scan.nextInt();
        
        System.out.println("Sua idade nesse ano será de "+serv.idade(anoAtual, anoNascimento)+" anos");
 
        
        System.out.println("Escreva a seguir suas 3 notas, sempre dando Enter entre elas");
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        nota3 = scan.nextDouble();
        
        serv.media(nota1, nota2, nota3);
        
        /* Velocidade
        double distancia;
        double tempo;
        double velocidade;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Escreva a seguir a distância em km pecorrida:");
        distancia = scan.nextDouble();
        System.out.println("Agora a seguir escreva o tempo que demorou para chegar ao destino, em horas:");
        tempo = scan.nextDouble();
        
        velocidade = distancia/tempo;
        
        System.out.println("Sua velocidade era de "+velocidade+"km/h.");
        */
        
        double preço;
        int quantParcelas;
        double preçoParcela;
        
        
        System.out.println("Qual o preço do produto?");
        preço = scan.nextDouble();
        System.out.println("Quantas parcelas? (Por causa da atividade será selecionado 5 parcelas)");
        quantParcelas = 5;
        
        preçoParcela = preço / quantParcelas;
        
        System.out.println("As parcelas deram no valor de : R$"+preçoParcela+" para serem pagas 5 vezes.");
        
    }
    
}
