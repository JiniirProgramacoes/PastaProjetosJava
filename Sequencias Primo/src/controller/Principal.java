package controller;

public class Principal {
    
    public static void main(String[] args){
        
        for(int i = 1; i <= 10000000; i++){
           if(verificarPrimo(i)){
            System.out.println(i);
           }
        }
        
    }
    
    public static boolean verificarPrimo(int a){
        int quantDivisores = 0;
        int i = 1;
        while(i <= a){
            if(a%i == 0){
                quantDivisores++;
            }
            i++;
        }
        if(quantDivisores == 2){
            return true;
        }
        return false;
    }
    
}
