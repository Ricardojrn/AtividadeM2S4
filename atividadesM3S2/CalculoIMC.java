package atividadesM3S2;
/**@author Ricardo
Pseudocódigo 1
    inicio
        var double peso, altura, imc;

        escreva(“Digite seu peso: ”);
        leia(peso)

        escreva(“Digite seu altura: ”);
        leia(altura)

        imc = peso / (altura * altura);
        escreva(“IMC: ”);
    fimAlgoritmo
 */
import java.util.Scanner;

public class CalculoIMC {    
    
    public static void main (String args[]){
        double peso, altura, imc;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite seu peso: ");
        peso = input.nextDouble();
        
        System.out.println("Digite sua altura: ");
        altura = input.nextDouble();
        
        imc = peso / (altura*altura);
        
        System.out.println("Seu IMC = "+imc);
    }
}
