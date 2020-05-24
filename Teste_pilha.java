package pilhas;
import java.util.Scanner;

public class Teste_pilha {

    public static void main(String[] args) {
    	Pilha_vetor p = new Pilha_vetor();
    	Scanner s = new Scanner (System.in);
    	System.out.println("Escreva uma frase:");
        String frase = s.nextLine();
        
        for (int i=0; i<frase.length(); i++) {
        	p.push(frase.charAt(i));	
        }  
    }
}