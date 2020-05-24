package pilhas;
 public class Pilha_vetor {
	private int max, livre;
	private char vet[];
    
    public Pilha_vetor(){
    	max = 1000;
		vet = new char[1000];
		livre = 0;
    }
    
    public Pilha_vetor( int t ){
    	this.max = max;
		vet = new char[max];
		livre = 0;
    }
    
    public int size(){
        return livre;
    }
    
    public void push( char e ){
    	if (livre < max) {
			vet[livre] = e;
			livre++;
		} else
			System.out.println("Lista cheia!!!");
	}
     
    public char pop (){
    	if ( livre != 0 ) {
			livre--;
			return vet[livre];
		} else {
			System.out.println("Lista vazia !!!");
			return '?';
		}
    }
    
    public char top (){
    	if ( livre != 0 ) {
			return vet[livre-1];
		} else {
			System.out.println("Lista vazia !!!");
			return '?';
		}
    }
    	   
    public boolean underflow(){
    	return livre==0;
    }
    
    public boolean overflow(){
    	return livre==max;
    } 
}
	