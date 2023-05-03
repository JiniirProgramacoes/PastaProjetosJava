package br.edu.ifba.cadastros;

import br.edu.ifba.basica.Funcionario;
import java.util.Arrays;

public class Servico {
    
    Funcionario[] func = new Funcionario[5];
    int total = 0;
    
    public void adicionar(Funcionario f){
        aumentarVetor();
        func[this.total] = f;
        this.total++;
    }
    
    public String listar(){
        return Arrays.toString(func);
    }
    
    public Funcionario procurar(String nome){
        for(Funcionario f : this.func){
            if(f.getNome().equalsIgnoreCase(nome)){
                return f;
            }
        }
        return null;
    }
    
    public void remover(int index){
        aumentarVetor();
        if(!(index >= 0 && index < this.total)){
            throw new IllegalAccessError("Posição inválida");
        }
        for(int cont = index; cont < this.total; cont++){
            this.func[cont] = this.func[cont+1];
        }
        this.total--;
    }
    
    public void removerCpf(String cpf){
        for(int cont = 0; cont < this.total; cont++){
            if(func[cont].getCpf().equalsIgnoreCase(cpf)){
               this.remover(cont);
            }
        }
    }
    
    public void aumentarVetor(){
        if(this.func.length == this.total){
            Funcionario[] funcNovo = new Funcionario[this.func.length*2];
            System.arraycopy(func, 0, funcNovo, 0, func.length);
            this.func = funcNovo;
        }
    }
}
