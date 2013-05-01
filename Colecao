public class Colecao {
  private String elementos[];
	private int nElementos = 0;
	
	public Colecao(int tam){
		this.elementos = new String[tam];
	}
	public void add(String e){
		if(nElementos == elementos.length){
			novoArray();
		}
		elementos[nElementos]=e;
		nElementos++;
	}
	public void novoArray(){
		String outrosElementos[]= new String[elementos.length+30];
		for(int i=0;i<elementos.length;i++){
			outrosElementos[i]=elementos[i];
		}
		elementos = outrosElementos;
	}
	public String get(int posicao){
		return elementos[posicao];
	}
}
