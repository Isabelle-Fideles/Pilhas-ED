package pilhas;
public class NoP {
    
    public char info;
    public NoP prox;
    
    public NoP ( char v ){
        info = v;
        prox = null;
    }

    public NoP ( char v, NoP p ){
        info = v;
        prox = p;
    }
  
}
 