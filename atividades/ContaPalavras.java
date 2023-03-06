
package atividades;

/**
 *
 * @author Ricardo
 */
public class ContaPalavras {
    public static void main (String args[]){
        String frase = "O rato roel a roupa do rei";
        
        System.out.println("A frase possui "+frase.length()+" caracteres.");
        
        
        int nPalavras = frase.split(" ", -1).length - 1;
        System.out.println("A frase possui "+(nPalavras+1) + " palavtras");
    }
}
