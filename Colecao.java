public class Colecao {
  private String elementos[];
	private int nElementos = 0;
	private static final int INCREMENTO = 20; 
	
	public Colecao(int tam) throws RuntimeException{
		if(tam < 0){
			throw new RuntimeException("TAMANHO INVÁLIDO! ");
		}
		this.elementos = new String[tam];
	}
	
	public void add(String e){
		if(nElementos == elementos.length){
			rendimencionar();
		}
		elementos[nElementos++]=e;
		
	}
	
	public void rendimencionar(){
		String outroArray[]= new String[elementos.length + INCREMENTO];
		for(int i = 0;i < elementos.length; i++){
			outroArray[i]=elementos[i];
		}
		elementos = outroArray;
	}
	
	public String getElemento(int posicao){
		if(posicao < 0 || posicao > elementos.length){
			throw new RuntimeException("POSIÇÃO INVÁLIDA!");
		}
		return elementos[posicao];
	}
	
	public void addInicio(String valor){
		addPosicao(valor,0);
		
		//for(int i=nElementos;i>0;i--){
			//elementos[i]=elementos[i-1];
		//}
		//elementos[0]=valor;
		//nElementos++;
	}
	
	public void addPosicao(String valor,int pos){
		if(nElementos == elementos.length){
			rendimencionar();
		}
		if((pos < 0) || (pos > nElementos)){
			throw new RuntimeException("POSIÇÃO INVÁLIDA! ");
		}
		for(int i= nElementos ;i > pos; i--){
			elementos[i]= elementos[i-1];
		}
		elementos[pos] = valor;
		++nElementos;
	}
	
	public int tamanhoArray(){
		return nElementos;
	}
	
	public void removerInicio(){
		for(int i = 0 ;i < nElementos; i++){
			elementos[i] = elementos[i+1];
		}
		nElementos--;
	}
	
	public void removerPosicao(int pos){
		if((pos < 0) || (pos > elementos.length)){
			throw new RuntimeException("POSIÇÃO INVÁLIDA!");
		}
		for(int i = pos; i < nElementos; i++){
			elementos[i]= elementos[i+1];
		}
		nElementos--;
	}
}
