package ifba.biblioteca.array;

import java.util.Arrays;

public class ArrayIFBA<C> {
    
    Object[] obj = new Object[2];
	int total = 0;

	public void adicionar(C o) {
		aumentarVetor();
		obj[this.total] = o;
		this.total++;
	}

	public void adicionarPorPosicao(int posicao, C obj) {
		aumentarVetor();
		if (!verificarPosicao(posicao)) {

			throw new IllegalArgumentException("posi��o inv�lida!");
		}

		for (int cont = this.total - 1; cont >= posicao; cont--) {

			this.obj[cont + 1] = this.obj[cont];

		}

		this.obj[posicao] = obj;

		this.total++;

	}
        
        public void removerPorPosicao(int posicao){
            aumentarVetor();
            if(!(posicao >= 0 && posicao < this.total)){
                throw new IllegalArgumentException("posi��o inv�lida!");
            }
            for(int cont = posicao; cont <= this.total; cont++){
                this.obj[cont] = this.obj[cont + 1];
            }
            this.total--;
        }

	public Object procurarPosicao(int p) {

		if (!verificarPosicao(p)) {

			throw new IllegalArgumentException("posi��o inv�lida!");
		}

		return this.obj[p];
	}
        
        public int tamanhoVetor(){
            return total;
        }
        
	public void listar() {

		System.out.println(Arrays.toString(this.obj));

	}
        
        private void aumentarVetor() {
		
		if(this.total == this.obj.length){
			
			Object[] newObject = new Object[this.obj.length*2];
			
			System.arraycopy(this.obj, 0, newObject, 0, this.obj.length);
			
			this.obj = newObject;
		}
		
	}

	private boolean verificarPosicao(int posicao) {
		return posicao >= 0 && posicao <= this.total;
	}
        
	
    
}
