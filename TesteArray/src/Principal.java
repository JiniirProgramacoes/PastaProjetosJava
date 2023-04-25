import ifba.biblioteca.array.*;

public class Principal {
    
    public static void main(String[] args) {
        
        ArrayIFBA<Integer> ifbaLista = new ArrayIFBA<Integer>();
        
        ifbaLista.adicionar(1);
        ifbaLista.adicionar(20);
        ifbaLista.adicionar(3);
        ifbaLista.adicionarPorPosicao(1, 100);
        ifbaLista.listar();
        ifbaLista.removerPorPosicao(2);
        ifbaLista.listar();
        
    }
    
}
