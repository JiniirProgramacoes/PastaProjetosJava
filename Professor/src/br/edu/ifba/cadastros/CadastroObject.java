package br.edu.ifba.cadastros;

import br.edu.ifba.basica.Conta;
import java.util.Arrays;

public class CadastroObject<C> {

	Object[] obj = new Object[2];
	int total = 0;

	public void adicionar(C o) {
		aumentaVetor();
		obj[this.total] = o;
		this.total++;
	}

	public void adicionarPorPosicao(int posicao, C obj) {
		aumentaVetor();
		if (!verificaPosicao(posicao)) {

			throw new IllegalArgumentException("posi��o inv�lida!");
		}

		for (int cont = this.total - 1; cont >= posicao; cont--) {

			this.obj[cont + 1] = this.obj[cont];

		}

		this.obj[posicao] = obj;

		this.total++;

	}
        
        public void removerPorPosicao(int posicao){
            aumentaVetor();
            if(!(posicao >= 0 && posicao < this.total)){
                throw new IllegalArgumentException("posi��o inv�lida!");
            }
            for(int cont = posicao; cont <= this.total; cont++){
                this.obj[cont] = this.obj[cont + 1];
            }
            this.total--;
        }

	public void listar() {

		System.out.println(Arrays.toString(this.obj));

	}

	public Object procurarPosicao(int p) {

		if (!verificaPosicao(p)) {

			throw new IllegalArgumentException("posi��o inv�lida!");
		}

		return this.obj[p];
	}

	/*public Object procurarNome(String nome) {
		Object o = null;

		for (int cont = 0; cont < this.total; cont++) {
			// utilizado o m�todo Equals da classe String para comparar Strings
			if (nome.equalsIgnoreCase((Conta)this.obj[cont].getNome())) {
                            o = this.obj[cont];
                        } else {
                        }

		}

		return o;
	}*/
        
        public int tamanhoVetor(){
            return total;
        }

	private boolean verificaPosicao(int posicao) {
		return posicao >= 0 && posicao <= this.total;
	}
	
	private void aumentaVetor() {
		
		if(this.total == this.obj.length){
			
			Object[] newObject = new Object[this.obj.length*2];
			
			System.arraycopy(this.obj, 0, newObject, 0, this.obj.length);
			
			this.obj = newObject;
		}
		
	}

}
