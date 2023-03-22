package controller;

public class Servicos {
    
    public void mensagem(String a){
        System.out.println(a);
    }
    
    public int idade(int anoAtual, int anoNascimento){
        return anoAtual - anoNascimento;
    }
    
    public void media(int nota1, int nota2, int nota3){
        int notaMedia = (nota1+nota2+nota3)/3;
        
        if(notaMedia >= 7){
            System.out.println("Você foi aprovado, com a nota média de: "+notaMedia);
        }else if(notaMedia < 7 && notaMedia >= 5){
            System.out.println("Você não foi aprovado, mas poderá fazer a recuperação, com a nota média de: "+notaMedia);
        }else if(notaMedia < 5){
            System.out.println("Você foi reprovado, com a nota média de: "+notaMedia);
        }
    }
    
    
}
