package pilhas;

public class Pilha_ponteiro {

	    public NoP ini, fim;
	    public int tam, max;
	  
	    
	    public Pilha_ponteiro(){
	    	ini = null;
			fim = null;
			tam = 0;
			max = 1000;
	    }
	    
	    public Pilha_ponteiro( int t ){
	    	ini = null;
			fim = null;
			tam = 0;
			max = t;
	    }
	    
	    public int size(){
	        return tam;
	    }
	    
	    public void push( char e ){
	    	if (tam==0) {
	    		ini = new NoP(e);
	    		fim=ini;
	    		tam++;
	    	}
	    	else {
	    		NoP novo = new NoP(e, ini);
	    		ini = novo;
	    		tam++;
	    	}
	    }
	    
	    public char pop (){
	    	if (tam !=0) {
				char v = ini.info;
				ini = ini.prox;
				tam--;
				return v;
			}
			else {
				System.out.println("Lista vazia!!");
				return '?';
			}
	    }
	    
	    public char top (){
	    	if (tam!=0) {
				return ini.info;
			}
			else {
				System.out.println("Lista vazia!!");
				return '?';
			}
	    }
	    
	    public boolean underflow(){
	    	return tam==0;
	    }
	    
	    public boolean overflow(){
	    	return tam==max;
	    }
	    
	}

